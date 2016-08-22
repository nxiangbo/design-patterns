package com.nxiangbo.proxy.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String location;
	private int count ;
	State noQuarterState;
	
	protected GumballMachine(String location, int numsGumball) throws RemoteException {
		noQuarterState = new NoQuarterState(this);
		this.location = location;
		this.count = numsGumball;
	}
	
	public void insertQuarter() {
		noQuarterState.insertQuarter();
	}
 
	public void ejectQuarter() {
		noQuarterState.ejectQuarter();
	}
 
	public void turnCrank() {
		noQuarterState.turnCrank();
		noQuarterState.dispense();
	}

	void setState(State state) {
		this.noQuarterState = state;
	}
 
	
	@Override
	public int getCount() throws RemoteException {
		return count;
	}

	@Override
	public String getLocation() throws RemoteException {
		return location;
	}

	@Override
	public State getState() throws RemoteException {
		return noQuarterState;
	}
	
}
