package com.company;

public class C_Producto {
    private int cantidad;
    private int cantidadAnterior;
    private float precio;

    public C_Producto(int cantidad, float precio) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.cantidadAnterior=0;
    }
    public void agregar(C_Producto nuevo){
        float d;
        int i= nuevo.cantidad+this.cantidadAnterior;
        d=(this.cantidadAnterior*this.precio+ nuevo.precio*nuevo.cantidad)/i;
        this.cantidadAnterior=i;
        this.precio=d;
        this.cantidad=nuevo.cantidad+this.cantidad;
    }
    public void gastar(int i){
        if(this.cantidad>i) {
            this.cantidad = this.cantidad - i;
        }
        else {
            System.out.println("No hay suficientes recursos para lo que se quiere");
        }
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
