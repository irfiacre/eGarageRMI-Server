/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import DAO.StaffDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Staff;
import service.StaffService;

/**
 *
 * @author busyDev
 */
public class StaffServiceImpl extends UnicastRemoteObject implements StaffService {

    public StaffServiceImpl() throws RemoteException {
    }

    StaffDao dao = new StaffDao();

    @Override
    public Staff recordStaff(Staff theStaff) throws RemoteException {
        return dao.registerStaff(theStaff);
    }

    @Override
    public Staff updateStaff(Staff theStaff) throws RemoteException {
        return dao.updateStaff(theStaff);
    }

    @Override
    public Staff deleteStaff(Staff theStaff) throws RemoteException {
        return dao.deleteStaff(theStaff);
    }

    @Override
    public Staff searchStaffById(Staff theStaff) throws RemoteException {
        return dao.searchStaff(theStaff);
    }

    @Override
    public List<Staff> allStaffList() throws RemoteException {
        return dao.allStaff();
    }

}
