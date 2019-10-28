package p16.sdaonlineshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import p16.sdaonlineshop.model.User;


public interface UserRepository extends JpaRepository<User, Integer>  {
}
