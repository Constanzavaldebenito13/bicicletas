package com.hola.bicicletas.model;

public class BicicletaElectrica extends Bicicleta implements ConGarantiaExtendida {
    private double kilometros;
    private boolean bateriaCertificada;
    private boolean garantiaExtendidaActiva;

    public BicicletaElectrica(String codigoDeBicicleta, int anioDeFabricacion, double peso, double kilometros, boolean bateriaCertificada, boolean garantiaExtendidaActiva) {
        super(codigoDeBicicleta, anioDeFabricacion, peso);
        this.kilometros = kilometros;
        this.bateriaCertificada = bateriaCertificada;
        this.garantiaExtendidaActiva = garantiaExtendidaActiva;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

    public boolean isGarantiaExtendidaActiva() {
        return garantiaExtendidaActiva;
    }

    public void setGarantiaExtendidaActiva(boolean garantiaExtendidaActiva) {
        this.garantiaExtendidaActiva = garantiaExtendidaActiva;
    }

    @Override

    public double costoMantencion(){
        double CostoBase=45000.0;
        if (!bateriaCertificada){
            CostoBase=CostoBase*1.25;
        }
        return CostoBase;
    }

    @Override

    public boolean garantiaExtendidaActiva() {
        return garantiaExtendidaActiva;
    }


    @Override
    public boolean activarGarantia() {
        this.garantiaExtendidaActiva = true;
        return true;
    }

    @Override

    public String toString() {
        return "Tipo: Bicicleta Electrica" +
                " | Código: " + getCodigoDeBicicleta() +
                " | Año: " + getAnioDeFabricacion() +
                " | Peso: " + getPeso() + " kg" +
                " | Autonomia: " + (int)getKilometros() + " km" +
                " | Batería certificada: " + (isBateriaCertificada() ? "Si" : "No") +
                " | Garantia extendida: " + (isGarantiaExtendidaActiva() ? "Si" : "No") +
                " | Costo mantención: $" + (int)costoMantencion();
    }

}
