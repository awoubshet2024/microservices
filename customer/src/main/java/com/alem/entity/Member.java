package com.alem.entity;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString

public class Member {
    @Id
    @GeneratedValue

    private Long memberId;
    private String memberFName;
    private String memberLName;
    private String memberEmail;
    private LocalDate memberDateOfBirth;
    private String Gender;
   // @OneToMany(targetEntity = Dependent.class,cascade=CascadeType.ALL)
   // @JoinColumn(name="memberId",referencedColumnName = "memberId")
   @OneToMany(mappedBy = "member", cascade=CascadeType.ALL)
    private List<Dependent> dependents;

}
