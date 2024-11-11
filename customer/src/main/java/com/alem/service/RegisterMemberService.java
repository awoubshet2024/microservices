package com.alem.service;

import com.alem.entity.Member;
import com.alem.model.JoinData;
import com.alem.model.MemberDependentDTO;
import com.alem.model.RequestModel;
import com.alem.repository.DependentRepository;
import com.alem.repository.MemberRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterMemberService {
    private final MemberRepository memberRepository;
    private final DependentRepository dependentRepository;

    public RegisterMemberService(MemberRepository memberRepository, DependentRepository dependentRepository) {
        this.memberRepository = memberRepository;
        this.dependentRepository = dependentRepository;
    }
   public Member registerMember(RequestModel model) {

        Member member = (Member) model.getMember();
         member.getDependents()
                 .forEach(m -> m.setMember(member) );

       return memberRepository.save(member);

    }


    public List<Member> getMemberes() {

        return memberRepository.findAll();

    }

    public List<JoinData> listJoinData() {
      return   memberRepository.listJoinData();
    }
    public List<Object[]> findMemberDependents(){
        return memberRepository.findMemberDependent();
    }
    public List<MemberDependentDTO> findCountMemberDependents(){
        return memberRepository.findCountMemberDependentResponse();
    }
  public  List<Member>sortMembers(String field){
        return memberRepository.findAll(Sort.by(Sort.Direction.DESC, field));
    }
    public Page<Member> pageRecords(int pageNumber, int pageSize){
        return memberRepository.findAll(PageRequest.of(pageNumber, pageSize));
    }
    public Page<Member> pageAndSortRecords(int pageNumber, int pageSize,String field){
        return memberRepository.findAll(PageRequest.of(pageNumber, pageSize).withSort(Sort.by(Sort.Direction.DESC, field)));
    }
}
