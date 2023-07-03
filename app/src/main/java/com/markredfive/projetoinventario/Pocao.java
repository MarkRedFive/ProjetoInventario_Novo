package com.markredfive.projetoinventario;

public class Pocao extends Descartavel{

    // PROPRIEDADES
    String efeitoPocao;
    float duracaoPocao;

    // METODOS
    //Toda poção é mágica
    public void ConstrutorItemMagico () {
        magicoItem = true;
    }
    public void recuperarFrasco() {
        //Quando terminar uma poção, você recebe um frasco vazio no seu inventário
    }

}
