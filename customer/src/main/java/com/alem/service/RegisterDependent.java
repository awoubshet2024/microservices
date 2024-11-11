package com.alem.service;

import com.alem.entity.Dependent;
import com.alem.model.DependentModel;
import com.alem.repository.DependentRepository;
import org.springframework.stereotype.Service;

@Service
public class RegisterDependent  {
    private final DependentRepository dependentRepository;

    public RegisterDependent(DependentRepository dependentRepository) {
        this.dependentRepository = dependentRepository;
    }

    public Dependent registerDependent(DependentModel model) {

        /*Dependent dependentModel = Dependent.
                builder()
                .firstName(model.getFirstName())
                .lastName(model.getLastName())
                .gender(model.getGender())
                .dateOfBirth(model.getDateOfBirth())
                .build();
      return   dependentRepository.save(dependentModel);*/

          return   dependentRepository.save(model.getDependent());

    }

}
