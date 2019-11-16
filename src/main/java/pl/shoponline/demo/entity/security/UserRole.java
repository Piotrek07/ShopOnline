package pl.shoponline.demo.entity.security;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import pl.shoponline.demo.entity.User;

import javax.persistence.*;
@Getter
@Setter
@Data
@Entity
@Table(name = "user_role")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userRoleId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_Id")
    private Role role;








}
