package pet.fashion.shopping.mall.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import pet.fashion.shopping.mall.config.kafka.KafkaProcessor;
import pet.fashion.shopping.mall.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    PetProfileRepository petProfileRepository;

    @Autowired
    AllergySizeInfoRepository allergySizeInfoRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='MemberRegistered'"
    )
    public void wheneverMemberRegistered_PetProfileManagementPolicy(
        @Payload MemberRegistered memberRegistered
    ) {
        MemberRegistered event = memberRegistered;
        System.out.println(
            "\n\n##### listener PetProfileManagementPolicy : " +
            memberRegistered +
            "\n\n"
        );
        // Sample Logic //

    }
}
//>>> Clean Arch / Inbound Adaptor
