package com.hola.bicicletas.model;

public class BicicletaMontanya extends Bicicleta{
    private int cantidadSuspenciones;

    public BicicletaMontanya(String codigoDeBicicleta, int anioDeFabricacion, double peso, int cantidadSuspenciones) {
        super(codigoDeBicicleta, anioDeFabricacion, peso);
        this.cantidadSuspenciones = cantidadSuspenciones;
    }

    public int getCantidadSuspenciones() {
        return cantidadSuspenciones;
    }

    public void setCantidadSuspenciones(int cantidadSuspenciones) {
        this.cantidadSuspenciones = cantidadSuspenciones;
    }

    @Override

    public double costoMantencion(){
        double CostoBase=30000.0;
        if (cantidadSuspenciones>1){
            CostoBase=CostoBase*1.15;

        }
        return  CostoBase;
    }

}
