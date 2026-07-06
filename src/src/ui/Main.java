package ui;

import data.GestorServicios;

public class Main {

    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();

        gestor.cargarServicios();

        System.out.println("=== SERVICIOS TURÍSTICOS ===");

        gestor.mostrarServicios();
    }
}