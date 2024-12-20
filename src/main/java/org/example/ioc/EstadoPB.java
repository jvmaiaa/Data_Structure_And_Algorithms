package org.example.ioc;

public class EstadoPB implements AlteraPlaca {

    @Override
    public String alteraPlaca(String placa) {
        return placa + " - PB";
    }

}
