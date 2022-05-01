package metier;

import dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{

    private Idao idao;

    public MetierImpl(Idao idao) {
        this.idao = idao;
    }

    @Override
    public double calcule() {
        double tmp=idao.getData();
        double res=tmp*54/Math.cos(tmp*Math.PI);
        return res;
    }

    public void setIdao(Idao idao) {
        this.idao = idao;
    }
}
