public class EnvioExpresoAereo extends EstrategiaEnvio{
    public EnvioExpresoAereo(double tarifaBase) {
        super(tarifaBase);
    }

    @Override
    public double calcularCosto(double pesoKg, double distanciaKm) {
        return tarifaBase + (pesoKg * 2.5) + (distanciaKm * 0.4);
    }
}
