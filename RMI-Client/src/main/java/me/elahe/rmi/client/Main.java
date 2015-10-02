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
package me.elahe.rmi.client;

<<<<<<< HEAD
import me.elahe.rmi.server.RemoteDate;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
=======
import java.rmi.Naming;
>>>>>>> ff58f5e... Project completed.

public class Main {
	static final String server = "127.0.0.1";

	public static void main(String[] args) {
		try {
<<<<<<< HEAD
			if (System.getSecurityManager() == null) {
				System.setSecurityManager(new RMISecurityManager());
			}


=======
>>>>>>> ff58f5e... Project completed.
			String host = "rmi://" + server + "/RMIDateObject";
			RemoteDate dateServer = (RemoteDate) Naming.lookup(host);
			System.out.println(dateServer.getDate());
		} catch (Exception e) {
<<<<<<< HEAD
			e.printStackTrace();
=======
			System.err.println(e.getMessage());
>>>>>>> ff58f5e... Project completed.
		}
	}
}
