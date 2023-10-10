package pet.fashion.shopping.mall.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pet.fashion.shopping.mall.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "members", path = "members")
public interface MemberRepository
    extends PagingAndSortingRepository<Member, Email> {}
