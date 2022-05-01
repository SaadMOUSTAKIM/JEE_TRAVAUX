package Pres;

import dao.Idao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws Exception{
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        Idao dao=(Idao) cDao.newInstance();


        String matierClassName=scanner.nextLine();
        Class cMetier=Class.forName(matierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();

        Method method=cMetier.getMethod("setIdao",Idao.class);
        method.invoke(metier,dao);

        System.out.println(metier.calcule());

    }
}
