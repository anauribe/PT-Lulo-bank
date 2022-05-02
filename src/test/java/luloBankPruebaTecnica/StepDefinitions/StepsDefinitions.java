package luloBankPruebaTecnica.StepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import luloBankPruebaTecnica.Herramientas.Ambiente;
import luloBankPruebaTecnica.Herramientas.Data;
import luloBankPruebaTecnica.Preguntas.ValidacionStatusCodeResponse;
import luloBankPruebaTecnica.Preguntas.ValidacionStatusResponse;
import luloBankPruebaTecnica.Tareas.BorrarEmpleadoRest;
import luloBankPruebaTecnica.Tareas.CrearEmpleadoRest;
import luloBankPruebaTecnica.Tareas.EmpleadoRest;
import luloBankPruebaTecnica.Tareas.TotalEmpleadosRest;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepsDefinitions {

    Data Data = new Data();

    @Given("^that Juan usa el servicio para (.*)$")
    public void thatJuanUsaElServicioPara(String urlBase) throws IOException {
        Data.datosPrueba(urlBase);
        Ambiente.PrepararEscenario(Data.obtenerDatos(urlBase));
    }
    @When("^El consume el servicio para consultar todos los empleados$")
    public void ElConsumeElServicioParaConsultarTodosLosEmpleados() {
        theActorInTheSpotlight().attemptsTo(TotalEmpleadosRest.with());
    }
    @When("El Consume El Servicio Para La Creacion")
    public void ElConsumeElServicioParaLaCreacion() {
        theActorInTheSpotlight().attemptsTo(CrearEmpleadoRest.with());
    }
    @Then("El Consume el Servicio para consultar el empleado {int}")
    public void ElConsumeElServicioParaConsultarElEmpleado(int empleado) {
        Data.guardarDatos("empleado", String.valueOf(empleado));
        theActorInTheSpotlight().attemptsTo(EmpleadoRest.with());
    }
    @Then("El Consume el Servicio para borrar el empleado {int}")
    public void ElConsumeElServicioParaBorrarElEmpleado(int empleadoBorrar) {
        Data.guardarDatos("empleadoBorrar", String.valueOf(empleadoBorrar));
        theActorInTheSpotlight().attemptsTo(BorrarEmpleadoRest.with());
    }
    @Then("Se espera un status Code {int}")
    public void SeEsperaUnStatusCode (int statusCode) {
        theActorInTheSpotlight().should(seeThat(ValidacionStatusCodeResponse.
                is(String.valueOf(statusCode))));
    }

    @Then("Se espera recibir en el body un {string}")
    public void SeEsperaRecibirEnElBodyUn(String status) {
        theActorInTheSpotlight().should(seeThat(ValidacionStatusResponse.is(status)));

    }




}
