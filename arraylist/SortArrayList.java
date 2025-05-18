package arraylist;

import java.util.ArrayList;

import java.util.Collections;
public class SortArrayList {
    public static void main(String[] args){
        ArrayList<String> estudiantes = new ArrayList<String>();
        estudiantes.add("zamuel");
        estudiantes.add("Ricardo");
        estudiantes.add("Alejandro");
        estudiantes.add("Felipe");

        //Clase collections con metodo sort para ordernar alfabetico y nnumerico
        Collections.sort(estudiantes);

        for(String estudiante: estudiantes){
            System.out.println(estudiante);
        }

        ArrayList<Integer> edades = new ArrayList<Integer>();
        edades.add(22);
        edades.add(25);
        edades.add(20);
        edades.add(18);

        Collections.sort(edades);
        for(Integer edad : edades){
            System.out.println(edad);
        }


    }
}
