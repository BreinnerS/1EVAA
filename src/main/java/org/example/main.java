package org.example;

import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        repositorio REPO = new repositorio();
        Scanner SC = new Scanner(System.in);
        boolean SALIR = false;

        while (!SALIR) {

            impresion();

            String opcion = SC.nextLine();

            switch (opcion) {

                case "1":
                    menu1(REPO);
                    break;

                case "2":
                    menu2(SC, REPO);
                    break;

                case "3":
                    menu3(SC, REPO);
                    break;

                case "4":
                    menu4(SC, REPO);
                    break;

                case "5":
                    menu5(SC, REPO);
                    break;

                case "6":
                    SALIR = menu6();
                    break;
            }
        }
    }

    private static boolean menu6() {
        boolean SALIR;
        SALIR = true;
        return SALIR;
    }

    private static void menu5(Scanner SC, repositorio REPO) {
        System.out.print("Nombre a eliminar: ");
        String NOMBRE_ELIM = SC.nextLine();
        REPO.EliminarPorNombre(NOMBRE_ELIM);
    }

    private static void menu4(Scanner SC, repositorio REPO) {
        System.out.print("Nombre: ");
        String NOMBRE = SC.nextLine();
        System.out.print("Día: ");
        int D = Integer.parseInt(SC.nextLine());
        System.out.print("Mes: ");
        int M = Integer.parseInt(SC.nextLine());

        REPO.AddCumple(new agenda(NOMBRE, D, M));
    }

    private static void menu3(Scanner SC, repositorio REPO) {
        System.out.print("Nombre: ");
        String NOMBRE_BUSCAR = SC.nextLine();
        agenda encontrado = REPO.BuscarPorNombre(NOMBRE_BUSCAR);

        if (encontrado == null) {
            System.out.println("No encontrado.");
        } else {
            System.out.println(encontrado.GetNombre() + ": " +
                    encontrado.GetDia() + "/" + encontrado.GetMes());
        }
    }

    private static void menu2(Scanner SC, repositorio REPO) {
        System.out.print("Día: ");
        int DIA = Integer.parseInt(SC.nextLine());
        List<agenda> porDia = REPO.BuscarPorDia(DIA);

        if (porDia.isEmpty()) {
            System.out.println("Sin resultados.");
        } else {
            for (agenda c : porDia) {
                System.out.println(c.GetNombre() + ": " + c.GetDia() + "/" + c.GetMes());
            }
        }
    }

    private static void menu1(repositorio REPO) {
        List<agenda> lista = REPO.GetLista();
        if (lista.isEmpty()) {
            System.out.println("Vacío.");
        } else {
            for (agenda c : lista) {
                System.out.println(c.GetNombre() + ": " + c.GetDia() + "/" + c.GetMes());
            }
        }
    }

    private static void impresion() {
        System.out.println("\n=== AGENDA ===");
        System.out.println("1. Listar");
        System.out.println("2. Buscar por día");
        System.out.println("3. Buscar por nombre");
        System.out.println("4. Añadir");
        System.out.println("5. Eliminar");
        System.out.println("6. Salir");
        System.out.print("Opción: ");
    }
}
