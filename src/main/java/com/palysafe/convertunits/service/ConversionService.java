package com.palysafe.convertunits.service;

import com.palysafe.convertunits.beans.ConversionBean;

public interface ConversionService {

    ConversionBean convertDistance(ConversionBean conversionBean);

    ConversionBean convertTemperature(ConversionBean conversionBean);
}
