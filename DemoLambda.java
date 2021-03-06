/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8;

/**
 *
 * @author quach
 */
interface Demo {

    public void show();

}

interface Summary {

    public void sum(int numA, int numB);
}

public class DemoLambda {

    public static void main(String[] args) {

        Demo d = () -> {
            System.out.println("Quach Hong Thu!");
        };

        Summary s = (numA, numB) -> {
            System.out.println(numA + numB);
        };
        s.sum(100, 28);
        d.show();

        Runnable r = () -> System.out.println("Quach Hong Thu!!");
        Thread t = new Thread(r);
        t.start();

        new Thread(() -> System.out.println("Quach Hong Thu!!!")).start();
    }

}
