package Lab_7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Lab_7.entity.Kurator;

public interface KuratorRepository extends JpaRepository<Kurator, Long> {

    Kurator findByphone(String name);

    Kurator findByName(String name);

}
