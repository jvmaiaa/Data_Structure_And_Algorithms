package org.example.alura.poo;

public class ItemDaCompra implements Comparable<ItemDaCompra> {

    private String nomeDoItem;
    private Double valorDoItem;

    public ItemDaCompra() {}

    public ItemDaCompra(String nomeDoItem, Double valorDoItem) {
        this.nomeDoItem = nomeDoItem;
        this.valorDoItem = valorDoItem;
    }

    public String getNomeDoItem() {
        return nomeDoItem;
    }

    public void setNomeDoItem(String nomeDoItem) {
        this.nomeDoItem = nomeDoItem;
    }

    public Double getValorDoItem() {
        return valorDoItem;
    }

    public void setValorDoItem(Double valorDoItem) {
        this.valorDoItem = valorDoItem;
    }

    @Override
    public String toString() {
        return "ItemDaCompra{" +
                "nomeDoItem='" + nomeDoItem + '\'' +
                ", valorDoItem=" + valorDoItem +
                '}';
    }

    @Override
    public int compareTo(ItemDaCompra outroItem) {
       return Double.valueOf(this.valorDoItem).compareTo(Double.valueOf(outroItem.getValorDoItem()));
    }
}
