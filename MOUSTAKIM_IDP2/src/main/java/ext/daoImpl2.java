package ext;

import dao.Idao;

public class daoImpl2 implements Idao {
    @Override
    public double getData() {
        System.out.println("Version capteur");
        double temp=5000;
        return temp;
    }
}
