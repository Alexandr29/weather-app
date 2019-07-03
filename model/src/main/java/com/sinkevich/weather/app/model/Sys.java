package com.sinkevich.weather.app.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@ToString
@XmlRootElement
public class Sys {

    private int type;
    private int id;
    private double message;
    private String country;
    private int sunrise;
    private int sunset;

}
