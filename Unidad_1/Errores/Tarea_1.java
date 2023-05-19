package tarea_1;

public class Tarea_1 {

    public static void main(String[] args) {
        //Se definen la variables
        double a = 0.50 * Math.pow(10, 2); 
        double aR = 0.51 * Math.pow(10, 2);

        //Se calculan los errores
        double errorAbsoluto = Math.abs(a - aR); //Math.abs para usar la función absoluta
        double errorRelativo = errorAbsoluto / Math.abs(a);
 
        //Se imprimen los resultados
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de a*: " + aR);
        System.out.println("\nError absoluto: " + errorAbsoluto);
        System.out.println("Error relativo: " + errorRelativo);
    }
    
}
