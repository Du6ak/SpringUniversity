package Lab_7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Lab_7.entity.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {

    Group findByName(String name);

}
