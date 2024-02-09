package com.michael.bookridedriver.controller;

import com.michael.bookridedriver.service.CabLocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/locations")
@RequiredArgsConstructor
public class CabLocationController {

    private final CabLocationService cabLocationService;

    @PutMapping
    public ResponseEntity<?> updateLocation () throws InterruptedException {
        int range = 100;
        while(range > 0){
            cabLocationService.updateLocation(Math.random()+ " , " + Math.random());
            Thread.sleep(1000);
            range --;
        }

        return new ResponseEntity<>(Map.of("Message", "Location Updated"), HttpStatus.OK);
    }
}
