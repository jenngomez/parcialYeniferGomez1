package com.yenifergomez.app;

import com.yenifergomez.dominio.DispensadorDeMecato;
import com.yenifergomez.dominio.Producto;

public class App {

    public static void main(String[] args) {

        DispensadorDeMecato dispensador=new DispensadorDeMecato(1234,"LG",9);

        Producto producto1=Producto.registrarProductoYG(123,"Avena",5,2000);
        Producto producto2=Producto.registrarProductoYG(456,"Chocolatina",6,3000);
        Producto producto3= Producto.registrarProductoYG(789,"Bom Bom Bum",0,600);
        Producto producto4=Producto.registrarProductoYG(987,"Papas Margarita",1,2500);
        Producto producto5=Producto.registrarProductoYG(654,"Choclitos",0,1000);
        Producto producto6=Producto.registrarProductoYG(321,"Coca Cola",3,2000);
        Producto producto7=Producto.registrarProductoYG(109,"Barra Cereal",5,1000);
        Producto producto8=Producto.registrarProductoYG(298,"Menta",8,500);
        Producto producto9=Producto.registrarProductoYG(376,"Chiclets",5,1000);
        Producto producto10=Producto.registrarProductoYG(465,"Hit",6,2500);

        dispensador.agregarProductoYG(producto1);
        dispensador.agregarProductoYG(producto2);
        dispensador.agregarProductoYG(producto3);
        dispensador.agregarProductoYG(producto4);
        dispensador.agregarProductoYG(producto5);
        dispensador.agregarProductoYG(producto6);


//Solucion

        System.out.println("Bienvenidos a la maquina dispensadora de ASDI");

        //Sacar unidad
        dispensador.sacarUnidadYG("Avena");

        //Consultar nombres de productos agotados
        dispensador.consultarAgotadosYG();

        //Consultar unidades un producto
        dispensador.consultarUnidadesProductoYG("321");

        //Consultar unidades de todos los productos
        dispensador.consultarUnidadesProductosYG();

        //Aumentar unidades en producto
        dispensador.aumentarUnidadYG("987",2);








    }
}
