package br.ufsm.csi.pp.aula01;

import java.util.ArrayList;
import java.util.List;

public class Aula {

    public static void main(String[] args) {

        //int i = 0;
        List<Integer> list = new ArrayList<>();
        list.add(2);
        //m1(i);
        m2(list);
        String s = "1";
        m1(s);
        //System.out.println(i);
        //System.out.println(list.size());
        System.out.println(s);

    }

    private static void m1(int num) {
        num++;
    }

    private static void m2(List<Integer> num) {

    }

    private static void m1(String s) {
        s = s + "1";
    }

}
