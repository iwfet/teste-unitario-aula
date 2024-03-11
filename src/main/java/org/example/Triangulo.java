package org.example;

import java.util.Arrays;
import java.util.List;

public class Triangulo {


    private static List<Integer> decrescente(int a, int b, int c) {
        List<Integer> list = Arrays.asList(a, b, c);
        list.sort(Integer::compareTo);
        return list;
    }

    public static boolean verificaTringulo(int inA, int inB, int inC) {
        List<Integer> dec = decrescente(inA, inB, inC);
        int c = dec.get(0);
        int b = dec.get(1);
        int a = dec.get(2);

        boolean eTriangulo = (a >= b + c);

        if (eTriangulo) {
            System.out.printf("Não é um triangulo");
        }
        return eTriangulo;
    }

    public static boolean verificaTringuloRetangulo(int inA, int inB, int inC) {
        List<Integer> dec = decrescente(inA, inB, inC);
        int c = dec.get(0);
        int b = dec.get(1);
        int a = dec.get(2);

        boolean b1 = (a * a) == ((b * b) + (c * c));
        if (b1) {
            System.out.println("verificaTringuloRetangulo");
        }
        return b1;
    }

    public static boolean verificaTringuloObstangulo(int inA, int inB, int inC) {
        List<Integer> dec = decrescente(inA, inB, inC);
        int c = dec.get(0);
        int b = dec.get(1);
        int a = dec.get(2);

        boolean b1 = (a * a) > ((b * b) + (c * c));
        if (b1) {
            System.out.println("verificaTringuloObstangulo");
        }
        return b1;
    }

    public static boolean verificaTringuloAcutangulo(int inA, int inB, int inC) {
        List<Integer> dec = decrescente(inA, inB, inC);
        int c = dec.get(0);
        int b = dec.get(1);
        int a = dec.get(2);

        boolean b1 = (a * a) < (b * b) + (c * c);
        if (b1) {
            System.out.println("verificaTringuloAcutangulo");
        }
        return b1;
    }

    public static boolean verificaTringuloIsosceles(int inA, int inB, int inC) {
        List<Integer> dec = decrescente(inA, inB, inC);
        int c = dec.get(0);
        int b = dec.get(1);
        int a = dec.get(2);

        boolean b1 = (c == b && b != a);
        if (b1) {
            System.out.printf("verificaTringuloIsosceles");
        }
        return b1;
    }

    public static boolean verificaTringuloEquilatero(int inA, int inB, int inC) {
        List<Integer> dec = decrescente(inA, inB, inC);
        int c = dec.get(0);
        int b = dec.get(1);
        int a = dec.get(2);

        boolean b1 = (a == c && b == c);

        if (b1) {
            System.out.printf("verificaTringuloEquilatero");
        }
        return b1;
    }

    public static void verificaQualTipo(int a, int b, int c) {
        if (!verificaTringulo(a, b, c)) {
            verificaTringuloRetangulo(a, b, c);
            verificaTringuloObstangulo(a, b, c);
            verificaTringuloAcutangulo(a, b, c);
            verificaTringuloIsosceles(a, b, c);
            verificaTringuloEquilatero(a, b, c);
        }



    }

}
