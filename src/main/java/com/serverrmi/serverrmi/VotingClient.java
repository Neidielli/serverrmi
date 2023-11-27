package com.serverrmi.serverrmi;

import java.rmi.Naming;
import java.util.Scanner;

public class VotingClient {
    public static void main(String[] args) {
        try {
            VotingService votingService = (VotingService) Naming.lookup("rmi://localhost/VotingService");
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Digite o nome do candidato (ou número) e o número de votos (ou 0 para sair): ");
                String candidateName = scanner.next();
                if (candidateName.equals("0")) {
                    break;
                }

                int numVotes = scanner.nextInt();
                votingService.vote(candidateName, numVotes);
            }

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
