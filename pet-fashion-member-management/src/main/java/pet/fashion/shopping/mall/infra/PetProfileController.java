package pet.fashion.shopping.mall.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pet.fashion.shopping.mall.domain.*;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/petProfiles")
@Transactional
public class PetProfileController {

    @Autowired
    PetProfileRepository petProfileRepository;

    @RequestMapping(
        value = "petProfiles/{id}/updatepetprofile",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public PetProfile updatePetProfile(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /petProfile/updatePetProfile  called #####");
        Optional<PetProfile> optionalPetProfile = petProfileRepository.findById(
            id
        );

        optionalPetProfile.orElseThrow(() -> new Exception("No Entity Found"));
        PetProfile petProfile = optionalPetProfile.get();
        petProfile.updatePetProfile();

        petProfileRepository.save(petProfile);
        return petProfile;
    }
}
//>>> Clean Arch / Inbound Adaptor
