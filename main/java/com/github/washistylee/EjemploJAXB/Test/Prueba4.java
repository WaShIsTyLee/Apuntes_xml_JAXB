package com.github.washistylee.EjemploJAXB.Test;

import com.github.washistylee.EjemploJAXB.Model.Agenda_Singleton;
import com.github.washistylee.EjemploJAXB.Model.User;

public class Prueba4 {
    public static void main(String[] args) {
        Agenda_Singleton agenda = Agenda_Singleton.getInstance();
        System.out.println(agenda);
        agenda.addUser(new User("MARTA","m@gmail.com",3L));
    }
}
