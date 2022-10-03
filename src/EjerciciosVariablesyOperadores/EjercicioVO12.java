package EjerciciosVariablesyOperadores;

import java.util.Scanner;

public class EjercicioVO12 {
    public static void main(String[] args) {
        /*Escribe un programa que lea un número de tres cifras y muestre el número invertido.
Por ejemplo: si introducimos el número 320, el programa debe mostrar 23; si
introducimos 976, el programa debe mostrar 679.
         */
            Scanner sc = new Scanner(System.in);
            int numero = sc.nextInt();
            int numero2 = numero/100;
            int numero3 = (numero%100)/10;
            int numero4 = ((numero%100)%10)%10;
            System.out.println("la inversion es " + numero4 + numero3 + numero2);
        }
    }
