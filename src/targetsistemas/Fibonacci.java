package targetsistemas;

import java.util.Scanner;

public class Fibonacci {
	
    public static void main(String[] args) { 
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe um número inteiro: ");
        int numero = sc.nextInt();

        boolean pertence = false;
        int a = 0, b = 1, c = 1;
        while (c < numero) {
            c = a + b;
            a = b;
            b = c;
        }
        if (c == numero) {
            pertence = true;
        }

        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
        sc.close();
    }
    
}

