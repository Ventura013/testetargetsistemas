package targetsistemas;

import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase para inverter: ");
        String palavra = sc.nextLine();
        String palavraInvertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }

        System.out.println("Palavra invertida: " + palavraInvertida);

        sc.close();
    }
}