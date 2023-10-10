package pet.fashion.shopping.mall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CreateProductCommand {

    private String name;
    private File photo;
    private Money price;
    private Size size;
}
