package org.example.alura.poo;

import java.util.ArrayList;
import java.util.List;

public class Conta {

    private Double limite;
    private List<ItemDaCompra> ItensDaCompra = new ArrayList<>();

    public Conta() {}

    public Conta(Double limite) {
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    public List<ItemDaCompra> getItensDaCompra() {
        return ItensDaCompra;
    }

    public void setItensDaCompra(List<ItemDaCompra> itensDaCompra) {
        ItensDaCompra = itensDaCompra;
    }

    public void efetuaCompra(double valorDaCompra){
        if (!(valorDaCompra > this.limite)){
            this.limite -= valorDaCompra;
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "limite=" + limite +
                ", ItensDaCompra=" + ItensDaCompra +
                '}';
    }
}
