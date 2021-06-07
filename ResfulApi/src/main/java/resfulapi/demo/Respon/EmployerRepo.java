package resfulapi.demo.Respon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import resfulapi.demo.Model.Employer;

/**
 *
 * @author dfean
 */
@Repository
public interface EmployerRepo extends JpaRepository<Employer, Long> {
}
