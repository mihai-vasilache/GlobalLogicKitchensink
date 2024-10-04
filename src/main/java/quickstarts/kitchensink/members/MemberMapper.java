package quickstarts.kitchensink.members;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberMapper {

  MemberViewModel toViewModel(Member source);
  Member fromViewModel(MemberViewModel destination);

}
