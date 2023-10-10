package pet.fashion.shopping.mall.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pet.fashion.shopping.mall.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "petInformations",
    path = "petInformations"
)
public interface PetInformationRepository
    extends PagingAndSortingRepository<PetInformation, Long> {}
