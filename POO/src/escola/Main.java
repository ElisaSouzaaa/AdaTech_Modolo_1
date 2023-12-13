package escola;

import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Professor professor = new Professor("Igor",26, "masculino", 10.876, "Instrutor de Programação", "Java");
        Atendente atendente = new Atendente("Araci",40, "neutro", 5.982, "Atendente", "Vendas");
        Aluno aluno = new Aluno("Luara", 20, "feminino", 3, true);
        Bolsista bolsista = new Bolsista("Elisa", 28, "feminino", 2, true, true);

        System.out.println("Escolha a categoria: 1 - Funcionário | 2 - Aluno");
        int resposta = scan.nextInt();

        if(resposta == 1) {
            System.out.println("Gostaria de conhecer 1 - Atendente ou 2 - Professor ?");
            resposta = scan.nextInt();

            if(resposta == 1) {
                atendente.menu();
                atendente.visualizar();
            } else if (resposta == 2) {
                professor.menu();
                professor.visualizar();
            } else {
                System.out.println("Ops, resposta inválida! Escolha apenas uma das opções");
            }
        } else if (resposta == 2) {
            bolsista.menu();
            System.out.println("Bolsista? 1 - Não | 2 - Sim");
            resposta = scan.nextInt();

            if (resposta == 1) {
                aluno.visualizar();
            } else if (resposta == 2) {
                bolsista.visualizar();
            } else {
                System.out.println("Ops, resposta inválida! Escolha apenas uma das opções");
            }
        }

        Main.end();
    }

    public final static void end() {
        System.out.println("Obrigada por consultar nosso sistema!");
    }
}