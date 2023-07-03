package com.markredfive.projetoinventario;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CRUDitens extends SQLiteOpenHelper {
    // BD
    private static final String NOME_BD = "projeto_inventario";
    private static final int VERSAO_BD = 1;
    // TABELA_INVENTARIO
    private static final byte COLUNA_ARMA = "Arma";
    private static final byte COLUNA_ARMADURA = "Armadura";
    private static final byte COLUNA_PERGAMINHO = "Pergaminho";
    private static final byte COLUNA_POCAO = "Poção";
    public Integer COLUNA_ID = "ID";
    public String COLUNA_NOME = "Nome do Item";
    public Integer COLUNA_QUANTIDADE = "Quantidade";
    public double COLUNA_PESO = "Peso";
    public double COLUNA_VALOR = "Valor";
    public String COLUNA_RARIDADE = "Raridade";
    public String COLUNA_EFEITO = "Efeito";
    public boolean COLUNA_MAGICO = "Mágico";
    // TABELA_LOGIN
    public String COLUNA_MEULOGIN = "Nome de Login";
    public String COLUNA_MEUEMAIL = "E-mail";
    public Integer COLUNA_MEUSENHA = "Senha";


    public CRUDitens(Context context) {
        super(context, NOME_BD, null, VERSAO_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Cria a TABELA_INVENTARIO
        String createInventarioTable = "CREATE TABLE IF NOT EXISTS inventario (id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, quantidade INT(6), peso DOUBLE(5), valor DOUBLE(5), raridade TEXT, efeito TEXT, magico BYTE(2) )";
        db.execSQL(createInventarioTable);

        // Cria a TABELA_LOGIN
        String createLoginTable = "CREATE TABLE IF NOT EXISTS login (id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, email TEXT, senha INT(4))";
        db.execSQL(createLoginTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Caso haja uma atualização do esquema do banco de dados
        // Para adicionar uma nova coluna:
        // if (oldVersion < 2 && newVersion >= 2) {
        //     String addColumnQuery = "ALTER TABLE clientes ADD COLUMN telefone TEXT";
        //     db.execSQL(addColumnQuery);
        // }
    }


}

