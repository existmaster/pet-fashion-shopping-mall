package pet.fashion.shopping.mall.domain;

import java.util.*;
import lombok.*;
import pet.fashion.shopping.mall.domain.*;
import pet.fashion.shopping.mall.infra.AbstractEvent;

@Data
@ToString
public class ProductCreated extends AbstractEvent {

    private Long id;
    private String name;
    private Object photo;
    private Integer size;
    private Object price;
}
