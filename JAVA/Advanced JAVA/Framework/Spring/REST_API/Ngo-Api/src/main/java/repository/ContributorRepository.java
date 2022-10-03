package repository;

import model.Contributor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//It provides all the CRUD and database operations
@Repository     //Spring will auto scan this repository.repository as a spring component
public interface ContributorRepository extends JpaRepository<Contributor, Long> {
}
