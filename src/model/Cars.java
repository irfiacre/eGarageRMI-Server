/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author busyDev
 */
@Entity
public class Cars  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String model;
    private String brand;
    @Column(name = "make_year")
    private String makeYear;
    @Column(name = "fault_description")
    private String faultDescription;
    private CarFixStatus status;
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users users;
    
    @ManyToMany(mappedBy = "cars")
    private Set<Mechanic> Mechanic = new HashSet<>();
    
    @ManyToMany(mappedBy = "cars")
    private Set<Staff> Staff = new HashSet<>();

    public Cars() {
    }

    public Cars(Integer id) {
        this.id = id;
    }

    public Cars(Integer id, String model, String brand, String makeYear, String faultDescription, CarFixStatus status, Users users) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.makeYear = makeYear;
        this.faultDescription = faultDescription;
        this.status = status;
        this.users = users;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMakeYear() {
        return makeYear;
    }

    public void setMakeYear(String makeYear) {
        this.makeYear = makeYear;
    }

    public String getFaultDescription() {
        return faultDescription;
    }

    public void setFaultDescription(String faultDescription) {
        this.faultDescription = faultDescription;
    }

    public CarFixStatus getStatus() {
        return status;
    }

    public void setStatus(CarFixStatus status) {
        this.status = status;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Set<Mechanic> getMechanic() {
        return Mechanic;
    }

    public void setMechanic(Set<Mechanic> Mechanic) {
        this.Mechanic = Mechanic;
    }

    public Set<Staff> getStaff() {
        return Staff;
    }

    public void setStaff(Set<Staff> Staff) {
        this.Staff = Staff;
    }

    
    
    
}
