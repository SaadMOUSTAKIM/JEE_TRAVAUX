package Pres;

import dao.daoImpl;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        daoImpl dao=new daoImpl();
        MetierImpl metier=new MetierImpl(dao);
        //metier.setIdao(dao);
        System.out.println(metier.calcule());
    }

}
