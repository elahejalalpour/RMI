/*
 * In The Name Of God
 * ========================================
 * [] File Name : RemoteDate.java
 *
 * [] Creation Date : 01-10-2015
 *
 * [] Created By : Elahe Jalalpour (el.jalalpour@gmail.com)
 * =======================================
*/
/**
 * @author Elahe Jalalpour
 */
package me.elahe.rmi.client;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface RemoteDate extends Remote {
	public Date getDate() throws RemoteException;
}
