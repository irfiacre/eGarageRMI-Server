/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import service.implementation.CarsServiceImpl;
import service.implementation.UsersServiceImpl;
import service.implementation.MechanicServiceImpl;
import service.implementation.StaffServiceImpl;

/**
 *
 * @author busyDev
 */
public class Server {

    private static Integer SERVER_PORT = 8000;

    public static void main(String[] args) {
        try {
            // set Property
            System.setProperty("java.rmi.hostname", "127.0.0.1");
            // Create Registry
            Registry theRegistry = LocateRegistry.createRegistry(SERVER_PORT);
            // binding data
            theRegistry.rebind("users", new UsersServiceImpl());
            theRegistry.rebind("cars", new CarsServiceImpl());
            theRegistry.rebind("staff", new StaffServiceImpl());
            theRegistry.rebind("mechanic", new MechanicServiceImpl());

            System.out.println(
                    "Server is running on port" + " " + SERVER_PORT + " "
            );
            Thread.currentThread().join();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
