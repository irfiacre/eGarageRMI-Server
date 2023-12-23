/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Mechanic;

/**
 *
 * @author busyDev
 */
public interface MechanicService extends Remote {

    // Method Signature
    Mechanic recordMechanic(Mechanic theMechanic) throws RemoteException;
    Mechanic updateMechanic(Mechanic theMechanic) throws RemoteException;
    Mechanic deleteMechanic(Mechanic theMechanic) throws RemoteException;
    Mechanic searchMechanicById(Mechanic theMechanic) throws RemoteException;
    List<Mechanic> allMechanicList() throws RemoteException;

}
