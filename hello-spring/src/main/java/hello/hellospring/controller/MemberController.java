package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller //annotation 보고 controller 객체를 생성함(스프링 빈 생성되는 것)
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        //@Autowired 쓰면 스프링 컨테이너에 있는 멤버 서비스를 가져다가 연결을 시켜줌
        this.memberService = memberService;
    }



}
