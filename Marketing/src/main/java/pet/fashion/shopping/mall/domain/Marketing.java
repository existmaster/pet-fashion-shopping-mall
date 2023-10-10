package pet.fashion.shopping.mall.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import pet.fashion.shopping.mall.MarketingApplication;

@Entity
@Table(name = "Marketing_table")
@Data
//<<< DDD / Aggregate Root
public class Marketing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static MarketingRepository repository() {
        MarketingRepository marketingRepository = MarketingApplication.applicationContext.getBean(
            MarketingRepository.class
        );
        return marketingRepository;
    }

    //<<< Clean Arch / Port Method
    public static void notification(ProductCreated productCreated) {
        //implement business logic here:

        /** Example 1:  new item 
        Marketing marketing = new Marketing();
        repository().save(marketing);

        */

        /** Example 2:  finding and process
        
        repository().findById(productCreated.get???()).ifPresent(marketing->{
            
            marketing // do something
            repository().save(marketing);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
