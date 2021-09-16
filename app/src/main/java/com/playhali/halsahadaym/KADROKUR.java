package com.playhali.halsahadaym;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class KADROKUR extends AppCompatActivity {


    EditText a, b, c, d, e, f, g, h, j, k, l;
    String aa, bb, cc, dd, ee, ff, gg, hh, jj, kk, ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kadrokur);



        a = findViewById(R.id.editText17);
        b = findViewById(R.id.editText18);
        c = findViewById(R.id.editText19);
        d = findViewById(R.id.editText20);
        e = findViewById(R.id.editText21);
        f = findViewById(R.id.editText22);
        g = findViewById(R.id.editText23);
        h = findViewById(R.id.editText24);
        j = findViewById(R.id.editText25);

        aa = a.getText().toString().trim();
        bb = b.getText().toString().trim();
        cc = c.getText().toString().trim();
        dd = d.getText().toString().trim();
        ee = e.getText().toString().trim();
        ff = f.getText().toString().trim();
        gg = g.getText().toString().trim();
        hh = h.getText().toString().trim();
        jj = j.getText().toString().trim();





    }

}