import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> votos = new HashMap<>();

        System.out.println("Informe o nome dos 3 candidatos:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Candidato " + (i + 1) + ": ");
            String nomeCandidato = scan.nextLine();
            votos.put(nomeCandidato, 0);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do candidato em quem deseja votar: ");
            String voto = scan.nextLine();
            if (votos.containsKey(voto)) {
                votos.put(voto, votos.get(voto) + 1);
            } else {
                votos.put("Nulo", votos.getOrDefault("Nulo", 0) + 1);
            }
        }

        String vencedor = "";
        int maiorVotos = 0;
        for (Map.Entry<String, Integer> entry : votos.entrySet()) {
            if (entry.getValue() > maiorVotos) {
                vencedor = entry.getKey();
                maiorVotos = entry.getValue();
            }
        }

        double porcentagem = (maiorVotos / 10.0) * 100;
        System.out.println("O vencedor da eleição é: " + vencedor);
        System.out.println("Porcentagem de votos: " + porcentagem + "%");
    }
}
