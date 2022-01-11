package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = tec.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = tec.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        float dividir = dividir(a, b);

        System.out.println("Soma: " + somar);
        System.out.println("Subtração: " + subtrair);
        System.out.println("Multiplicação: " + multiplicar);
        System.out.printf("Divisão: %.2f", dividir);



    }

    public static int somar( int a, int b){
        return a + b;
    }

    public static int subtrair( int a, int b){
        return a - b;
    }
    public static int multiplicar( int a, int b){
        return a * b;
    }
    public static float dividir( float a, float b){
        return a / b;
    }

}
