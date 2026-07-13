package ui;

import data.GestorEntidades;
import model.Guia;
import model.Embarcacion;
import model.AtractivoTuristico;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        GestorEntidades gestor = new GestorEntidades();




        String nombreGuia = JOptionPane.showInputDialog(
                "Ingrese el nombre del guía:"
        );

        if (nombreGuia == null) {
            cerrarPrograma();
            return;
        }

        String especialidadGuia = JOptionPane.showInputDialog(
                "Ingrese la especialidad del guía:"
        );

        if (especialidadGuia == null) {
            cerrarPrograma();
            return;
        }

        Guia guia = new Guia(nombreGuia, especialidadGuia);

        gestor.agregarEntidad(guia);




        String nombreEmbarcacion = JOptionPane.showInputDialog(
                "Ingrese el nombre de la embarcación:"
        );

        if (nombreEmbarcacion == null) {
            cerrarPrograma();
            return;
        }

        String tipoEmbarcacion = JOptionPane.showInputDialog(
                "Ingrese el tipo de embarcación:"
        );

        if (tipoEmbarcacion == null) {
            cerrarPrograma();
            return;
        }




        int capacidad = 0;
        boolean capacidadValida = false;

        while (!capacidadValida) {

            String entradaCapacidad = JOptionPane.showInputDialog(
                    "Ingrese la capacidad de la embarcación:"
            );


            if (entradaCapacidad == null) {
                cerrarPrograma();
                return;
            }

            try {

                capacidad = Integer.parseInt(entradaCapacidad);

                if (capacidad > 0) {

                    capacidadValida = true;

                } else {

                    JOptionPane.showMessageDialog(
                            null,
                            "La capacidad debe ser mayor que 0.",
                            "Dato inválido",
                            JOptionPane.WARNING_MESSAGE
                    );
                }

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(
                        null,
                        "Error: debe ingresar un número válido.",
                        "Error de entrada",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }


        Embarcacion embarcacion = new Embarcacion(
                nombreEmbarcacion,
                tipoEmbarcacion,
                capacidad
        );

        gestor.agregarEntidad(embarcacion);




        String nombreAtractivo = JOptionPane.showInputDialog(
                "Ingrese el nombre del atractivo turístico:"
        );

        if (nombreAtractivo == null) {
            cerrarPrograma();
            return;
        }

        String ubicacionAtractivo = JOptionPane.showInputDialog(
                "Ingrese la ubicación del atractivo turístico:"
        );

        if (ubicacionAtractivo == null) {
            cerrarPrograma();
            return;
        }

        String tipoAtractivo = JOptionPane.showInputDialog(
                "Ingrese el tipo del atractivo turístico:"
        );

        if (tipoAtractivo == null) {
            cerrarPrograma();
            return;
        }


        AtractivoTuristico atractivo = new AtractivoTuristico(
                nombreAtractivo,
                ubicacionAtractivo,
                tipoAtractivo
        );

        gestor.agregarEntidad(atractivo);




        String resumenFinal =
                "=== ENTIDADES REGISTRADAS ===\n\n" +

                        guia.mostrarResumen() +

                        "\n\n-------------------------\n\n" +

                        embarcacion.mostrarResumen() +

                        "\n\n-------------------------\n\n" +

                        atractivo.mostrarResumen();




        JOptionPane.showMessageDialog(
                null,
                resumenFinal,
                "Resumen de entidades",
                JOptionPane.INFORMATION_MESSAGE
        );




        System.out.println("=== ENTIDADES REGISTRADAS ===");

        gestor.mostrarEntidades();
    }




    private static void cerrarPrograma() {

        JOptionPane.showMessageDialog(
                null,
                "Operación cancelada. El programa se cerrará.",
                "Programa finalizado",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}



