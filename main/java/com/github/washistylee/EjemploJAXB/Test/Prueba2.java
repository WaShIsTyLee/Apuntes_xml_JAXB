package com.github.washistylee.EjemploJAXB.Test;

import com.github.washistylee.EjemploJAXB.DataAccess.XMLManager;
import com.github.washistylee.EjemploJAXB.Model.Agenda;
import com.github.washistylee.EjemploJAXB.Model.User;

public class Prueba2 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.addUser(new User("e","e@gmail.com",2));
        agenda.addUser(new User("a","a@gmail.com",4));

        XMLManager.writeXML(agenda, "agenda.xml");
    }

}
