package luloBankPruebaTecnica.Interacciones;

import luloBankPruebaTecnica.Herramientas.Data;
import luloBankPruebaTecnica.Herramientas.enums.RestServices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Delete;

import static luloBankPruebaTecnica.Herramientas.enums.RestServices.BORRAR_EMPLEADO;

public class WithPostBorrarEmpleado implements Interaction {
    luloBankPruebaTecnica.Herramientas.Data Data = new Data();

    public WithPostBorrarEmpleado() {}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Delete.from(String.format(BORRAR_EMPLEADO.toString(),Data.obtenerDatos("empleadoBorrar")))
                .with(requestSpecification -> requestSpecification));


    }
}
