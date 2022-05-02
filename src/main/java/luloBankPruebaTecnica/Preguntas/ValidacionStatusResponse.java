package luloBankPruebaTecnica.Preguntas;

import luloBankPruebaTecnica.Herramientas.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ValidacionStatusResponse implements Question<Boolean> {

    Data Data = new Data();

    private final String status;
    private boolean statusResponse = true;

    public ValidacionStatusResponse(String status) {
        this.status = status;
    }

    public static ValidacionStatusResponse is(String status) {
        return new ValidacionStatusResponse(status);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        assertThat(Data.obtenerDatos("status"),equalTo(status));
        return statusResponse;
    }

}
