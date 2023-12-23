/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import DAO.CarsDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Cars;
import service.CarsService;

/**
 *
 * @author busyDev
 */
public class CarsServiceImpl extends UnicastRemoteObject implements CarsService {

    public CarsServiceImpl() throws RemoteException {
    }

    CarsDao dao = new CarsDao();

    @Override
    public Cars recordCar(Cars theCar) throws RemoteException {
        return dao.registerCars(theCar);
    }

    @Override
    public Cars updateCar(Cars theCar) throws RemoteException {
        return dao.updateCars(theCar);
    }

    @Override
    public Cars deleteCar(Cars theCar) throws RemoteException {
        return dao.deleteCars(theCar);
    }

    @Override
    public Cars searchCarById(Cars theCar) throws RemoteException {
        return dao.searchCars(theCar);
    }

    @Override
    public List<Cars> allCarsList() throws RemoteException {
        return dao.allCars();
    }

}
