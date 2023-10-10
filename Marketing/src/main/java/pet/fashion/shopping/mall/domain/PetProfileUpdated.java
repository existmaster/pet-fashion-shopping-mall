package pet.fashion.shopping.mall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import pet.fashion.shopping.mall.infra.AbstractEvent;

@Data
public class PetProfileUpdated extends AbstractEvent {

    private Long id;
    private String name;
    private Integer weight;
    private Integer neckCircumference;
    private Integer chestCircumference;
    private Breed breed;
    private Integer age;
    private Allergies allergies;
    private Long memberId;
}
