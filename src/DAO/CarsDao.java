package DAO;

import java.util.List;
import model.Cars;
import org.hibernate.*;

/**
 *
 * @author jeremie
 */
public class CarsDao {
//    CRUD

    public Cars registerCars(Cars carsObj) {
        try {
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // transaction
            Transaction tr = ss.beginTransaction();
            // perform action
            ss.save(carsObj);
            tr.commit();
            ss.close();
            return carsObj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Cars updateCars(Cars carsObj) {
        try {
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // transaction
            Transaction tr = ss.beginTransaction();
            // perform action
            ss.update(carsObj);
            tr.commit();
            ss.close();
            return carsObj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Cars deleteCars(Cars carsObj) {
        try {
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // transaction
            Transaction tr = ss.beginTransaction();
            // perform action
            ss.delete(carsObj);
            tr.commit();
            ss.close();
            return carsObj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    // search
    public Cars searchCars(Cars carsObj) {
        try {
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Cars theCars = (Cars) ss.get(Cars.class, carsObj.getId());
            ss.close();
            return theCars;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<Cars> allCars() {
        try {
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Cars> carss = ss.createQuery("FROM Cars theCars LEFT JOIN FETCH theCars.users").list();

//                    "select theCars from Cars theCars"
            ss.close();
            return carss;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
