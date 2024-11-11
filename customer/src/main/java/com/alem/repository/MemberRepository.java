package com.alem.repository;

import com.alem.entity.Member;
import com.alem.model.JoinData;
import com.alem.model.MemberDependentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    @Query("SELECT new com.alem.model.JoinData(m.memberFName,d.firstName,m.memberId)" +
            "FROM Member m join m.dependents d" )
    List<JoinData> listJoinData();
    @Query(value= "SELECT m.memberFName,COUNT(d) " +
            "FROM Member m JOIN m.dependents d GROUP BY m.memberId")
    List<Object[]> findMemberDependent();

    @Query("SELECT new com.alem.model.MemberDependentDTO(m.memberFName,COUNT(d))" +
            "FROM Member m JOIN m.dependents d " +
            "GROUP BY m.memberId")
    List<MemberDependentDTO> findCountMemberDependentResponse();

}

