package tarea_1;

import java.util.Scanner;

public class Tarea_2 {

    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menú principal");
            System.out.println("1.- Binario a decimal");//Ejercicio 1
            System.out.println("2.- Decimal a binario");//Ejercicio 2, 4, 5
            System.out.println("3.- Hexadecimal a decimal");//Ejercicio 6, 7
            System.out.println("4.- Octal a decimal");//Ejercicio 3
            System.out.println("0.- Salir");
            System.out.print("Ingrese su opción > ");
            opcion = sc.nextInt();
            System.out.println("");
            System.out.print("  ");
            switch (opcion) {
                case 1:
                    int eje1 = convertirBinarioADecimal("101111");
                    System.out.println("1. Pasar al Sistema decimal el número 101111 (2): " + eje1);
                    break;
                case 2:
                    String eje2 = convertirDecimalABinario(27025);
                    System.out.println("2. Pasar el número 27025 a binario: " + eje2);
                    System.out.print("  ");
                    String eje4 = convertirDecimalABinario(64);
                    System.out.println("4. 64(10) = " + eje4 + "(2)");
                    System.out.print("  ");
                    String eje5 = convertirDecimalABinario(145);
                    System.out.println("5. 145(10) = " + eje5 + "(2)");
                    break;
                case 3:
                    int eje6 = convertirHexadecimalADecimal("C");
                    System.out.println("6. C(16) = " + eje6 + "(10)");
                    System.out.print("  ");
                    int eje7 = convertirHexadecimalADecimal("ABCD");
                    System.out.println("7. ABCD(16) = " + eje7 + "(10)");
                    break;
                case 4:
                    int eje3 = convertirOctalADecimal("42");
                    System.out.println("3. 42(8) = " + eje3 + "(10)");
                    System.out.print("  ");
                    break;
                case 0:
                    System.out.println("Salió del sistema");
                    break;
                default:
                    System.out.println("Opción inválida");
                    System.out.println("");
            }
            System.out.println("");
        } while (opcion != 0);

        //Leer un número por teclado y comprobar que es binario
        
    }
    //Método para binario a decimal    
    public static int convertirBinarioADecimal(String binario) {
        return Integer.parseInt(binario, 2);
    }
    //Método para decimal a binario
    public static String convertirDecimalABinario(int decimal) {
        return Integer.toBinaryString(decimal);
    }
    //Método para octal a decimal
    public static int convertirOctalADecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }
    //Método para hexadecimal a decimal
    public static int convertirHexadecimalADecimal(String hexadecimal) {
        return Integer.parseInt(hexadecimal, 16);
    }
}
