package Energia;


public class EnergiaGeotermica extends FuenteEnergia {
    private double temperaturaSubterranea;

    public Geotermica(String id, double potenciaMaxima, double temperaturaSubterranea) {
        super(id, potenciaMaxima);
        this.temperaturaSubterranea = temperaturaSubterranea;
    }

    // Getters y Setters
    public double getTemperaturaSubterranea() {
        return temperaturaSubterranea;
    }

    public void setTemperaturaSubterranea(double temperaturaSubterranea) {
        this.temperaturaSubterranea = temperaturaSubterranea;
    }

    @Override
    public void verificarEstado() {
        if (temperaturaSubterranea < 100) {
            setEnFuncionamiento(false);
            System.out.println("La planta geotérmica " + getId() + " no tiene suficiente temperatura para operar.");
        } else {
            setEnFuncionamiento(true);
            System.out.println("La planta geotérmica " + getId() + " está en funcionamiento.");
        }
    }
}

