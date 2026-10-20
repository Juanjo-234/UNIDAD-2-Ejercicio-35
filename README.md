Este programa está diseñado para modelar y calcular el costo de envíos logísticos utilizando diferentes tarifas y normativas de transporte mediante el uso de herencia con clases abstractas, métodos abstractos y validaciones de parámetros físicos utilizando programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase abstracta EstrategiaEnvio: Establece la plantilla común y los atributos generales (como la tarifa base tarifaBase), además de declarar el método abstracto calcularCosto(double pesoKg, double distanciaKm) que obliga a las subclases a definir su propia regla matemática de tarificación.

Implementa clases concretas hijas (EnvioEstandar, EnvioExpresoAereo, EnvioMaritimo): Extienden la clase abstracta aplicando factores de costo propios (por ejemplo, un recargo por kilómetro para terrestre estándar, tarifas elevadas por peso y velocidad aérea, o costos fijos reducidos por volumen marítimo).

Incorpora validaciones físicas: Añade controles lógicos previos en el cálculo para rechazar de manera inmediata pesos menores o iguales a cero o distancias negativas, evitando anomalías matemáticas en el sistema.

Ejecuta la prueba polimórfica (main): Crea una lista heterogénea de envíos configurados con distintas estrategias, los recorre de manera modular aplicando polimorfismo y muestra los costos calculados por consola.
