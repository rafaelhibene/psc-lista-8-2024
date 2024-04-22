import java.util.Scanner;

public class Programa02 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um valor para n: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            imprimirLinha(i);
            System.out.println();  
        }
        
        scanner.close();
    }
    
    
    public static void imprimirLinha(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
    }
}
