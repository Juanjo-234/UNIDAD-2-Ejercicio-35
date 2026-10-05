import java.util.ArrayList;
import java.util.List;
void main() {
    List<EstrategiaEnvio> estrategias = new ArrayList<>();
    estrategias.add(new EnvioEstandar(10.0));
    estrategias.add(new EnvioExpresoAereo(25.0));
    estrategias.add(new EnviarMaritimo(15.0));

    double pesoPaquete = 12.5;
    double distanciaRecorrido = 450.0;

    System.out.println("=== Desglose de Costos de Envío ===");
    System.out.println("Peso: " + pesoPaquete + " kg | Distancia: " + distanciaRecorrido + " km\n");

    for (EstrategiaEnvio estrategia : estrategias) {
        try {
            double costoTotal = estrategia.calcularCosto(pesoPaquete, distanciaRecorrido);
            System.out.println("Modalidad: " + estrategia.getClass().getSimpleName());
            System.out.printf("Costo Calculado: $%.2f\n", costoTotal);
            System.out.println("-----------------------------------");
        } catch (IllegalArgumentException e) {
            System.err.println("Error en " + estrategia.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }
}

