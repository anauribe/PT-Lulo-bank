package luloBankPruebaTecnica.Herramientas;


import net.serenitybdd.screenplay.actors.*;
import net.serenitybdd.screenplay.rest.abilities.*;

import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Ambiente {


    public static void PrepararEscenario(String urlBase) {
        OnStage.setTheStage(new OnlineCast());
       theActorCalled("juan").whoCan(CallAnApi.at(urlBase));
    }


}
