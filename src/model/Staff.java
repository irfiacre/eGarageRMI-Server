
package model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author busyDev
 */
@Entity
public class Staff  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private EUserRole role;
    
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users users;
    
    @ManyToMany
    @JoinTable(
            name = "recorded_cars",
            joinColumns = @JoinColumn(name = "staff_id"),
            inverseJoinColumns = @JoinColumn(name = "car_id")
    )
    private Set<Cars> cars;

    public Staff() {
    }

    public Staff(Integer id) {
        this.id = id;
    }

    public Staff(Integer id, String username, String password, EUserRole role, Users users, Set<Cars> cars) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.users = users;
        this.cars = cars;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EUserRole getRole() {
        return role;
    }

    public void setRole(EUserRole role) {
        this.role = role;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Set<Cars> getCars() {
        return cars;
    }

    public void setCars(Set<Cars> cars) {
        this.cars = cars;
    }
    
    
    
    
}
