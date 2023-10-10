package pet.fashion.shopping.mall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class UpdateProductCommand {

    private Long id;
    private String name;
    private Photo photo;
    private Integer size;
    private Money price;
}
