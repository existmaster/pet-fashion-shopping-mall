package pet.fashion.shopping.mall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import pet.fashion.shopping.mall.domain.*;
import pet.fashion.shopping.mall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class AllergySizeInfoAdded extends AbstractEvent {

    public AllergySizeInfoAdded(AllergySizeInfo aggregate) {
        super(aggregate);
    }

    public AllergySizeInfoAdded() {
        super();
    }
}
//>>> DDD / Domain Event
