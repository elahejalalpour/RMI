/*
 * In The Name Of God
 * ========================================
 * [] File Name : Main.java
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

import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;

public class Main {
	public static void main(String[] args) {
		try {
			if (System.getSecurityManager() == null) {
				System.setSecurityManager(new RMISecurityManager());
			}

			RemoteDate dateServer = new SimpleRemoteDate();
			LocateRegistry.createRegistry(1099);
			LocateRegistry.getRegistry().bind("RMIDateObject", dateServer);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
