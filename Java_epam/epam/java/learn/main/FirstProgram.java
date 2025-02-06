package epam.java.learn.main;

public class FirstProgram {
    //the entry point to compile and run is the MAIN method
    public static void main(String[] args)
    //PUBLIC means it's visible to the compiler and can be called
    //STATIC means you don't need to create a class object to run it
    //VOID means that the method does not return values
    //all organized into an array
    { //println means that after calling this line, an transition to the next will be made
        System.out.println("hello");
        System.out.print(42); //no Line Break
        System.out.print("NoLineBreak");
        System.out.print("\n"+ 42 + "\n"); //line break with \n
        System.out.print("\t"+ "tab"); //tab as 4 spaces
        System.out.print("\n\tjava" + 16); //putting all together

    }
}
