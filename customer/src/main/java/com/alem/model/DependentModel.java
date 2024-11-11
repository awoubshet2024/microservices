package com.alem.model;



import com.alem.entity.Dependent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DependentModel {

  /*  private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;*/
    private Dependent dependent;

}
