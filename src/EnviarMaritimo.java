public class EnviarMaritimo extends EstrategiaEnvio{
    public EnviarMaritimo(double tarifaBase) {
        super(tarifaBase);
    }

    @Override
    public double calcularCosto(double pesoKg, double distanciaKm) {
        return tarifaBase + (pesoKg * 0.2) + (distanciaKm * 0.05);
    }
}
