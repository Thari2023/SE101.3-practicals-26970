package com.mycompany.practicle_1;

public class Practicle_1_6 {

    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            System.out.print(x);
            System.out.print(", ");
        }
        System.out.print("\n");
        String[] names = {"kamal", "ravindu", "kavindu", "nimal"};
        for( String name : names) {
            System.out.print(name);
            System.out.print(", ");
        }

    }
}
