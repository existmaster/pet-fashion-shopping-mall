package pet.fashion.shopping.mall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import pet.fashion.shopping.mall.domain.*;
import pet.fashion.shopping.mall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PetProfileUpdated extends AbstractEvent {

    public PetProfileUpdated(PetProfile aggregate) {
        super(aggregate);
    }

    public PetProfileUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
