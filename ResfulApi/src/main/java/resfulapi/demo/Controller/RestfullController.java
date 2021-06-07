package resfulapi.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import resfulapi.demo.Model.Employer;
import resfulapi.demo.Service.EmployerService;

/**
 *
 * @author dfean
 */
@RestController
@RequestMapping("/api")
public class RestfullController {
    @Autowired
    EmployerService employerService;

    @GetMapping("/list")
    public List<Employer> list() {
        return employerService.getAll();
    }

    @PostMapping("/save")
    public Employer save(@RequestBody Employer employer) {
        employerService.saveEmployer(employer);
        return employer;
    }

    @PutMapping("/update/{id}")
    public Employer update(@PathVariable("id") Long Id, @RequestBody Employer employer) {
        Employer employer1 = employerService.FindById(Id);
        employer1.setUsername(employer.getUsername());
        employer1.setTitle(employer.getTitle());
        employer1.setDepartment(employer.getDepartment());
        employer1.setSalary(employer.getSalary());
        return this.employerService.saveEmployer(employer1);
    }

    @GetMapping("/list/{id}")

    public Employer getID(@PathVariable Long id) {
        return employerService.FindById(id);
    }

    @DeleteMapping("/delete/{id}")

    public String delete(@PathVariable("id") Long id) {
        employerService.delete(id);
        return "delete id" + id;
    }
}
