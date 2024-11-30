package application;

import entity.Aluno;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno[] quartos = new Aluno[10];
        System.out.print("How many rooms will be rented? ");
        int qtdAlunos = sc.nextInt();
        System.out.println();
        sc.nextLine();

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("Rent #" + (i+1)+":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            Aluno aluno = new Aluno(name, email, room);
            quartos[room] = aluno;
            sc.nextLine();
            System.out.println();
        }
        System.out.println("Busy rooms:");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(quartos[i].getRoom() + ": " + quartos[i].getName() + ", " + quartos[i].getEmail() );
            }
        }
        sc.close();
    }
}
