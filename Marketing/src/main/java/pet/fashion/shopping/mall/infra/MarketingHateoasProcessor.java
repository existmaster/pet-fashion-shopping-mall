package pet.fashion.shopping.mall.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import pet.fashion.shopping.mall.domain.*;

@Component
public class MarketingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Marketing>> {

    @Override
    public EntityModel<Marketing> process(EntityModel<Marketing> model) {
        return model;
    }
}
