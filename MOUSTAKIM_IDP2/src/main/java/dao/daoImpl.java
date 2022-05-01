package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class daoImpl implements Idao {
    @Override
    public double getData() {
        double temp=Math.random()*50;
        return temp;
    }
}
