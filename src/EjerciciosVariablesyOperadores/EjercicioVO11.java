package EjerciciosVariablesyOperadores;

import java.util.Scanner;

public class EjercicioVO11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int numero2 = numero/10;
        int numero3 = numero%10;
        System.out.println("El resultado es: " + numero3 + numero2);
    }
    }
