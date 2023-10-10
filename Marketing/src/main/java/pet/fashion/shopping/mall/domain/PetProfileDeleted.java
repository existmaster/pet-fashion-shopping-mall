package pet.fashion.shopping.mall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import pet.fashion.shopping.mall.infra.AbstractEvent;

@Data
public class PetProfileDeleted extends AbstractEvent {

    private Long id;
}
