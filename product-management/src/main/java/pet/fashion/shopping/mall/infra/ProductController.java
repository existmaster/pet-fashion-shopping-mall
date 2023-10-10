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
// @RequestMapping(value="/products")
@Transactional
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(
        value = "products/{id}/updateproduct",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Product updateProduct(
        @PathVariable(value = "id") Long id,
        @RequestBody UpdateProductCommand updateProductCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /product/updateProduct  called #####");
        Optional<Product> optionalProduct = productRepository.findById(id);

        optionalProduct.orElseThrow(() -> new Exception("No Entity Found"));
        Product product = optionalProduct.get();
        product.updateProduct(updateProductCommand);

        productRepository.save(product);
        return product;
    }
}
//>>> Clean Arch / Inbound Adaptor
