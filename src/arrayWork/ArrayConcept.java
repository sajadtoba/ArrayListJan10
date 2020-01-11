package arrayWork;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayConcept {
    // it should be inside the main method not outside the main method

    //ArrayList<String> ar2 = new ArrayList<>();
    public static void main(String[] args) {
        // Created the two ArrayList and then iterator one with another to print the all

        ArrayList<String> listFromMom = new ArrayList<>();
        listFromMom.add("Fiza");
        listFromMom.add("p");
        listFromMom.add("mom Megan");
        listFromMom.add("OLive");
        listFromMom.add("uncle Bashar urf Morli");
        listFromMom.add("Morlie bajao uncle");
        //Create another array with only list Samina wants to buy today grocessary
        // we can create another object along with the Arraylist
        // Data type  generic or diamond brackets inside we need to define what data we want to retrieve
        ArrayList<String > listFromSamina = new ArrayList<>();
        listFromSamina.add("Vegetab;es");
        listFromSamina.add("Fruits");
        listFromMom.add("dry fruit");
        listFromSamina.add("Diary Products");
        listFromMom.addAll(listFromSamina);
        // Time to use the iterator
        // Iterator is a java key word to print out all the values.
        Iterator itr = listFromMom.iterator();


        System.out.println( "...................Remove All ..........");
        //listFromMom.removeAll(listFromSamina);
        Iterator itr2 = listFromMom.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }






//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//            while (itr.hasNext()) {
//                System.out.println(itr.next());
//            }
//            while (itr.hasNext()) {
//                System.out.println(itr.next());
//            }
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

        //System.out.println(itr);
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

        //while (itr.hasNext()) {
            //System.out.println(itr.next());
        //}





//        ArrayList<String > ar2 = new ArrayList<>();
//
//        ar2.add("Fiaz");
//        ar2.add("Saj");
//        ar2.add("p");
//        ar2.add("poi");
//        ar2.add("67");
//        ar2.add("Afsana");
//
//        ArrayList<String> listFromMom  = new ArrayList<>();
//        listFromMom.add("Aunt Marry");
//        listFromMom.add("Aunt Jammy");
//        listFromMom.add("Mrs. Hudson");
//
//        ArrayList<String> listFromSamina = new ArrayList<>();
//
//        listFromSamina.add("Fahran");
//        listFromSamina.add("Root");
//        listFromSamina.add("Fiaz Vai");
//
//        listFromMom.addAll(listFromSamina);
//        Iterator itr = listFromMom.iterator();
//        while(itr.hasNext()) {
//            System.out.println(itr.next()); }






        //ar2.add(76); // Error message because we are working on the ArrayList<String>


//        if(ar2.contains("poi")){
//            System.out.println("he is inside the ArrayList");
//        } else {
//            System.out.println("he is not");

//        if(ar2.contains("Fiaz")){
//            System.out.println("Fiz is go");
//        }else {
//            System.out.println("he is not");
//        }

//        if(ar2.contains("Afsana")) {
//            System.out.println("She is with the Arraylist");
//
//        }else {
//            System.out.println("She is not");
//        }

//        if(ar2.contains("Afsana")) {
//            System.out.println("Afsana joined");
//        } else {
//            System.out.println("Afsana didn't");
//        }















//    public static void main(String[] args) {
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(34);
//        list1.add(78);
//        list1.add(90);
//        list1.add(78);
//        list1.add(23);
//        for (int i = 0; i < list1.size(); i++){
//            System.out.println(list1.get(i));
//            System.out.println(list1.size());
//            System.out.println(list1.size());
//            list1.add(2000);
//            list1.remove(2);
//        }

//        for (int i = 0; i < list1.size(); i++){
//            System.out.println(list1.get(i));
//        }


//        for(int i = 0; i < list1.size(); i++)
//        {
//            System.out.println(list1.get(i));

//        for( int i = 0; i< list1.size(); i++){
//            System.out.println(list1.get(i));
//        }
        //for(int i = 0; i < list1.size(); i++)
          //  System.out.println(list1.get(i));
//        for (int i = 0; i < list1.size(); i++){
//            System.out.println(list1.get(i));
//        }












//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(12);
//        list1.add(23);
//        list1.add(43);
//        list1.add(9);
//        list1.add(98);
//        System.out.println( list1.get(4));
//        System.out.println(list1.size());















//        ArrayList ar1 = new ArrayList();
//        ar1.add(30);
//        ar1.add("saloo");
//        ar1.add(90);
//        ar1.add('w');
//        ar1.add(87);
//        ar1.add(45.90);
//        for(int i = 0; i < ar1.size(); i ++)
//        {
//            System.out.println(ar1.get(i));
//        }










    }
//       ArrayList ar1 = new ArrayList();
//
//       ar1.add(20);
//       ar1.add("Sajad");
//       ar1.add(50);
//       ar1.add('F');
//
//       for(int i = 0; i < ar1.size(); i++){
//           System.out.println(ar1.get(i));
//       }
//
//    }






}
