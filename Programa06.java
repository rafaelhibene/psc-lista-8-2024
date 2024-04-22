import java.util.Scanner;

public class Programa06 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char continuar = 'S';
        
        while (continuar == 'S' || continuar == 's') {
            System.out.print("Digite a hora (formato 24 horas): ");
            int hora = scanner.nextInt();
            
            System.out.print("Digite os minutos: ");
            int minutos = scanner.nextInt();
            
            String resultado = converterPara12Horas(hora, minutos);
            
            System.out.println("Hora convertida: " + resultado);
            
            System.out.print("Deseja continuar? (S/N): ");
            continuar = scanner.next().charAt(0);
        }
        
        scanner.close();
    }
    
    
    public static String converterPara12Horas(int hora, int minutos) {
        String periodo;
        
        if (hora >= 0 && hora < 12) {
            periodo = "A.M.";
        } else {
            periodo = "P.M.";
        }
        
        if (hora == 0) {
            hora = 12;  
        } else if (hora > 12) {
            hora = hora - 12; 
        }
        
        return hora + ":" + minutos + " " + periodo;
    }
}
