package luloBankPruebaTecnica.Interacciones;

import io.restassured.http.ContentType;
import luloBankPruebaTecnica.Herramientas.Data;
import luloBankPruebaTecnica.Herramientas.enums.RestServices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static luloBankPruebaTecnica.Herramientas.enums.RestServices.CREAR_EMPLEADO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class WithPostCrearEmpleado implements Interaction {
    luloBankPruebaTecnica.Herramientas.Data Data = new Data();

    public WithPostCrearEmpleado() {}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to(RestServices.CREAR_EMPLEADO.toString())
                .with(requestSpecification -> requestSpecification));

    }
}
