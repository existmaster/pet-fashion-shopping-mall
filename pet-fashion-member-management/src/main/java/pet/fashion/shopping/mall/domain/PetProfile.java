package pet.fashion.shopping.mall.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import pet.fashion.shopping.mall.PetFashionMemberManagementApplication;
import pet.fashion.shopping.mall.domain.PetProfileCreated;
import pet.fashion.shopping.mall.domain.PetProfileDeleted;

@Entity
@Table(name = "PetProfile_table")
@Data
//<<< DDD / Aggregate Root
public class PetProfile {

    private String name;

    private String species;

    private Integer age;

    private Photo photo;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        PetProfileCreated petProfileCreated = new PetProfileCreated(this);
        petProfileCreated.publishAfterCommit();

        PetProfileDeleted petProfileDeleted = new PetProfileDeleted(this);
        petProfileDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static PetProfileRepository repository() {
        PetProfileRepository petProfileRepository = PetFashionMemberManagementApplication.applicationContext.getBean(
            PetProfileRepository.class
        );
        return petProfileRepository;
    }

    //<<< Clean Arch / Port Method
    public void updatePetProfile() {
        //implement business logic here:

        PetProfileUpdated petProfileUpdated = new PetProfileUpdated(this);
        petProfileUpdated.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
