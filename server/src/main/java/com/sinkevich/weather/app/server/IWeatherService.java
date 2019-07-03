package com.sinkevich.weather.app.server;

import com.sinkevich.weather.app.model.Root;


public interface IWeatherService {
    Root getWeatherByName(String name);
}
