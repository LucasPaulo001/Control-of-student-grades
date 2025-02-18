package mainCode;

import students.Students;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static students.Students.Aprovado;
import static students.Students.CalcularMedia;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Quantidade de alunos a serem cadastrados
        System.out.print("Quantos alunos serão cadastrados?");
        int quantStudents = sc.nextInt();

        //Criando lista de alunos
        List<Students> studentsList = new ArrayList<>();

        //Informando dados dos alunos
        String name = null;
        for (int i = 0; i < quantStudents; i++) {
            sc.nextLine();

            //Criando vetor para as notas
            Double[] notas = new Double[3];

            //Informando dados dos estudantes
            System.out.print("Nome do aluno: ");
            name = sc.nextLine();

            System.out.print("Matrícula: ");
            int matricula = sc.nextInt();

            //Informando as notas e armazenando no vetor
            for (int n = 0; n < notas.length; n++) {
                System.out.printf("Nota %d:", n + 1);
                notas[n] = sc.nextDouble();
            }
            //Criando objeto de estudantes e enviando o nome
            Students studentsData = new Students(name, matricula, notas);

            //Adicionando dados à lista
            studentsList.add(studentsData);
        }
        System.out.println("Lista de alunos cadastrados: \n");
        for(Students x: studentsList) {

            //Informando o nome do aluno
            System.out.println("Nome do aluno: " + x.name);

            //Percorrendo o array de notas
            for (int i = 0; i < x.notas.length; i++) {
                System.out.printf("Nota %d: %.2f\n", i + 1, x.notas[i]);
            }

            //Informando a matrícula do aluno
            System.out.println("Matrícula do aluno: " + x.matricula);

            //Informando as médias
            double media = CalcularMedia(x.notas);
            System.out.printf("Média do aluno: %.2f\n", media);

            //Informando se o aluno está aprovado ou não
            boolean isAprovado = Aprovado(media);
            if(isAprovado == true){
                System.out.print("---Aprovado!!---\n\n");
            }
            else{
                System.out.print("---Reprovado!!---\n\n");
            }
        }

        sc.close();
    }
}