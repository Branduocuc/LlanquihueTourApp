package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

public class GestorServicios {

    public void crearServicios() {

        RutaGastronomica ruta1 =
                new RutaGastronomica("Ruta Sabores del Sur", 4, 5);

        RutaGastronomica ruta2 =
                new RutaGastronomica("Ruta Tradiciones", 3, 4);

        PaseoLacustre paseo1 =
                new PaseoLacustre("Lago Llanquihue", 2, "Catamarán");

        PaseoLacustre paseo2 =
                new PaseoLacustre("Lago Todos los Santos", 3, "Lancha");

        ExcursionCultural excursion1 =
                new ExcursionCultural("Patrimonio Chilote", 5, "Iglesia de Castro");

        ExcursionCultural excursion2 =
                new ExcursionCultural("Fuerte Niebla", 4, "Fuerte Histórico");

        System.out.println(ruta1);
        System.out.println(ruta2);
        System.out.println(paseo1);
        System.out.println(paseo2);
        System.out.println(excursion1);
        System.out.println(excursion2);
    }
}