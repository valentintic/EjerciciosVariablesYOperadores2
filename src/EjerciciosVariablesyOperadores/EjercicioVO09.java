package EjerciciosVariablesyOperadores;

import java.util.Scanner;

public class EjercicioVO09 {

        /*Escribe un programa que calcule (y muestre) cuántas horas, minutos y segundos han
    transcurrido entre dos momentos del mismo día. Para ello, el programa ha de pedir
    por teclado seis números enteros: las horas, minutos y segundos para el momento
    inicial y lo mismo para el momento final. De momento vamos a considerar que los
    números introducidos van a estar en el rango adecuado y que el momento inicial
    introducido es menor (o igual) que el momento final. Por ejemplo, si se introducen
    los números 1, 2, 30,15, 21, 1 entenderemos que el momento inicial es 1:02:30 am y
    el momento final es 15:21:1. El programa debe mostrar por pantalla la diferencia en
    el formato: hh:mm:ss.
         */
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Momento inicial");
            System.out.println("================");
            System.out.println("Introduce la hora de entrada");
            int numero1 = sc.nextInt();
            System.out.println("Introduce los minutos de entrada");
            int numero2 = sc.nextInt();
            System.out.println("Introduce los segundos de entrada");
            int numero3 = sc.nextInt();

            System.out.println("Momento final: ");
            System.out.println("================");
            System.out.println("Introduce la hora");
            int numero4 = sc.nextInt();
            System.out.println("Introduce los minutos");
            int numero5 = sc.nextInt();
            System.out.println("Introduce los segundos");
            int numero6 = sc.nextInt();

            System.out.println("Datos introducidos: momento inicial: " + numero1 + ":" + numero2 + ":" + numero3 + "    " + " momento final: " + numero4 + ":" + numero5 + ":" + numero6);

            /* aqui comienza la operacion final */

            int num, seg, min, hor;
            int hora1 = numero1 * 3600;
            int min1 = numero2 * 60;
            int seg1 = numero3;
            int hora2 = numero4 * 3600;
            int min2 = numero5 * 60;
            int seg2 = numero6;
            int segundos = (hora2 + min2 + seg2) - (hora1 + min1 + seg1);
            int horasfinales = segundos/3600;
            int minutosfinales = (segundos - (3600*horasfinales)) / 60;
            int segundosfinales = segundos - ((horasfinales * 3600)+ (minutosfinales * 60));
            System.out.println(" La diferencia de momento es " + horasfinales + ":" + minutosfinales + ":" + segundosfinales);




        }
    }
