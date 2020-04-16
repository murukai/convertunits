package com.palysafe.convertunits.service;

import com.palysafe.convertunits.beans.ConversionBean;

public class ConversionServiceImpl implements ConversionService {

    private static Double DISTANCE_RATIO = 0.621371;
    private static Double TEMPERATURE_FACTOR = 273.15;

    @Override
    public ConversionBean convertDistance(ConversionBean conversionBean) {
        if(conversionBean.getConvertFrom().equalsIgnoreCase("KM")){
            conversionBean.setConvertedValue(DISTANCE_RATIO * conversionBean.getConvertValue());
        }else{
            conversionBean.setConvertedValue(conversionBean.getConvertValue() / DISTANCE_RATIO);
        }

        return conversionBean;
    }

    @Override
    public ConversionBean convertTemperature(ConversionBean conversionBean) {
        if(conversionBean.getConvertTo().equalsIgnoreCase("CELCIUS")){
            conversionBean.setConvertedValue(conversionBean.getConvertValue() - TEMPERATURE_FACTOR);
        }else {
            conversionBean.setConvertedValue(conversionBean.getConvertValue() + TEMPERATURE_FACTOR);
        }
        return conversionBean;
    }
}
