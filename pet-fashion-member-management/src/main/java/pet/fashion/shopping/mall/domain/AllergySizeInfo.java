package pet.fashion.shopping.mall.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import pet.fashion.shopping.mall.PetFashionMemberManagementApplication;
import pet.fashion.shopping.mall.domain.AllergySizeInfoAdded;

@Entity
@Table(name = "AllergySizeInfo_table")
@Data
//<<< DDD / Aggregate Root
public class AllergySizeInfo {

    @Id
    private String allergy;

    private String sizeInfo;

    @PostPersist
    public void onPostPersist() {
        AllergySizeInfoAdded allergySizeInfoAdded = new AllergySizeInfoAdded(
            this
        );
        allergySizeInfoAdded.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static AllergySizeInfoRepository repository() {
        AllergySizeInfoRepository allergySizeInfoRepository = PetFashionMemberManagementApplication.applicationContext.getBean(
            AllergySizeInfoRepository.class
        );
        return allergySizeInfoRepository;
    }
}
//>>> DDD / Aggregate Root
