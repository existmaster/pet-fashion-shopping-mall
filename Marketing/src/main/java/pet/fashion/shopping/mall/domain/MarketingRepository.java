package pet.fashion.shopping.mall.domain;

import java.util.Date;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pet.fashion.shopping.mall.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "marketings",
    path = "marketings"
)
public interface MarketingRepository
    extends PagingAndSortingRepository<Marketing, Long> {}