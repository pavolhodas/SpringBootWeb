package com.example.demo.Course;

import com.example.demo.Employee.Employee;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String title;
    private Date startTime;
    private Date endTime;

    @ManyToMany(mappedBy = "courses",
                cascade = {CascadeType.ALL})
    List<Employee> employeeSet;

    public Course(String title, Date startTime, Date endTime) {
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
