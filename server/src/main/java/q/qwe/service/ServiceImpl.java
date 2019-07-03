package q.qwe.service;

import q.qwe.Student;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class ServiceImpl implements IService{

    @GET
    @Path("/{nickName}")
    @Produces(MediaType.APPLICATION_XML)
    public Student addNickName(@PathParam("nickName")final String nickName) {
        return getVasya(nickName);
    }


    private Student getVasya(String nickName) {
        Student Vasya = new Student();
        Vasya.setName("Vasya"+nickName);
        Vasya.setAge(22);
        return Vasya;
    }
    @GET
    @Path("/hi")
    @Produces(MediaType.APPLICATION_XML)
    public String getString(){
        return getVasya("dcfds").toString();
    }
}
