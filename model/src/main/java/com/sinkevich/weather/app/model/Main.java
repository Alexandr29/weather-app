package com.sinkevich.weather.app.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@ToString
@XmlRootElement
public class Main {

    private double temp;
    private int pressure;
    private int humidity;
    private double temp_min;
    private double temp_max;

}