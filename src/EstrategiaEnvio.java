public abstract class EstrategiaEnvio {
    double tarifaBase;
    public  EstrategiaEnvio(double tarifaBase){
        this.tarifaBase = tarifaBase;
    }

    public abstract double calcularCosto(double pesoKg, double distanciaKm);

    protected void validarParametros(double pesoKg, double distanciaKm) {
        if (pesoKg < 0) {
            throw new IllegalArgumentException("Error: El peso en kg no puede ser negativo.");
        }
        if (distanciaKm < 0) {
            throw new IllegalArgumentException("Error: La distancia en km no puede ser negativa.");
        }
    }
}
