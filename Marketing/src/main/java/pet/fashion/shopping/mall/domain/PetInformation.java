package pet.fashion.shopping.mall.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "PetInformation_table")
@Data
public class PetInformation {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String memberId;
    private String allergies;
    private Integer neckCircumference;
    private Integer chestCircumference;
}
