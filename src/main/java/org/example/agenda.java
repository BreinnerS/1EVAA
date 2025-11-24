package org.example;

public class cumple_agenda {

    private String NOMBRE;
    private int DIA;
    private int MES;

    public cumple_agenda(String nombre, int dia, int mes) {
        this.NOMBRE = nombre;
        this.DIA = dia;
        this.MES = mes;
    }

    public String GetNombre() {
        return NOMBRE;
    }

    public int GetDia() {
        return DIA;
    }

    public int GetMes() {
        return MES;
    }
}
