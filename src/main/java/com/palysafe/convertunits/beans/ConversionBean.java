package com.palysafe.convertunits.beans;


/**
 * This is a bean used to convert the values
 */
public class ConversionBean {

    private String convertFrom;
    private String convertTo;
    private Double convertValue;
    private Double convertedValue;
    private String message;


    public String getConvertFrom() {
        return convertFrom;
    }

    public void setConvertFrom(String convertFrom) {
        this.convertFrom = convertFrom;
    }

    public String getConvertTo() {
        return convertTo;
    }

    public void setConvertTo(String convertTo) {
        this.convertTo = convertTo;
    }

    public Double getConvertValue() {
        return convertValue;
    }

    public void setConvertValue(Double convertValue) {
        this.convertValue = convertValue;
    }

    public Double getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(Double convertedValue) {
        this.convertedValue = convertedValue;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
