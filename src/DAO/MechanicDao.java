package DAO;

import java.util.List;
import model.Mechanic;
import org.hibernate.*;

/**
 *
 * @author jeremie
 */
public class MechanicDao {
//    CRUD

    public Mechanic registerMechanic(Mechanic mechanicObj) {
        try {
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // transaction
            Transaction tr = ss.beginTransaction();
            // perform action
            ss.save(mechanicObj);
            tr.commit();
            ss.close();
            return mechanicObj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Mechanic updateMechanic(Mechanic mechanicObj) {
        try {
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // transaction
            Transaction tr = ss.beginTransaction();
            // perform action
            ss.update(mechanicObj);
            tr.commit();
            ss.close();
            return mechanicObj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Mechanic deleteMechanic(Mechanic mechanicObj) {
        try {
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // transaction
            Transaction tr = ss.beginTransaction();
            // perform action
            ss.delete(mechanicObj);
            tr.commit();
            ss.close();
            return mechanicObj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    // search
    public Mechanic searchMechanic(Mechanic mechanicObj) {
        try {
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();

            String searchString = mechanicObj.getUsername();
            Query query = ss.createQuery("FROM Mechanic b LEFT JOIN FETCH b.users WHERE b.username LIKE :searchString");
            query.setParameter("searchString", "%" + searchString.toLowerCase() + "%");
            query.setMaxResults(1);
            Mechanic theMechanic = (Mechanic) query.uniqueResult();
            ss.close();
            return theMechanic;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }

    public List<Mechanic> allMechanics() {
        try {
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Mechanic> mechanics = ss.createQuery("select theMechanic from Mechanic theMechanic").list();
            ss.close();
            return mechanics;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
