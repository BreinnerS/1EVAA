package org.example;

import java.util.ArrayList;
import java.util.List;

public class cumple_repository {

    private List<cumple_agenda> LISTA = new ArrayList<>();

    public List<cumple_agenda> GetLista() {
        return LISTA;
    }

    public void AddCumple(cumple_agenda cumple) {
        LISTA.add(cumple);
    }

    public cumple_agenda BuscarPorNombre(String nombre) {
        for (cumple_agenda c : LISTA) {
            if (c.GetNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    public List<cumple_agenda> BuscarPorDia(int dia) {
        List<cumple_agenda> resultado = new ArrayList<>();
        for (cumple_agenda c : LISTA) {
            if (c.GetDia() == dia) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    public boolean EliminarPorNombre(String nombre) {
        cumple_agenda encontrado = BuscarPorNombre(nombre);
        if (encontrado != null) {
            LISTA.remove(encontrado);
            return true;
        }
        return false;
    }
}
