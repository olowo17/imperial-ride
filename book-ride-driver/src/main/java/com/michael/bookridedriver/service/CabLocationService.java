package com.michael.bookridedriver.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.michael.bookridedriver.constant.AppConstant.CAB_LOCATION;

@Service
@RequiredArgsConstructor
public class CabLocationService {
    private final KafkaTemplate <String, Object> kafkaTemplate;

    public void updateLocation(String location){
        kafkaTemplate.send(CAB_LOCATION,location);
    }
}
