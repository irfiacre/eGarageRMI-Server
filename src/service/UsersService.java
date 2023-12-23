/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Users;

/**
 *
 * @author busyDev
 */
public interface UsersService extends Remote {

    // Method Signature
    Users recordUser(Users theUser) throws RemoteException;

    Users updateUser(Users theUser) throws RemoteException;

    Users deleteUser(Users theUser) throws RemoteException;

    Users searchUserById(Users theUser) throws RemoteException;
//    List<Users> allUsersList() throws RemoteException;

    List<Users> allStaffsList() throws RemoteException;

    List<Users> allMechanicsList() throws RemoteException;

}
