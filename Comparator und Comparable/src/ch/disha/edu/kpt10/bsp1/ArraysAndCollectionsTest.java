package ch.disha.edu.kpt10.bsp1;


import java.util.Arrays;

public class ArraysAndCollectionsTest {
    public static void main(String[] args) {
        int[] unsorted = {5,3,21234,45642,576232343,331,89};
        System.out.println("Unsortiert:" + "\n" + "#################");
        for(int d: unsorted){

            System.out.println(d);
        }
        System.out.println("###########ENDE#############");

        Arrays.sort(unsorted);
        System.out.println("Sortiert:" + "\n" + "#################");
        for(int d: unsorted){

            System.out.println(d);
        }
        System.out.println("###########ENDE#############");
    }
}
