package arrayWork;

import java.util.ArrayList;

public class UseofArrayList {
    public static void main(String[] args) {

        //int[] array = new int[6];

        //ArrayList<Integer> listFromMom = new java.util.ArrayList<>(); // there is Error message becasue the class name is the same ArrayList
        // ArrayList is the java key word. So for class name and the java key word never ever the same.
        // for example the ArrayList or Scanner   that way we cannot import the java utilities.
        //java.util.ArrayList<String> listFromMom = new java.util.ArrayList<>();  never ever the same name as class name.

        //int[] array = new int[6];

        ArrayList<Integer> newArray = new ArrayList<>();


        try {
            for (int i = 0; i < 10; i++) {
                newArray.add(i+1);
                System.out.println(newArray.get(i));
            }

        } catch(ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("array size is too low, Please the size");
        }
        System.out.println("Code after the try block");










    }

}
