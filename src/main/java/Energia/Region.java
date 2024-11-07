package Energia;

import java.util.ArrayList;

public class Region {
    private String nombre;
    private String localizacion;
    private ArrayList<Energia> energias;

    public Region(String nombre, String localizacion) {
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.energias = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getLocalizacion() { return localizacion; }
    public void setLocalizacion(String localizacion) { this.localizacion = localizacion; }

    public void agregarEnergia(Energia energia) { energias.add(energia); }

    public void mostrarEficiencias() {
        for (Energia energia : energias) {
            System.out.println("Tipo de energía: " + energia.getTipo() + ", Eficiencia: " + energia.calcularEficiencia());
        }
    }
}
