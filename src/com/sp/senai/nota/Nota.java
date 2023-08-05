package com.sp.senai.nota;
import java.util.Scanner;
public class Nota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /** Validação */
        System.out.print("Digite o Curso: ");
        String curso = teclado.next();

        System.out.print("Digite o nome do Professor: ");
        String nomeProf = teclado.next();

        System.out.print("Digite a Quantidade de Alunos");
        int qtdeAlunos = teclado.nextInt();

        /** Verifica a Frequencia */

        System.out.print("Quantos dias o aluno cursou?: ");
        int diasCursados = teclado.nextInt();
        int diasTotais = 100;

        /** Verifica a nota */
        System.out.print("Qual é a Primeira Nota: ");
        float nota1 = teclado.nextFloat();

        System.out.print("Qual a Segunda Nota:");
        float nota2 = teclado.nextFloat();

        if ((diasCursados >= 75 && (nota1 + nota2 / 2 >= 7) || (diasCursados >= 90) && (nota1 + nota2 /2 >= 6))){
                System.out.println("Aprovado");
            }
            else {
                System.out.println("Reprovado");
            }
        }

    }

