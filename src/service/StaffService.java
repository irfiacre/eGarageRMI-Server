/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Staff;

/**
 *
 * @author busyDev
 */
public interface StaffService extends Remote {

    // Method Signature
    Staff recordStaff(Staff theStaff) throws RemoteException;
    Staff updateStaff(Staff theStaff) throws RemoteException;
    Staff deleteStaff(Staff theStaff) throws RemoteException;
    Staff searchStaffById(Staff theStaff) throws RemoteException;
    List<Staff> allStaffList() throws RemoteException;

}
