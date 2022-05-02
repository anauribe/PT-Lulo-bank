package luloBankPruebaTecnica.Interacciones;

import net.serenitybdd.screenplay.Tasks;

public class ConsumoServicios {

    public static WithGetTotalEmpleados WithGetEmpleados() {
        return Tasks.instrumented(WithGetTotalEmpleados.class);
    }

    public static WithPostCrearEmpleado WithPostCrear() {
        return Tasks.instrumented(WithPostCrearEmpleado.class);
    }

    public static WithPostCrearEmpleado WithPostCrearEmpleado() {
        return Tasks.instrumented(WithPostCrearEmpleado.class);
    }
    public static WithPostBorrarEmpleado WithPostBorrarEmpleado() {
        return Tasks.instrumented(WithPostBorrarEmpleado.class);
    }
}
