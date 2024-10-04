package quickstarts.kitchensink.members;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
public class MembersController {

  @Autowired
  MemberService memberService;

  @Autowired
  MemberMapper memberMapper;

  @PostMapping
  public MemberViewModel createMember(@RequestBody MemberViewModel member) {
    return memberMapper.toViewModel(
        memberService.createMember(memberMapper.fromViewModel(member))
    );
  }


}
