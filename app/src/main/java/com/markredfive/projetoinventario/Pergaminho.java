package com.markredfive.projetoinventario;

public class Pergaminho extends Descartavel{

    // PROPRIEDADES
    byte[] nivelMagia = {0,1,2,3,4,5,6,7,8,9};

    // METODOS
    //Todo pergaminho é mágico
    public void ConstrutorItemMagico () {
        magicoItem = true;
    }
}
