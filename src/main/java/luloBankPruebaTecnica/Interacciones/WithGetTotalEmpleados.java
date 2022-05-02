package luloBankPruebaTecnica.Interacciones;

import io.restassured.http.ContentType;
import luloBankPruebaTecnica.Herramientas.Data;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static luloBankPruebaTecnica.Herramientas.enums.RestServices.TOTAL_EMPLEADOS;

public class WithGetTotalEmpleados implements Interaction {
    Data Data = new Data();
    public WithGetTotalEmpleados() {}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Get.resource(String.format(TOTAL_EMPLEADOS.toString()))
                .with(requestSpecification -> requestSpecification
                        ));



    }
}

