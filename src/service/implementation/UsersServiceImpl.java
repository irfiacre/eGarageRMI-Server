/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import DAO.UsersDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Users;
import service.UsersService;

/**
 *
 * @author busyDev
 */
public class UsersServiceImpl extends UnicastRemoteObject implements UsersService {

    public UsersServiceImpl() throws RemoteException {
    }

    UsersDao dao = new UsersDao();

    @Override
    public Users recordUser(Users theUser) throws RemoteException {
        return dao.registerUsers(theUser);
    }

    @Override
    public Users updateUser(Users theUser) throws RemoteException {
        return dao.updateUsers(theUser);
    }

    @Override
    public Users deleteUser(Users theUser) throws RemoteException {
        return dao.deleteUsers(theUser);
    }

    @Override
    public Users searchUserById(Users theUser) throws RemoteException {
        return dao.searchUsers(theUser);
    }

    @Override
    public List<Users> allStaffsList() throws RemoteException {
        return dao.allStaffMembers();
    }

    @Override
    public List<Users> allMechanicsList() throws RemoteException {
        return dao.allMechanics();
    }

    

}
