package Energia;

public class EnergiaSolar extends Energia implements IEnergia {
    public EnergiaSolar(double produccion, double consumo) {
        super("Solar", produccion, consumo);
    }

    @Override
    public double calcularEficiencia() {
        return getProduccion() / getConsumo();
    }
}

