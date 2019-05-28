package Lab_7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Lab_7.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
