package com.company;

import javax.swing.*;
import java.awt.*;


public class PersonajesStarWars {

    public static void main(String[] args){
        JFrame marcoTable = new MarcoTabla();

        marcoTable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marcoTable.setVisible(true);

    }



}

class MarcoTabla extends JFrame{
    public MarcoTabla(){
        setTitle("Personajes de Star Wars");



        setBounds(500,300,500,300);
        JTable tablaInformacion = new JTable(valores,nombresValores);
        tablaInformacion.setBounds(30,40,200,300);
        add(new JScrollPane(tablaInformacion), BorderLayout.CENTER);
    }
    public String [] nombresValores = {"Nombre","Altura","Año de Nacimiento"};

    public Object [][] valores = {

            {"BabyYoda","0.42","1971"},
            {"Han Solo","1.85","1971"},
            {"BabyYoda","0.42","1971"},
            {"BabyYoda","0.42","1971"},
            {"Han Solo","1.85","1971"},
            {"BabyYoda","0.42","1971"},
            {"BabyYoda","0.42","1971"},
            {"Han Solo","1.85","1971"},
            {"BabyYoda","0.42","1971"},
            {"BabyYoda","0.42","1971"},
            {"Han Solo","1.85","1971"},
            {"BabyYoda","0.42","1971"},
            {"BabyYoda","0.42","1971"},
            {"Han Solo","1.85","1971"},
            {"BabyYoda","0.42","1971"},
            {"BabyYoda","0.42","1971"}
    };


}
