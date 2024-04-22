import java.util.Scanner;

public class Programa05 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o custo do item (sem imposto): ");
        double custo = scanner.nextDouble();
        
        System.out.print("Digite a taxa de imposto (em porcentagem): ");
        double taxaImposto = scanner.nextDouble();
        
        double novoCusto = somaImposto(taxaImposto, custo);
        
        System.out.println("O novo custo do item, incluindo o imposto, é: R$ " + novoCusto);
        
        scanner.close();
    }
    
    
    public static double somaImposto(double taxaImposto, double custo) {
        
        double imposto = (taxaImposto / 100) * custo;
        
        
        double novoCusto = custo + imposto;
        
        return novoCusto;
    }
}