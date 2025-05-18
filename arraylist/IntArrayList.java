package arraylist;

import java.util.ArrayList;

public class IntArrayList {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(5);
        numeros.add(50);
        numeros.add(45);

        for (Integer o : numeros){
            System.out.println(o);
        }

    }
}
