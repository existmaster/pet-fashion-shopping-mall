package pet.fashion.shopping.mall.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pet.fashion.shopping.mall.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "petProfiles",
    path = "petProfiles"
)
public interface PetProfileRepository
    extends PagingAndSortingRepository<PetProfile, String> {}
