import java.util.Scanner;

public class Programa04 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        char resultado = verificarPositivoNegativo(numero);
        
        System.out.println("O número é: " + resultado);
        
        scanner.close();
    }
    
   
    public static char verificarPositivoNegativo(int num) {
        if (num > 0) {
            return 'P'; 
        } else if (num < 0) {
            return 'N';  
        } else {
            return '0'; 
        }
    }
}