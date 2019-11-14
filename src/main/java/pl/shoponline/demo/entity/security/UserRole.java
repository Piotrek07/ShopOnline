package pl.shoponline.demo.entity;


import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "user_role")
public class UserRole {

    private Long userRoleId;

    public UserRole(User user, Role role) {
        this.user = user;
        this.role = role;
    }
}
