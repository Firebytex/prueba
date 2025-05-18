package arraylist;

import java.util.ArrayList;

public class ArrayListAdd {
    public static void main(String[] ags){
        ArrayList<String> carros = new ArrayList<String>();


        //añadir elementos al ArrayList
        carros.add("Volvo");
        carros.add("Mazda");
        carros.add("Maseratti");
        carros.add("Bugatti");

        //añadir en indice especifico
        carros.add(0,"Toyota");
        System.out.println(carros);

        //obtener el elemento maserati su indice es (3)
        System.out.println(carros.get(3));

        //cambiar el elemento (usamos el metodo set)
        carros.set(1,"VolvoCambiado");
        System.out.println(carros.get(1));

        //eliminar un elemento del ArrayList usando metodo remove()
        carros.remove(1);


        //obtener tamaño del ArrayList
        System.out.println(carros.size());

        carros.clear();
        System.out.println(carros);



    }
}
