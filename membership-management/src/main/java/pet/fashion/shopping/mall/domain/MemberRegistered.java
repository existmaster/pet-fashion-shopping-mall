package pet.fashion.shopping.mall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import pet.fashion.shopping.mall.domain.*;
import pet.fashion.shopping.mall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class MemberRegistered extends AbstractEvent {

    public MemberRegistered(Member aggregate) {
        super(aggregate);
    }

    public MemberRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
