import java.util.Scanner;

public class supermercado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Terca PREMIADA! todo cupom fiscal cujo indentificador for multiplo de 3 ganha desconto o caixa");

        System.out.printf("Digite um numero ");
        int numCupom = scanner.nextInt();
        scanner.nextLine();

        int mult = 0;


        for (int i = 1; i < numCupom; i++){
            if (i %3 == 0) {
                mult++;
                System.out.println("de 0 a " + numCupom + " tem " + mult + " numeros multiplos " + i);
            }

        }




    }
}
