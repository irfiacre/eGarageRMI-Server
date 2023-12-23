package DAO;

import java.util.List;
import model.Users;
import org.hibernate.*;

/**
 *
 * @author jeremie
 */
public class UsersDao {
//    CRUD

    public Users registerUsers(Users usersObj) {
        try {
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // transaction
            Transaction tr = ss.beginTransaction();
            // perform action
            ss.save(usersObj);
            tr.commit();
            ss.close();
            return usersObj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Users updateUsers(Users usersObj) {
        try {
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // transaction
            Transaction tr = ss.beginTransaction();
            // perform action
            ss.update(usersObj);
            tr.commit();
            ss.close();
            return usersObj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Users deleteUsers(Users usersObj) {
        try {
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // transaction
            Transaction tr = ss.beginTransaction();
            // perform action
            ss.delete(usersObj);
            tr.commit();
            ss.close();
            return usersObj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    // search
    public Users searchUsers(Users usersObj) {
        try {
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Users theUsers = (Users) ss.get(Users.class, usersObj.getId());
            ss.close();
            return theUsers;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

//    public List<Users> allUsers() {
//        try {
//            // create session
//            Session ss = HibernateUtil.getSessionFactory().openSession();
//            List<Users> userss = ss.createQuery("FROM Users theUsers" + "RIGHT JOIN FETCH theUsers.staff" + " " + "RIGHT JOIN FETCH theUsers.mechanic").list();
//            ss.close();
//            return userss;
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return null;
//    }
    public List<Users> allStaffMembers() {
        try {
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Users> users = ss.createQuery("FROM Users theUsers RIGHT JOIN FETCH theUsers.staff").list();
            ss.close();
            return users;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<Users> allMechanics() {
        try {
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Users> users = ss.createQuery("FROM Users theUsers RIGHT JOIN FETCH theUsers.mechanic").list();
            ss.close();
            return users;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
