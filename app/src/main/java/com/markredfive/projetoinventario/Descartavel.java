package com.markredfive.projetoinventario;

public class Descartavel extends Item{

    // PROPRIEDADES
    byte quantidadeUsos;

    // METODOS
    void usarItem(){
        //Se usar um descartável, ele perde uma carga se possuir usos restantes
        if (quantidadeUsos > 0) {quantidadeUsos -- ;}
        else {destruirItem();}}
    void destruirItem() {
        //Se usar um descartável, ele é removido do seu inventário se não possuir usos restantes
        quantidadeItem --;}
}
