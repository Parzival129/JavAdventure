import java.util.Scanner;
 
public class App {

    // User input & output function
    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
      }
    
    public static void main(String[] args) {
        System.out.println("howdy mate");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter username >> ");
        String userName = myObj.nextLine();  // Read user input

        System.out.println("you inputed: " + userName);

        switch (userName) {

            case "hello":
                System.out.println("hello was done");
                Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
                System.out.print("Enter username >> ");
                String userName2 = myObj2.nextLine();  // Read user input
        
                System.out.println("you inputed: " + userName2);
        
                switch (userName) {
        
                    case "hello":
                        System.out.println("hello was done");
                }
            }

    }
}