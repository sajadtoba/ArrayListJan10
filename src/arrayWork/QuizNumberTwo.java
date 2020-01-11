package arrayWork;

public class QuizNumberTwo {
    public static void main(String[] args) {



    // Create in a java class integer array of size 6.
    // Then using a for loop, attempt to add the numbers 1-10 into that array

    // First we need to initialized the array

    int[] array = new int[6];
    // we are going to use simple for loop
    //for()  // I was getting the error message because I didn't created the Main Method
    // I went up and created the Main Method but was getting again error because
    // the curly braces was out of my for loop method



        try {
            for (int i = 0; i < 10; i++) {
                array[i] = i + 1;
                System.out.println(array[i]);
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("Array size is too low. Please reconsider the size");
        }
        System.out.println("Code after the try block");



//        for(int i = 0; i<10;i++) {
//        array[i] = i+1;
//        System.out.println(array[i]);
//    }

//    for(int i = 0;i < 10; i++){
//        array[i] = i+1;
//        System.out.println(array[i]);
//    }
} }
