package com.palysafe.convertunits.rest;

import com.palysafe.convertunits.beans.ConversionBean;
import com.palysafe.convertunits.service.ConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ConversionController {

    @Autowired
    private ConversionService conversionService;

    @PostMapping("/ktom")
    public ConversionBean convertKilometers(@Valid @RequestBody ConversionBean conversionBean){
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(conversionBean.getConvertValue() + " " + conversionBean.getConvertFrom() + " = " + conversionBean.getConvertedValue() + " " + conversionBean.getConvertTo());
        conversionBean = conversionService.convertDistance(conversionBean);

        conversionBean.setMessage(stringBuffer.toString());
        return conversionBean;
    }


    @PostMapping("/mtok")
    public ConversionBean convertMiles(@Valid @RequestBody ConversionBean conversionBean){
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(conversionBean.getConvertValue() + " " + conversionBean.getConvertFrom() + " = " + conversionBean.getConvertedValue() + " " + conversionBean.getConvertTo());
        conversionBean = conversionService.convertDistance(conversionBean);

        conversionBean.setMessage(stringBuffer.toString());
        return conversionBean;
    }

    @PostMapping("/ktoc")
    public ConversionBean convertKelvins(@Valid @RequestBody ConversionBean conversionBean){
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(conversionBean.getConvertValue() + " degrees " + conversionBean.getConvertFrom() + " = " + conversionBean.getConvertedValue() +  " degrees " + conversionBean.getConvertTo());


        conversionBean = conversionService.convertTemperature(conversionBean);

        conversionBean.setMessage(stringBuffer.toString());

        return conversionBean;
    }



    @PostMapping("/ctok")
    public ConversionBean convertCelcius(@Valid @RequestBody ConversionBean conversionBean){
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(conversionBean.getConvertValue() + " degrees " + conversionBean.getConvertFrom() + " = " + conversionBean.getConvertedValue() +  " degrees " + conversionBean.getConvertTo());


        conversionBean = conversionService.convertTemperature(conversionBean);

        conversionBean.setMessage(stringBuffer.toString());

        return conversionBean;
    }



}
