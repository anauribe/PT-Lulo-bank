package luloBankPruebaTecnica.Herramientas.enums;

public enum RestServices {
    TOTAL_EMPLEADOS("/api/v1/employees"),
    EMPLEADO("/api/v1/employee/%s"),
    BORRAR_EMPLEADO("/public/api/v1/delete/%s"),
    CREAR_EMPLEADO("/api/v1/create");

    private final String uri;

    RestServices(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() { return uri; }

}



