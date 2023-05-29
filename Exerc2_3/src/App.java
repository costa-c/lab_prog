import java.util.Scanner;

/**
 * A program that asks the user's name, and then greets the user by name. 
 * Before outputting the user's name, convert it to upper case letters.
 */
public class App {
    public static void main(String[] args) {
        String name;

        Scanner stdin = new Scanner(System.in); 

        System.out.print("Introduza o seu nome: ");
        name = stdin.nextLine();
        
        //System.out.println("Olá, " + name.toUpperCase() + ", prazer em conhecê-lo!");
        System.out.printf("Olá, %s, prazer em conhecê-lo!%n", name.toUpperCase());
    }
}
