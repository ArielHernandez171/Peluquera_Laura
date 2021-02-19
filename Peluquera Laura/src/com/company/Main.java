package com.company;

import java.util.Scanner;

public class Main {
    public static float lavado(C_Inventatario inventatario){
        System.out.println("Shampoo:"+inventatario.getShampoo().getPrecio());
        System.out.println("Acondicionador:"+inventatario.getAcondicionador().getPrecio());
        return inventatario.getAcondicionador().getPrecio()+inventatario.getShampoo().getPrecio();
    }
    public static float tintura(C_Inventatario inventatario){
        float precio=lavado(inventatario);
        System.out.println("Agua oxigenada 20vol"+inventatario.getAguaOxigenada20().getPrecio());
        System.out.println("Tintura:"+inventatario.getColor().getPrecio());
        return precio+inventatario.getColor().getPrecio()+inventatario.getAguaOxigenada20().getPrecio();
    }

    public static void opcionMenuUno(){
        System.out.println("Ingreso de productos");
        System.out.println("Nuevo travajo");
        System.out.println("Listado de stock y precio");
    }
    public static void listadoDeStock(C_Inventatario inventario){//listado de precio y cantidad de los productos
        System.out.println("Shampoo:$"+inventario.getShampoo().getPrecio()+","+inventario.getShampoo().getCantidad()+"ml");
        System.out.println("Acondicionador:$"+inventario.getAcondicionador().getPrecio()+","+inventario.getAcondicionador().getCantidad()+"ml");
        System.out.println("Agua oxigenada 20vol:$"+inventario.getAguaOxigenada20().getPrecio()+","+inventario.getAguaOxigenada20().getCantidad()+"ml");
        System.out.println("Tintura:$"+inventario.getColor().getPrecio()+","+inventario.getColor().getCantidad()+"gm");
    }
    public static void menuUno(){
        int i=0;
        System.out.println("Elija una opcion");
        Scanner scan=new Scanner(System.in);
        switch (i){
            case 1:
                break;
            case 2:
                break;
            case 3:

                break;
        }
    }
    public static void main(String[] args) {
	// write your code
    }
}
