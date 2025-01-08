import java.io.IOException;

public class InputProgram {
    public static void main(String[] args) {
        int x;
        System.out.println("Input a number");
        try { //the METHOD is READ
        x = System.in.read(); //console will WAIT for input
        //we convert x to char, short character
        //code for the number and the number itself
        System.out.println("code =" + x + " x =" + (char) x);

    } catch(IOException e)
    //compiler needs to know how to manage exceptional situations
     {
        e.printStackTrace(); //only the code of the given number will be read}
     }
    }
}
