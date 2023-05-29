import java.util.Scanner;

/**
 * Troco:
 * A program that helps the user count his change.
 * The program should ask how many €0.50 coins the user has,
 * then how many €0.20 coins,
 * then how many €0.10 coins,
 * then how many €0.05 coins,
 * then how many €0.02 coins,
 * and Finally, how many coins €0.01.
 * The program must presente how many money the user has, in euros
 */

public class Troco {
    public static void main(String[] args) {
        int num50CentsCoins;
        int num20CentsCoins, num10CentsCoins;
        int num5CentsCoins, num2CentsCoins, num1CentsCoins;

        Scanner stdin =  new Scanner(System.in);

        System.out.print("Nº de moedas de 50 cents: ");
        num50CentsCoins = stdin.nextInt();
        System.out.print("Nº de moedas de 20 cents: ");
        num20CentsCoins = stdin.nextInt();
        //...
        
        System.out.printf("Os meus trocos somam: %,1.2f Eur%n", (num50CentsCoins * 0.5 
                                                    + num20CentsCoins * 0.2));
    }

}