package q.qwe;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Wind
{
    private int speed;

    private int deg;

    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return this.speed;
    }
    public void setDeg(int deg){
        this.deg = deg;
    }
    public int getDeg(){
        return this.deg;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "speed=" + speed +
                ", deg=" + deg +
                '}';
    }
}