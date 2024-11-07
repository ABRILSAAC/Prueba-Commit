package Energia;

public class EnergiaEolica extends Energia implements IEnergia {
    public EnergiaEolica(double produccion, double consumo) {
        super("Eolica", produccion, consumo);
    }

    @Override
    public double calcularEficiencia() {
        return getProduccion() / (getConsumo() + 0.1); // Ejemplo de ajuste
    }
}

