package arraylist;

import java.util.ArrayList;


public class LoopArrayList {
    public static void main(String[] args){
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Alejandro");
        nombres.add("Brandy");
        nombres.add("Odin");
        nombres.add("gaby");

        System.out.println(nombres.size());

        //recorrer ArrayList con for
        for (int f = 0;f < nombres.size();f++){
            System.out.println(nombres.get(f));
        }

        //recorrer un ArrayList con for-each
        for(String v : nombres){
            System.out.println(v);
        }

    }
}
