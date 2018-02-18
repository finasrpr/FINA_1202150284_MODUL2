package com.example.fina.fina_1202150284_modul2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Toast;

public class DaftarMenu extends AppCompatActivity {

    String lanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "Silakan Pilih Menu", Toast.LENGTH_LONG);
        toast.show();
    }
    public void dineIn(View view) {

        this.lanjut = "Dine In";

    }

    public void takeAway(View view) {
        this.lanjut = "Take Away";

    }

    public void pilih(View view) {
        if (this.lanjut == "Dine In") {
            Intent i = new Intent(this, DineIn.class);
            startActivity(i);

        } else if (this.lanjut == "Take Away") {
            Intent i = new Intent(this, TakeAway.class);
            startActivity(i);
        } else {
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Masukkan Data yang Benar", Toast.LENGTH_LONG);
            toast.show();

        }
    }
}
