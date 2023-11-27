package com.serverrmi.serverrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface VotingService extends Remote {
    void vote(String candidateName, int numVotes) throws RemoteException;
    String getVoteCount() throws RemoteException;
}
