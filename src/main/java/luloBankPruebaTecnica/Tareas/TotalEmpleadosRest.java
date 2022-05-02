package luloBankPruebaTecnica.Tareas;

import luloBankPruebaTecnica.Herramientas.Data;
import luloBankPruebaTecnica.Interacciones.ConsumoServicios;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class TotalEmpleadosRest implements Task {

    Data Data = new Data();

    public static TotalEmpleadosRest with() {
        return Tasks.instrumented(TotalEmpleadosRest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(ConsumoServicios.WithGetEmpleados());
        Data.guardarDatos("status", SerenityRest.lastResponse().jsonPath().getString("status"));
        Data.guardarDatos("statusCode", String.valueOf(SerenityRest.lastResponse().statusCode()));
        }

    }
