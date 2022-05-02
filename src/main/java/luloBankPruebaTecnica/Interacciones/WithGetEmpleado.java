package luloBankPruebaTecnica.Interacciones;

import io.restassured.http.ContentType;
import luloBankPruebaTecnica.Herramientas.Data;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static luloBankPruebaTecnica.Herramientas.enums.RestServices.EMPLEADO;

public class WithGetEmpleado implements Interaction {
    Data Data = new Data();
    public WithGetEmpleado() {}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Get.resource(String.format(EMPLEADO.toString(),Data.obtenerDatos("empleado")))
                .with(requestSpecification -> requestSpecification
                        ));





    }
}

