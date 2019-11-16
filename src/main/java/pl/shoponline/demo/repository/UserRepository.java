package pl.shoponline.demo.repository;

import org.springframework.data.repository.CrudRepository;
import pl.shoponline.demo.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
