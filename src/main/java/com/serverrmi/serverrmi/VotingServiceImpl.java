package com.serverrmi.serverrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class VotingServiceImpl extends UnicastRemoteObject implements VotingService {
    private Map<String, Integer> voteCount = new HashMap<>();

    public VotingServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public synchronized void vote(String candidateName, int numVotes) throws RemoteException {
        voteCount.put(candidateName, voteCount.getOrDefault(candidateName, 0) + numVotes);
    }

    @Override
    public synchronized String getVoteCount() throws RemoteException {
        StringBuilder result = new StringBuilder("Vote Count:\n");
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return result.toString();
    }
}
