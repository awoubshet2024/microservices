package com.alem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PrimaryMember {
    private String firstName;
    private String lastName;
    private String email;
}
