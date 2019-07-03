package q.qwe.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import q.qwe.Root;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

@Slf4j
public class WeatherServiceImpl implements IWeatherService {

    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Root getWeatherByName(@PathParam("name")final String name) {
        return getWeather(name);
    }

    private Root getWeather(String name) {
        ObjectMapper objectMapper = new ObjectMapper();
        Root weather = null;
        URL url = null;
        try {
            url = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + name + "&APPID=5a24b0fd61554b231576e01d5323b64b");
            log.info(url.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        try {
           weather = objectMapper.readValue(url, Root.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return weather;
    }


}
