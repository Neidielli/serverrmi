package com.serverrmi.serverrmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class VotingServer {
    public static void main(String[] args) {
        try {
            VotingService votingService = new VotingServiceImpl();

            LocateRegistry.createRegistry(1099);
            Naming.rebind("VotingService", votingService);

            System.out.println("Servidor RMI pronto para receber votos...");

            while (true) {
                Thread.sleep(5000);
                System.out.println(votingService.getVoteCount());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
