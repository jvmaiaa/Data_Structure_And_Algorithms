package org.example.ioc;

public class EstadoSP implements AlteraPlaca {

    @Override
    public String alteraPlaca(String placa) {
        return placa + " - SP";
    }
}
