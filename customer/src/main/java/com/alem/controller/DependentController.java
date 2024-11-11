package com.alem.controller;

import com.alem.entity.Dependent;
import com.alem.model.DependentModel;
import com.alem.service.RegisterDependent;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/dependents")
public class DependentController {
    private final RegisterDependent registerDependent;

    public DependentController(RegisterDependent registerDependent) {
        this.registerDependent = registerDependent;
    }
   @PostMapping("/add")
    public ResponseEntity<Dependent> register(@RequestBody DependentModel model){
        return ResponseEntity.ok(registerDependent.registerDependent(model));

    }

}
