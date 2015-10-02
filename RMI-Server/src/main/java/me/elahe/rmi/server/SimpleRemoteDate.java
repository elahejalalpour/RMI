/*
 * In The Name Of God
 * ========================================
 * [] File Name : SimpleRemoteDate.java
 *
 * [] Creation Date : 01-10-2015
 *
 * [] Created By : Elahe Jalalpour (el.jalalpour@gmail.com)
 * =======================================
*/
/**
 * @author Elahe Jalalpour
 */

package me.elahe.rmi.server;

import me.elahe.rmi.shared.RemoteDate;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class SimpleRemoteDate extends UnicastRemoteObject implements RemoteDate {

	protected SimpleRemoteDate() throws RemoteException {
	}

	@Override
	public Date getDate() throws RemoteException {
		return new Date();
	}
}
