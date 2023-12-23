/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Cars;

/**
 *
 * @author busyDev
 */
public interface CarsService extends Remote {

    // Method Signature
    Cars recordCar(Cars theCar) throws RemoteException;
    Cars updateCar(Cars theCar) throws RemoteException;
    Cars deleteCar(Cars theCar) throws RemoteException;
    Cars searchCarById(Cars theCar) throws RemoteException;
    List<Cars> allCarsList() throws RemoteException;

}
