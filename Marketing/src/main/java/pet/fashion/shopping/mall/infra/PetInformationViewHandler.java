package pet.fashion.shopping.mall.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import pet.fashion.shopping.mall.config.kafka.KafkaProcessor;
import pet.fashion.shopping.mall.domain.*;

@Service
public class PetInformationViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private PetInformationRepository petInformationRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenPetProfileCreated_then_CREATE_1(
        @Payload PetProfileCreated petProfileCreated
    ) {
        try {
            if (!petProfileCreated.validate()) return;

            // view 객체 생성
            PetInformation petInformation = new PetInformation();
            // view 객체에 이벤트의 Value 를 set 함
            petInformation.setId(petProfileCreated.getId());
            petInformation.setMemberId(
                String.valueOf(petProfileCreated.getMemberId())
            );
            petInformation.setNeckCircumference(
                petProfileCreated.getNeckCircumference()
            );
            petInformation.setChestCircumference(
                petProfileCreated.getChestCircumference()
            );
            // view 레파지 토리에 save
            petInformationRepository.save(petInformation);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenPetProfileUpdated_then_UPDATE_1(
        @Payload PetProfileUpdated petProfileUpdated
    ) {
        try {
            if (!petProfileUpdated.validate()) return;
            // view 객체 조회
            Optional<PetInformation> petInformationOptional = petInformationRepository.findById(
                petProfileUpdated.getId()
            );

            if (petInformationOptional.isPresent()) {
                PetInformation petInformation = petInformationOptional.get();
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                petInformation.setNeckCircumference(
                    petProfileUpdated.getNeckCircumference()
                );
                petInformation.setChestCircumference(
                    petProfileUpdated.getChestCircumference()
                );
                // view 레파지 토리에 save
                petInformationRepository.save(petInformation);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenPetProfileDeleted_then_DELETE_1(
        @Payload PetProfileDeleted petProfileDeleted
    ) {
        try {
            if (!petProfileDeleted.validate()) return;
            // view 레파지 토리에 삭제 쿼리
            petInformationRepository.deleteById(petProfileDeleted.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //>>> DDD / CQRS
}
