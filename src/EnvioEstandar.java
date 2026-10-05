public class EnvioEstandar extends EstrategiaEnvio{
    public EnvioEstandar(double tarifaBase) {
        super(tarifaBase);
    }

    @Override
    public double calcularCosto(double pesoKg, double distanciaKm) {
        return tarifaBase + (pesoKg * 0.5) + (distanciaKm * 0.10);
    }
}
