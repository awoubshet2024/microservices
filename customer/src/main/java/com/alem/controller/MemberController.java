package com.alem.controller;

import com.alem.entity.Member;
import com.alem.model.JoinData;
import com.alem.model.MemberDependentDTO;
import com.alem.model.RequestModel;
import com.alem.service.RegisterMemberService;
import jakarta.websocket.server.PathParam;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/members")
public class MemberController {
    private final RegisterMemberService registerMemberService;

    public MemberController(RegisterMemberService registerMemberService) {
        this.registerMemberService = registerMemberService;
    }

    @PostMapping("/add")
    public Member addMember(@RequestBody RequestModel<Member> model) {

        return registerMemberService.registerMember(model);

    }

    @GetMapping("/all")
    public ResponseEntity<List<Member>> listMembers() {
        return ResponseEntity.ok(registerMemberService.getMemberes());

    }

    @GetMapping("/join")
    public ResponseEntity<List<JoinData>> getJoinData() {
        return ResponseEntity.ok(registerMemberService.listJoinData());

    }

    @GetMapping("/countDependent")
    public List<Object[]> getMemberDependent() {
        return registerMemberService.findMemberDependents();
    }

    @GetMapping("/count")
    public List<MemberDependentDTO> getCountMemberDependent() {
        return registerMemberService.findCountMemberDependents();
    }

    @GetMapping("/sort")
    public List<Member> sortMembers(@RequestParam("field") String field) {
        return registerMemberService.sortMembers(field);
    }


    @GetMapping("/page")
    public Page<Member >pageRecords(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {
        return registerMemberService.pageRecords(pageNum, pageSize);
    }
    @GetMapping("/pageAndSort")
    public Page<Member>pageAndSortRecords(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize, @RequestParam("field") String field) {
        return registerMemberService.pageAndSortRecords(pageNum, pageSize, field);
    }
}
