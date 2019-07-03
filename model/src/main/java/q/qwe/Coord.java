package q.qwe;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Coord
{
    private double lon;

    private double lat;

    public void setLon(double lon){
        this.lon = lon;
    }
    public double getLon(){
        return this.lon;
    }
    public void setLat(double lat){
        this.lat = lat;
    }
    public double getLat(){
        return this.lat;
    }

    @Override
    public String toString() {
        return "Coord{" +
                "lon=" + lon +
                ", lat=" + lat +
                '}';
    }
}