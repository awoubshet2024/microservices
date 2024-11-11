package com.alem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDependentDTO {
    private String firstName;
    private Long numberOfDependent;
}
