package pet.fashion.shopping.mall.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import pet.fashion.shopping.mall.domain.*;

@Component
public class PetProfileHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<PetProfile>> {

    @Override
    public EntityModel<PetProfile> process(EntityModel<PetProfile> model) {
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "/updatepetprofile"
                )
                .withRel("updatepetprofile")
        );

        return model;
    }
}
