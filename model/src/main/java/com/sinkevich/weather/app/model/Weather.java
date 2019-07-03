package com.sinkevich.weather.app.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@ToString
@XmlRootElement
public class Weather {

    private int id;
    private String main;
    private String description;
    private String icon;

}



