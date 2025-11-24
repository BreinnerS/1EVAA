package org.example;

public class agenda {

    private String NOMBRE;
    private int DIA;
    private int MES;

    public agenda(String nombre, int dia, int mes) {
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
