package com.github.washistylee.EjemploJAXB.Model;

import com.github.washistylee.EjemploJAXB.DataAccess.XMLManager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "agenda")
@XmlAccessorType(XmlAccessType.FIELD)
public class Agenda_Singleton {
    @Serial
    private final static long serialVersionUID = 1L;
    private static Agenda_Singleton _instance;
    private static final String FILENAME = "agenda.xml";

    private List<User> users;

    public Agenda_Singleton() {
        users = new ArrayList<>();
    }
    public static Agenda_Singleton getInstance(){
        if (_instance==null){
             _instance = XMLManager.readXML(new Agenda_Singleton(),FILENAME);
        }
        return _instance;

    }
    public boolean save(){
        return XMLManager.writeXML(this,FILENAME);
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public boolean addUser(User u) {
        boolean result= this.users.add(u);
        save();
        return result;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "users=" + users +
                '}';
    }
}

