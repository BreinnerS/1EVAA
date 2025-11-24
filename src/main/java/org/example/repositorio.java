package org.example;

import java.util.ArrayList;
import java.util.List;

public class repositorio {

    private List<agenda> LISTA = new ArrayList<>();

    public List<agenda> GetLista() {
        return LISTA;
    }

    public void AddCumple(agenda cumple) {
        LISTA.add(cumple);
    }

    public agenda BuscarPorNombre(String nombre) {
        for (agenda c : LISTA) {
            if (c.GetNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    public List<agenda> BuscarPorDia(int dia) {
        List<agenda> resultado = new ArrayList<>();
        for (agenda c : LISTA) {
            if (c.GetDia() == dia) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    public boolean EliminarPorNombre(String nombre) {
        agenda encontrado = BuscarPorNombre(nombre);
        if (encontrado != null) {
            LISTA.remove(encontrado);
            return true;
        }
        return false;
    }
}
