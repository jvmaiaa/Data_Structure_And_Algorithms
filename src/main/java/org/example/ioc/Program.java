package org.example.ioc;

public class Program {

    public static void main(String[] args) {
        PlacaFinal placaFinal = new PlacaFinal(new EstadoSP());

        System.out.println(placaFinal.alteraPlaca("ABC"));
    }
}
