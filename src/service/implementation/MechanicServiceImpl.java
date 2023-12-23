/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import DAO.MechanicDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Mechanic;
import service.MechanicService;

/**
 *
 * @author busyDev
 */
public class MechanicServiceImpl extends UnicastRemoteObject implements MechanicService {

    public MechanicServiceImpl() throws RemoteException {
    }

    MechanicDao dao = new MechanicDao();

    @Override
    public Mechanic recordMechanic(Mechanic theMechanic) throws RemoteException {
        return dao.registerMechanic(theMechanic);
    }

    @Override
    public Mechanic updateMechanic(Mechanic theMechanic) throws RemoteException {
        return dao.updateMechanic(theMechanic);
    }

    @Override
    public Mechanic deleteMechanic(Mechanic theMechanic) throws RemoteException {
        return dao.deleteMechanic(theMechanic);
    }

    @Override
    public Mechanic searchMechanicById(Mechanic theMechanic) throws RemoteException {
        return dao.searchMechanic(theMechanic);
    }

    @Override
    public List<Mechanic> allMechanicList() throws RemoteException {
        return dao.allMechanics();
    }

}
