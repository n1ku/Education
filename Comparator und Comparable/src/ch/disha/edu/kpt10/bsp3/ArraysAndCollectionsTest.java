package ch.disha.edu.kpt10.bsp3;

import java.util.Arrays;

public class ArraysAndCollectionsTest {
    public static void main(String[] args) {
        Bier[] bier = {
                new Bier("Zguet","Scahweiz",0.25F),
                new Bier("Sonnenbräu","Schweiz(SG)",0.33F)
        };

        System.out.println("Unsortiert:" + "\n" + "#################");
        for(Bier b: bier){

            System.out.println(b);
        }
        System.out.println("###########ENDE#############");

        Arrays.sort(bier);
        System.out.println("Sortiert:" + "\n" + "#################");
        for(Bier b: bier){

            System.out.println(b);
        }
        System.out.println("###########ENDE#############");
    }
}
