package com00.first.java.variablesType;

public class ExampleScope {
    public void scope() {
        boolean isPareja;
        int quantity = 2;
        if (quantity > 1) isPareja = true;
        else isPareja = false;
    }

    public void descuentos() {
        double valorCompra = 250.0;
        double descuento;

        if (valorCompra >= 200.0 && valorCompra < 300) {
            descuento = valorCompra * .15;
            System.out.println("Descuento del 15%, el total es: "+ ( valorCompra - descuento));
        } else if (valorCompra >= 100.0 && valorCompra < 200.0) {
            descuento = valorCompra * .10;
            System.out.println("Descuento del 10%, el total es: "+ (valorCompra - descuento));
        } else {
            System.out.println("El total de tu compra es: "+ valorCompra);
        }
    }
}
