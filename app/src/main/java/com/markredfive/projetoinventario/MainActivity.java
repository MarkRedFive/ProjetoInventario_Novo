package com.markredfive.projetoinventario;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*        try{    //CRIAR BD
            SQLiteDatabase bancoDados = openOrCreateDatabase( name: "app", MODE_PRIVATE, null);
                //CRIAR TABELA
            bancoDados.execSQL("CREATE TABLE IF NOT EXISTS");
        }catch (Exception e) {
            e.printStackTrace();
*/        }
    }

    public void metodoCadastrar (View view) {
        int idItem = 0;
        EditText campoNome = findViewById(R.id.editNome);
        EditText campoQuantidade = findViewById(R.id.editQuantidade);
        EditText campoPeso = findViewById(R.id.editPeso);
        EditText campoValor = findViewById(R.id.editValor);
        EditText campoRaridade = findViewById(R.id.editRaridade);
        EditText campoEfeito = findViewById(R.id.editEfeito);
        TextView testeResultado = findViewById(R.id.campoTeste);

        String nome = campoNome.getText().toString();
        String quantidade = campoQuantidade.getText().toString();
        String peso = campoPeso.getText().toString();
        String valor = campoValor.getText().toString();
        String raridade = campoRaridade.getText().toString();
        String efeito = campoEfeito.getText().toString();
        testeResultado.setText( nome + quantidade + peso + valor + raridade + efeito  );
    }
}