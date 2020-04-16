package com.palysafe.convertunits.rest;

import com.palysafe.convertunits.beans.ConversionBean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversionController {

    @PostMapping("/ktom")
    public ResponseEntity<ConversionBean> convertKilometers(@RequestBody ConversionBean conversionBean){
        return ResponseEntity.status(200).body(conversionBean);
    }

    @PostMapping("/mtok")
    public ResponseEntity<ConversionBean> convertMiles(@RequestBody ConversionBean conversionBean){
        return ResponseEntity.status(200).body(conversionBean);
    }

    @PostMapping("/ktoc")
    public ResponseEntity<ConversionBean> convertKelvins(@RequestBody ConversionBean conversionBean){
        return ResponseEntity.status(200).body(conversionBean);
    }

    @PostMapping("/ctok")
    public ResponseEntity<ConversionBean> convertCelcius(@RequestBody ConversionBean conversionBean){
        return ResponseEntity.status(200).body(conversionBean);
    }

}
