package org.example.ioc;

public class PlacaFinal {

    private final AlteraPlaca alteraPlaca;

    public PlacaFinal(AlteraPlaca alteraPlaca) {
        this.alteraPlaca = alteraPlaca;
    }

    public String alteraPlaca(String placa) {
        return alteraPlaca.alteraPlaca(placa);
    }
}
