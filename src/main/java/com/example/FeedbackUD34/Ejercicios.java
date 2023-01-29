package com.example.FeedbackUD34;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import java.util.Random;

@SpringBootApplication
public class Ejercicios {

        public static void main(String[] args) {

            Ejercicios ejercicios= new Ejercicios();
            // ejercicios.triangulo();
            //ejercicios.printIn(4);
            //ejercicios.paralictiDesign();
            //ejercicios.printIn(4);
            //ejercicios.fechas();
            //ejercicios.numeros();
            //ejercicios.losnumeros();
            ejercicios.runnerArray();
        }
        //Ejercicio 1
        public void triangulo( ){

            Scanner sc = new Scanner(System.in);

            int lado1, lado2, lado3;

            System.out.print("Ingrese el valor del lado 1: ");
            lado1 = sc.nextInt();
            while (lado1 < 2 || lado1 > 20 || lado1 % 2 == 0) {
                System.out.print("Valor inválido. Ingrese un número impar entre 2 y 20: ");
                lado1 = sc.nextInt();
            }

            System.out.print("Ingrese el valor del lado 2: ");
            lado2 = sc.nextInt();
            while (lado2 < 2 || lado2 > 20 || lado2 % 2 == 0) {
                System.out.print("Valor inválido. Ingrese un número impar entre 2 y 20: ");
                lado2 = sc.nextInt();
            }

            System.out.print("Ingrese el valor del lado 3: ");
            lado3 = sc.nextInt();
            while (lado3 < 2 || lado3 > 20 || lado3 % 2 == 0) {
                System.out.print("Valor inválido. Ingrese un número impar entre 2 y 20: ");
                lado3 = sc.nextInt();
            }

            if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
                System.out.println("Los valores ingresados forman un triángulo.");
            } else {
                System.out.println("Los valores ingresados no forman un triángulo.");
            }
        }

        //Ejercicio 2
        public void printIn( int numero){
            for(int i = 0; i < numero; i++) {
                System.out.println();
            }
        }

        //Ejercicio 3
        public void paralictiDesign(){

            Scanner sc = new Scanner(System.in);

            int mayor, menor;

            System.out.print("Ingrese el numero mayor:");
            mayor = sc.nextInt();
            System.out.print("Ingrese el numero menor:");
            menor = sc.nextInt();

            for(int i = 0; i < menor; i++) {
                for(int j = 0; j < mayor; j++) {
                    if(j<(mayor-i)) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        //Ejercicio 4 es el mismo que el ejercicio 2

        //Ejercicio 5
        public void fechas( ){
            int dia1, mes1, anio1, dia2, mes2, anio2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la primera fecha (dd mm aaaa): ");
            dia1 = sc.nextInt();
            mes1 = sc.nextInt();
            anio1 = sc.nextInt();
            System.out.println("Ingrese la segunda fecha (dd mm aaaa): ");
            dia2 = sc.nextInt();
            mes2 = sc.nextInt();
            anio2 = sc.nextInt();

            if (anio1 < anio2 || (anio1 == anio2 && mes1 < mes2) || (anio1 == anio2 && mes1 == mes2 && dia1 < dia2)) {
                System.out.println("Fecha más antigua: " + dia1 + "-" + mes1 + "-" + anio1);
                System.out.println("Fecha más reciente: " + dia2 + "-" + mes2 + "-" + anio2);
            } else {
                System.out.println("Fecha más antigua: " + dia2 + "-" + mes2 + "-" + anio2);
                System.out.println("Fecha más reciente: " + dia1 + "-" + mes1 + "-" + anio1);
            }

            boolean esValida = true;
            if (mes1 < 1 || mes1 > 12 || mes2 < 1 || mes2 > 12) {
                esValida = false;
            } else if (dia1 < 1 || dia1 > 31 || dia2 < 1 || dia2 > 31) {
                esValida = false;
            } else if ((mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11) && dia1 > 30) {
                esValida = false;
            } else if (mes1 == 2) {
                if ((anio1 % 4 == 0 && anio1 % 100 != 0) || anio1 % 400 == 0) {
                    if (dia1 > 29) {
                        esValida = false;
                    }
                } else if (dia1 > 28) {
                    esValida = false;
                }
            }

        }

        //Ejercicio 6
        public void numeros(){
            Scanner scanner = new Scanner(System.in);
            int numero;

            do {
                System.out.print("Ingrese un número entre 20 y 50 (inclusive) e impar: ");
                numero = scanner.nextInt();
            } while (numero < 20 || numero > 50 || numero % 2 == 0);

            System.out.println("El número ingresado es válido: " + numero);
        }

        //Ejercicio 7, 8
        public void losnumeros(){

            int[] misNumeros = new int[10];

            Random random = new Random();

            for (int i = 0; i < misNumeros.length; i++) {
                misNumeros[i] = random.nextInt(101);
            }

            for (int numero : misNumeros) {
                System.out.println(numero);
            }

            valorMedio(misNumeros);
            paresEimpares(misNumeros);
            mayorYmenor(misNumeros);

        }

        //Ejercicio 9
        public void valorMedio(int[] misNumeros){
            int suma = 0;
            for (int numero : misNumeros) {
                suma += numero;
            }

            double valorMedio = (double)suma / misNumeros.length;
            System.out.println("Valor medio: " + valorMedio);
        }

        //Ejercicio 10
        public void paresEimpares(int[] misNumeros){
            int cantidadPares = 0;
            for (int numero : misNumeros) {
                if (numero % 2 == 0) {
                    cantidadPares++;
                }
            }

            int cantidadImpares = misNumeros.length - cantidadPares;
            System.out.println("Cantidad de números pares: " + cantidadPares);
            System.out.println("Cantidad de números impares: " + cantidadImpares);
        }
        //Ejercicio 11
        public void mayorYmenor(int[] misNumeros){
            int mayor = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;

            for(int i = 0; i < misNumeros.length; i++) {
                int num = misNumeros[i];
                if(num > mayor) {
                    mayor = num;
                }
                if(num < menor) {
                    menor = num;
                }
            }

            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);

        }
        //Ejercicio 12, 13 y 14
        public void runnerArray(){
            String bladeRunner = "Yo he visto cosas que vosotros no creeríais: Atacar naves en llamas más " +
                    "allá de Orión. He visto Rayos-C brillar en la oscuridad cerca de la puerta de Tannhäuser. " +
                    "Todos esos momentos se perderán en el tiempo... como lágrimas en la lluvia. Es hora de morir";

            char[] bladeRunnerArray = new char[bladeRunner.length()];

            for (int j = 0; j < bladeRunner.length(); j++) {
                bladeRunnerArray[j] = bladeRunner.charAt(j);

            }

            int countLetraA = cuentaLetras(bladeRunnerArray, 'a');
            System.out.println("The number of 'a' in bladeRunnerArray is: " + countLetraA);

            int countLetraE = cuentaLetras(bladeRunnerArray, 'e');
            System.out.println("The number of 'e' in bladeRunnerArray is: " + countLetraE);

            int countLetraI = cuentaLetras(bladeRunnerArray, 'i');
            System.out.println("The number of 'i' in bladeRunnerArray is: " + countLetraI);
        }

        //Ejercicio 15
        static int cuentaLetras(char[] texto, char letra){
            int count = 0;
            for (int i = 0; i < texto.length; i++) {
                if (texto[i] == letra) {
                    count++;
                }
            }
            return count;
        }


}





