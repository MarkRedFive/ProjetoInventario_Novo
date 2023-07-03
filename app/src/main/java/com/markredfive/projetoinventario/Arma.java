package com.markredfive.projetoinventario;

import java.util.Random;

public class Arma extends Item{

    // PROPRIEDADES
    byte danoArma;
    boolean agilidadeArma;

    // METODOS
    public void atacarArma () {  //Rolagem automática de ataque
        //TextView ataque = (R.id.result);
        int rolagemAtaque = new Random().nextInt(19) + 1 + danoArma;
        //ataque.setText( rolagemAtaque );
    }
}
