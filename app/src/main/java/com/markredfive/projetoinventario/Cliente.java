package com.markredfive.projetoinventario;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;


/*
######################################          USEI COMO BLOCO DE NOTAS E PALETA DE TESTES         ######################################
*/
public class Cliente {
    private int id;
    private String nome;
    private String email;
    private Integer senha;

    // Construtor
    public Cliente(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // CRUD Operations

    // CRUD - Create - Inserir
    //bancoDados.execSQL("INSERT INTO inventario (nome, quantidade, peso, valor, raridade, efeito, magico) VALUES ('Elmo', 1, 2.0, 5.0, 'Comum', 'Nenhum'");

    // CRUD - Read - Selecionar
    //bancoDados.execSQL(SELECT * FROM inventario WHERE magico = 1");

    // CRUD - Update - Atualizar
    //bancoDados.execSQL("UPDATE senha SET senha = 7777 WHERE nome = Marcos");

    // CRUD - Delete - Deletar
    //bancoDados.execSQL("DELETE FROM inventario WHERE valor = 0");

    // Create
    public static long adicionarCliente(Context context, String nome, String email) {
        CRUDitens crudItens = new CRUDitens(context);
        SQLiteDatabase db = crudItens.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("nome", nome);
        values.put("email", email);

        long id = db.insert("clientes", null, values);

        db.close();
        return id;
    }

    // Read
    public static List<Cliente> obterClientes(Context context) {
        List<Cliente> clientes = new ArrayList<>();

        CRUDitens crudItens= new CRUDitens(context);
        SQLiteDatabase db = crudItens.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM clientes", null);

        if (cursor.moveToFirst()) {
            do {
                /*int id = cursor.getInt(cursor.getColumnIndex("id"));
                String nome = cursor.getString(cursor.getColumnIndex("nome"));
                String email = cursor.getString(cursor.getColumnIndex("email"));

                Cliente cliente = new Cliente(id, nome, email);
                clientes.add(cliente);*/
            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();
        return clientes;
    }

    // Update
    public static int atualizarCliente(Context context, int id, String nome, String email) {
        CRUDitens crudItens;
        return id;
    }
}
