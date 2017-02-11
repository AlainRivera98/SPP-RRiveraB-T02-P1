//Nombre: Roberto Alain Rivera Bravo
//Matrícula: A01411516
//Carrera: IMT11

package spp.rriverab.t02.p1;
import java.util.Scanner;

public class SPPRRiveraBT02P1 {

    public static void main(String[] args) {
        menu();
    }
    
    static void menu(){
        Scanner teclado = new Scanner (System.in);
        double y, sue, pago;
        int cate, he;
        
        System.out.println("\n\n<<Calculador de pagos a trabajadores>>");

        
            System.out.println("\nIntroduzca el sueldo básico del trabajador:");
            sue = teclado.nextDouble();

            System.out.println("\nIntroduzca la categoría del trabajador");
            cate = teclado.nextInt();
            
            if(cate<1 || cate>8){
                System.out.println("\nValor no válido");
                salir();
            }
        
            y = (2*(Math.pow(cate, 3))-6*(Math.pow(cate, 2))+28*cate +66)/3;
            
            System.out.println("\nIntroduzca las horas extra que el trabajador realizó:");
            he = teclado.nextInt();
            
            pago = sue + he*y;
            
            System.out.println("\nEl pago al trabajador debe ser de:\n" + pago);
            
            salir();

        
    }
    
    static void salir(){
        Scanner teclado = new Scanner (System.in);
        String letra;
        
        System.out.println("\n¿Desea continuar?");
        System.out.println("No. Presione E");
        System.out.println("Sí. Presione cualquier otra tecla");
        letra = teclado.nextLine();
        
        if(letra.equals("E")){
            System.exit(0);
        } 
        menu();
    }
  
    
}
