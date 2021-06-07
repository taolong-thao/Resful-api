package resfulapi.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import resfulapi.demo.Model.Employer;
import resfulapi.demo.Respon.EmployerRepo;

/**
 *
 * @author dfean
 */
@Service
public class EmployerService {
    @Autowired
    EmployerRepo employerRepo;

    public List<Employer> getAll() {
        return employerRepo.findAll();
    }

    public Employer saveEmployer(Employer employer) {
        return employerRepo.save(employer);
    }

    public Employer FindById(Long Id) {
        return employerRepo.findById(Id).get();
    }

    public void delete(Long id) {
        this.employerRepo.deleteById(id);
    }
}
