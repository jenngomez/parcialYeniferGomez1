package com.yenifergomez.dominio;

public class DispensadorDeMecato {

    private int serialYG;
    private String marcaYG;
    private Producto[] productosYG;

    private int nroProductosYG;

    public DispensadorDeMecato(int serialYG, String marcaYG, int tamanio) {

        if(tamanio>10){//Si el tamaño es mayor a 10 no puede registrar más productos
            System.out.println("Cantidad de productos mayor a la capacidad de la maquina");

        }else{
            this.serialYG = serialYG;
            this.marcaYG = marcaYG;
            this.productosYG=new Producto[tamanio];
            this.nroProductosYG=0;
        }
    }

    public void agregarProductoYG(Producto producto){
        if (maquinaLlena()){
            System.out.println("La maquina está llena, no se puede agregar más productos");
        }else {
            productosYG[nroProductosYG]=producto;
            nroProductosYG++;
        }
    }


    public boolean maquinaLlena(){
        return nroProductosYG==productosYG.length;
    }

    public boolean maquinaVacia(){
        return  nroProductosYG==0;
    }
    public Producto buscarProductoYG(String nombreYG){
        for (int i=0; i< nroProductosYG; i++){
            if (productosYG[i].getNombreYG().equals(nombreYG))
                return productosYG[i];
        }
        return null;
    }


    public void sacarUnidadYG(String nombre) {
       Producto producto = buscarProductoYG(nombre);
        if (producto != null) {
            producto.sacarUnidadYG();
            System.out.println("Se retiró una unidad de " + producto.getNombreYG());
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void consultarAgotadosYG(){
        for (int i=0; i < nroProductosYG; i++){
            if (productosYG[i].getCantidadYG()<=0){
                System.out.println(productosYG[i].getNombreYG() + "se encuentran agotados");
            }
        }
    }

   public int consultarUnidadesProductoYG(String codigo){
       Producto producto=buscarProductoYG(codigo);
       if (producto!=null){
           return producto.getCantidadYG();
       }else {
           System.out.println("El producto no se ha encontrado");
           return 0;
       }
   }

    public void consultarUnidadesProductosYG() {
        for (int i = 0; i < nroProductosYG; i++) {
            System.out.println(productosYG[i].getNombreYG() + ": " + productosYG[i].getCantidadYG() + " unidades.");
        }
    }

    public void aumentarUnidadYG(String serial, int cantidad) {
        Producto producto = buscarProductoYG(serial);
        if (producto != null) {
            producto.aumentarUnidad(cantidad);
            System.out.println("Se aumentaron " + cantidad + " unidades de " + producto.getNombreYG());
        } else {
            System.out.println("El producto no se ha encontrado");
        }
    }






}



