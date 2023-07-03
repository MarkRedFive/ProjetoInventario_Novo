package com.markredfive.projetoinventario;

import android.widget.TextView;

import java.util.Random;

public class Item {

    // PROPRIEDADES
    String nomeItem;
    int quantidadeItem;
    float pesoItem;
    float valorItem;
    String raridadeItem;
    String efeitoItem;
    boolean magicoItem;


    // METODOS
    public void rolarDado() {
        //TextView texto = (R.id.result);
        int d20 = new Random().nextInt(19) + 1;
        //texto.setText( d20 );
    }
}
