package com.company;

public class C_Inventatario{
    private C_Shampoo Shampoo;
    private C_Acondicionador Acondicionador;
    private C_AguaOx20 aguaOxigenada20;
    private C_Tintura color;

    public C_Inventatario(C_Shampoo shampoo, C_Acondicionador acondicionador, C_AguaOx20 aguaOxigenada20, C_Tintura color) {
        Shampoo = shampoo;
        Acondicionador = acondicionador;
        this.aguaOxigenada20 = aguaOxigenada20;
        this.color = color;
    }

    public C_Shampoo getShampoo() {
        return Shampoo;
    }

    public void setShampoo(C_Shampoo shampoo) {
        Shampoo = shampoo;
    }

    public C_Acondicionador getAcondicionador() {
        return Acondicionador;
    }

    public void setAcondicionador(C_Acondicionador acondicionador) {
        Acondicionador = acondicionador;
    }

    public C_AguaOx20 getAguaOxigenada20() {
        return aguaOxigenada20;
    }

    public void setAguaOxigenada20(C_AguaOx20 aguaOxigenada20) {
        this.aguaOxigenada20 = aguaOxigenada20;
    }

    public C_Tintura getColor() {
        return color;
    }

    public void setColor(C_Tintura color) {
        this.color = color;
    }
}
