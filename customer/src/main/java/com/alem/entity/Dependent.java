package com.alem.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Dependent
{
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    @ManyToOne()
    @JoinColumn(name="memberId")
    private Member member;


}
