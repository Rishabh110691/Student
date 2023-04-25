package com.School.School.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class School {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer schoolId;

    @NotBlank
    @Size(min = 5,max = 50)
    private String name;

    @OneToMany(mappedBy = "school",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Students> students;

}
