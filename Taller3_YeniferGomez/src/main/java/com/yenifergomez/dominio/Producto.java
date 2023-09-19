package com.yenifergomez.dominio;

public class Producto {

    private int codigoYG;
    private String nombreYG;
    private int cantidadYG=0;
    private static int nroUnidadesCreadasYG=0;
    private int precioYG;


    public Producto(int cantidadYG) {
        this.cantidadYG = nroUnidadesCreadasYG+1;
        nroUnidadesCreadasYG++;
    }


    public Producto(int codigoYG, String nombreYG, int cantidadYG, int precioYG) {
        this.codigoYG = codigoYG;
        this.nombreYG = nombreYG;
        this.cantidadYG = cantidadYG;
        this.precioYG = precioYG;

        cantidadYG+=cantidadYG;
    }

    public Producto contarUnidad(int codigoYG) {
        if (nroUnidadesCreadasYG <= 8) {
            return new Producto(codigoYG);
        }else{
            System.out.println("No se pueden crear más de 8 unidades por producto");
        }return null;
    }

    public static Producto registrarProductoYG(int codigoYG, String nombreYG, int cantidadYG, int precioYG){
        if (cantidadYG<nroUnidadesCreadasYG){
            return new Producto(codigoYG,nombreYG,cantidadYG,precioYG);
        }else {
            return null;
        }
    }

    public void sacarUnidadYG(){
        if (cantidadYG > 0){
            cantidadYG--;
        }
    }

    public void aumentarUnidad(int cantidad) {
        if (this.cantidadYG + cantidadYG <= nroUnidadesCreadasYG) {
            this.cantidadYG += cantidadYG;
        }
    }

    public int getCodigoYG() {
        return codigoYG;
    }

    public String getNombreYG() {
        return nombreYG;
    }

    public int getCantidadYG() {
        return cantidadYG;
    }

    public static int getNroUnidadesCreadasYG() {
        return nroUnidadesCreadasYG;
    }

    public int getPrecioYG() {
        return precioYG;
    }

    public void setCantidadYG(int cantidadYG) {
        this.cantidadYG = cantidadYG;
        Producto.nroUnidadesCreadasYG=cantidadYG;
    }



}
