import java.util.Scanner;

public class Programa03 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite três números inteiros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        int resultado = somaTresNumeros(num1, num2, num3);
        
        System.out.println("A soma dos três números é: " + resultado);
        
        scanner.close();
    }
    
    
    public static int somaTresNumeros(int a, int b, int c) {
        return a + b + c;
    }
}