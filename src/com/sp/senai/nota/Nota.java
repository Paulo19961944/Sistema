package com.sp.senai.nota;
import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /** Transforma em Loop Infinito */
        boolean form = true;
        /** Validação */
        while (form) {
            System.out.print("Digite o Curso: ");
            String curso = teclado.next();

            System.out.print("Digite o nome do Professor: ");
            String nomeProf = teclado.next();

            /** Verifica a Frequencia */
            System.out.print("Quantos dias o aluno cursou?: ");
            float diasCursados = teclado.nextFloat();
            float diasTotais = 100;

            /** Verifica a nota */
            System.out.print("Qual é a Primeira Nota: ");
            float nota1 = teclado.nextFloat();

            System.out.print("Qual a Segunda Nota: ");
            float nota2 = teclado.nextFloat();

            if ((diasCursados >= 75 && (nota1 + nota2) / 2 >= 7) || (diasCursados >= 90 && (nota1 + nota2) / 2 >= 6)) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
            /** Calcula a Porcentagem de Dias Cursados */
            float porcentagem = (diasCursados / diasTotais) * 100;
            float mediaNota = (nota1 + nota2) / 2;
            System.out.println();
            System.out.println("A porcentagem de Presença e: " + porcentagem + "%");
            System.out.println("A media da nota é: " + mediaNota);

            /** Verifica se quer continuar ou não */
            System.out.println("Caso deseje encerrar digite N:, Caso deseje continuar, digite qualquer outra letra: ");
            String opcao = teclado.next();
            if (opcao.equalsIgnoreCase("N")) {
                form = false;
            }
        }
    }
}
