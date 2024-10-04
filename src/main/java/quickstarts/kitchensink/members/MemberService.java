package quickstarts.kitchensink.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberService {

  @Autowired
  private MemberRepository memberRepository;

  //@Transactional
  public Member createMember(Member member) {
    return memberRepository.insert(member);
  }

}
