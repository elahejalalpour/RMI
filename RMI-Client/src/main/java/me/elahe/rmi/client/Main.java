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

import me.elahe.rmi.shared.RemoteDate;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

public class Main {
	static final String server = "127.0.0.1";

	public static void main(String[] args) {
		try {
			if (System.getSecurityManager() == null) {
				System.setSecurityManager(new RMISecurityManager());
			}
			String host = "rmi://" + server + "/RMIDateObject";
			RemoteDate dateServer = (RemoteDate) Naming.lookup(host);
			System.out.println(dateServer.getDate());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
