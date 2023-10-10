package pet.fashion.shopping.mall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import pet.fashion.shopping.mall.domain.*;
import pet.fashion.shopping.mall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PetProfileCreated extends AbstractEvent {

    private Long id;
    private String name;
    private Integer weight;
    private Integer neckCircumference;
    private Integer chestCircumference;
    private Integer age;
    private Long memberId;
    private Breed breed;
    private Allergies allergies;

    public PetProfileCreated(PetProfile aggregate) {
        super(aggregate);
    }

    public PetProfileCreated() {
        super();
    }
}
//>>> DDD / Domain Event
