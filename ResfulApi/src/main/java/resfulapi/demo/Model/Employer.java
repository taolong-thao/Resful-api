package resfulapi.demo.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author dfean
 */
@Entity
@Table(name = "Employer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Generated
@ToString
public class Employer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "Username")
    private String username;
    @Column(name = "Title")
    private String Title;
    @Column(name = "Department")
    private String Department;
    @Column(name = "Salary")
    private String Salary;


}
