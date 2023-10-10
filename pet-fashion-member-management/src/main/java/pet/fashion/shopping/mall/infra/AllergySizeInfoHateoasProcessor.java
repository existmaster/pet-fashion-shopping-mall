package pet.fashion.shopping.mall.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import pet.fashion.shopping.mall.domain.*;

@Component
public class AllergySizeInfoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<AllergySizeInfo>> {

    @Override
    public EntityModel<AllergySizeInfo> process(
        EntityModel<AllergySizeInfo> model
    ) {
        return model;
    }
}
