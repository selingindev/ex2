import java.util.Scanner;

class HelloWorld {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ex10();
    }

    public static void ex1() {
        // Imprima os valores inteiros entre 10 e 100.
        for (int i = 10; i <= 100; i++) {
            System.out.println(i);
        }
    }

    private static void ex2() {
        // Imprima a tabuada do 3.
        for (int i = 1; i <= 10; i++) {
            System.out.println(3 * i);
        }
    }

    private static void ex3() {
        // Leia um número e imprima sua tabuada.
        int valorUser = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(valorUser * i);
        }

    }

    private static void ex4() {
        // teste de mesa
    }

    private static void ex5() {
        // Refaça os códigos do ex. anterior utilizando WHILE ao invés de FOR.
        int n = 0;
        int i = 3;
        while (i < 7) {
            n = n + i;
        }
        System.out.println(n);
    }

    private static void ex6() {
        // Leia 5 valores e imprima a soma deles.
        int contador = 0;
        for (int i = 1; i <= 5; i++) {
            int valoresUser = scanner.nextInt();
            contador = contador + valoresUser;
        }
        System.out.println(contador);
    }

    private static void ex7() {
        // Leia n valores (esse número deve ser perguntado) e imprima a MÉDIA deles.

        double soma = 0;
        int numero = scanner.nextInt();
        for (int i = 1; i <= numero; i++) {
            int valorUser = scanner.nextInt();
            soma = soma + valorUser;
        }
        double media = soma / numero;
        System.out.println(media);
    }

    private static void ex8() {
        // Leia 5 valores e imprima quantos deles são negativos.
        int contadorNegativo = 0;
        System.out.println("Digite valores e veja quantos negativos foram digitados");
        for (int i = 1; i <= 5; i++) {
            int valoresNegativo = scanner.nextInt();
            if (valoresNegativo < 0) {
                contadorNegativo++;
            }
        }
        System.out.println("Voce digitou " + contadorNegativo + " valores negativos");
    }

    private static void ex9() {
        // 9. Vá lendo valores inteiros até que o número 0 seja digitado.
        while (true) {
            int valorUser = scanner.nextInt();
            if (valorUser == 0) {
                break;
            }
        }
    }

    private static void ex10() {
        // Leia um número e imprima seu fatorial.
        int fatorial = 1;
        int valor = scanner.nextInt();
        for (int i = 1; i <= valor; i++) {
            fatorial *= i;
        }
        System.err.println(fatorial);

    }

    private static void ex11() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ex11'");
    }

    private static void ex12() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ex12'");
    }
}
