
package DAO;

import java.util.List;
import model.Staff;
import org.hibernate.*;

/**
 *
 * @author jeremie
 */
public class StaffDao {
//    CRUD
    public Staff registerStaff(Staff staffObj){
        try{
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // transaction
            Transaction tr = ss.beginTransaction();
            // perform action
            ss.save(staffObj);
            tr.commit();
            ss.close();
            return staffObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Staff updateStaff(Staff staffObj){
        try{
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // transaction
            Transaction tr = ss.beginTransaction();
            // perform action
            ss.update(staffObj);
            tr.commit();
            ss.close();
            return staffObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Staff deleteStaff(Staff staffObj){
        try{
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            // transaction
            Transaction tr = ss.beginTransaction();
            // perform action
            ss.delete(staffObj);
            tr.commit();
            ss.close();
            return staffObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    // search
    public Staff searchStaff(Staff staffObj){
        try{
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            
            String searchString = staffObj.getUsername();
            Query query = ss.createQuery("FROM Staff b LEFT JOIN FETCH b.users WHERE b.username LIKE :searchString");
            query.setParameter("searchString", "%" + searchString.toLowerCase() + "%");
            query.setMaxResults(1);            
            Staff theStaff = (Staff) query.uniqueResult();
            ss.close();
            return theStaff;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public List<Staff> allStaff(){
        try{
            // create session
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Staff> staffs = ss.createQuery("select theStaff from Staff theStaff").list();
            ss.close();
            return staffs;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
