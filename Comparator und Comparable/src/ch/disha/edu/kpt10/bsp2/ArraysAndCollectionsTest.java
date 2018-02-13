package ch.disha.edu.kpt10.bsp2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysAndCollectionsTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sebastian Würkner");
        list.add("Stefan Kiesel");
        list.add("Andreas Pries");
        list.add("Byte-Welt.de");
        list.add("Erich Gamma");
        list.add("Richard Helm");
        list.add("Ralph Johnson");
        list.add("John Vlissides");
        System.out.println("Unsortiert:" + "\n" + "#################");
        for(String n: list){

            System.out.println(n);
        }
        System.out.println("###########ENDE#############");


        Collections.sort(list);
        System.out.println("Sortiert:" + "\n" + "#################");
        for(String n: list){

            System.out.println(n);
        }
        System.out.println("###########ENDE#############");
    }
}
