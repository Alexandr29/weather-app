package q.qwe;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Clouds
{
    private int all;

    public void setAll(int all){
        this.all = all;
    }
    public int getAll(){
        return this.all;
    }

    @Override
    public String toString() {
        return "Clouds{" +
                "all=" + all +
                '}';
    }
}