package com.hola.bicicletas.model;

//Se asume que el codigo es alfaNumerico.
public abstract class Bicicleta {
    private String codigoDeBicicleta;
    private int anioDeFabricacion;
    private double peso;

    public Bicicleta(String codigoDeBicicleta, int anioDeFabricacion, double peso) {
        setCodigoDeBicicleta(codigoDeBicicleta);
        setAnioDeFabricacion(anioDeFabricacion);
        setPeso(peso);
    }

    public String getCodigoDeBicicleta() {
        return codigoDeBicicleta;
    }

    public void setCodigoDeBicicleta(String codigoDeBicicleta) {
        if (codigoDeBicicleta == null || codigoDeBicicleta.isEmpty()) {
            throw new IllegalArgumentException("El codigo no puede ser nulo ni estar vacio");
        }
        this.codigoDeBicicleta = codigoDeBicicleta;
    }

    public int getAnioDeFabricacion() {
        return anioDeFabricacion;
    }

    public void setAnioDeFabricacion(int anioDeFabricacion) {
        if (anioDeFabricacion < 2000 || anioDeFabricacion > 2026) {
            throw new IllegalArgumentException("El año de fabricacion debe encontrarse en un rango de 2000 y 2026");
        }
        this.anioDeFabricacion = anioDeFabricacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser un valor mayor a 0");
        }
        this.peso = peso;
    }

    public abstract double costoMantencion();

    @Override

    public String toString() {
        return "Código: " + this.getCodigoDeBicicleta() + "|" + "Año: " + this.getAnioDeFabricacion();
    }
}

