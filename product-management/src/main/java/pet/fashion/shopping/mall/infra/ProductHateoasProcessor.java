package pet.fashion.shopping.mall.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import pet.fashion.shopping.mall.domain.*;

@Component
public class ProductHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Product>> {

    @Override
    public EntityModel<Product> process(EntityModel<Product> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/updateproduct")
                .withRel("updateproduct")
        );

        return model;
    }
}
