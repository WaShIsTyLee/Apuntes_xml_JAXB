package com.github.washistylee.EjemploJAXB.Test;

import com.github.washistylee.EjemploJAXB.DataAccess.XMLManager;
import com.github.washistylee.EjemploJAXB.Model.User;

public class Prueba1 {
    public static void main(String[] args) {
       // User u = new User("Gloria","g@g.com",5);
        // XMLManager.writeXML(u, "user.xml");

        User u = XMLManager.readXML(new User(), "user.xml");
        System.out.println(u);

    }
}

