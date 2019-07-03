package com.sinkevich.weather.app.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Getter
@Setter
@ToString
@XmlRootElement
public class Root {

    private Coord coord;
    private List<Weather> weather;
    private String base;
    private Main main;
    private int visibility;
    private Wind wind;
    private Clouds clouds;
    private int dt;
    private Sys sys;
    private int timezone;
    private int id;
    private String name;
    private int cod;

}