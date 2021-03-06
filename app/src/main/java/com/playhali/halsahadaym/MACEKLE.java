package com.playhali.halsahadaym;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class MACEKLE extends AppCompatActivity {

    Spinner spinner1, spinner2;
    EditText editText5;
    EditText editText6;
    EditText editText7;
    EditText editText8;
    String editText5x;
    String editText6x;
    String editText7x;
    String editText8x;
    String editText9x;
    String editText10x;
    com.playhali.halsahadaym.Bilgi bilgi;
    private AdView mAdVieww;
    DatabaseReference reference;
    int maxid = 0;
    DatabaseReference databaseReference;
    FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.macekle);
        super.onCreate(savedInstanceState);
        MobileAds.initialize(this, initializationStatus -> {

            AdView adView = new AdView(this);
            adView.setAdSize(AdSize.BANNER);
            adView.setAdUnitId("ca-app-pub-3058256649555601/1899508755");
            mAdVieww = findViewById(R.id.adVieww);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdVieww.loadAd(adRequest);




        });






        database=FirebaseDatabase.getInstance();
        bilgi= new Bilgi();

        spinner1 = findViewById(R.id.spinner1);

        spinner2 = findViewById(R.id.spinner2);
        editText5 = findViewById(R.id.editText5);
        editText6 = findViewById(R.id.editText6);
        editText7 = findViewById(R.id.editText7);
        editText8 = findViewById(R.id.editText8);
        editText5x=editText5.getText().toString();
        editText6x=editText6.getText().toString();
        editText7x=editText7.getText().toString();
        editText8x=editText8.getText().toString();





        List<String> iller = new ArrayList<>();
        iller.add(0, "??l se??iniz");
        iller.add("Adana");
        iller.add("Ad??yaman");
        iller.add("Afyon");
        iller.add("A??r??");
        iller.add("Amasya");
        iller.add("Ankara");
        iller.add("Antalya");
        iller.add("Artvin");
        iller.add("Ayd??n");
        iller.add("Bal??kesir");
        iller.add("Bilecik");
        iller.add("Bing??l");
        iller.add("Bitlis");
        iller.add("Bolu");
        iller.add("Burdur");
        iller.add("Bursa");
        iller.add("??anakkale");
        iller.add("??ank??r??");
        iller.add("??orum");
        iller.add("Denizli");
        iller.add("Diyarbak??r");
        iller.add("Edirne");
        iller.add("Elaz????");
        iller.add("Erzincan");
        iller.add("Erzurum");
        iller.add("Eski??ehir");
        iller.add("Gaziantep");
        iller.add("Giresun");
        iller.add("G??m????hane");
        iller.add("Hakkari");
        iller.add("Hatay");
        iller.add("Isparta");
        iller.add("Mersin");
        iller.add("??stanbul");
        iller.add("??zmir");
        iller.add("Kars");
        iller.add("Kastamonu");
        iller.add("Kayseri");
        iller.add("K??rklareli");
        iller.add("K??r??ehir");
        iller.add("Kocaeli");
        iller.add("Konya");
        iller.add("K??tahya");
        iller.add("Malatya");
        iller.add("Manisa");
        iller.add("K.Mara??");
        iller.add("Mardin");
        iller.add("Mu??la");
        iller.add("Mu??");
        iller.add("Nev??ehir");
        iller.add("Ni??de");
        iller.add("Ordu");
        iller.add("Rize");
        iller.add("Sakarya");
        iller.add("Samsun");
        iller.add("Siirt");
        iller.add("Sinop");
        iller.add("Sivas");
        iller.add("Tekirda??");
        iller.add("Tokat");
        iller.add("Trabzon");
        iller.add("Tunceli");
        iller.add("??anl??urfa");
        iller.add("U??ak");
        iller.add("Van");
        iller.add("Yozgat");
        iller.add("Zonguldak");
        iller.add("Aksaray");
        iller.add("Bayburt");
        iller.add("Karaman");
        iller.add("K??r??kkale");
        iller.add("Batman");
        iller.add("????rnak");
        iller.add("Bart??n");
        iller.add("Ardahan");
        iller.add("I??d??r");
        iller.add("Yalova");
        iller.add("Karab??k");
        iller.add("Kilis");
        iller.add("Osmaniye");
        iller.add("D??zce");



        ArrayAdapter<String> adapter;

        adapter = new ArrayAdapter(this, R.layout.spinner_item,iller);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        final String Adana[] = getResources().getStringArray(R.array.Adana);
        final String Ad??yaman[] = getResources().getStringArray(R.array.Ad??yaman);
        final String Afyon[] = getResources().getStringArray(R.array.Afyon);
        final String A??r??[] = getResources().getStringArray(R.array.A??r??);
        final String Amasya[] = getResources().getStringArray(R.array.Amasya);
        final String Ankara[] = getResources().getStringArray(R.array.Ankara);
        final String Antalya[] = getResources().getStringArray(R.array.Antalya);
        final String Artvin[] = getResources().getStringArray(R.array.Artvin);
        final String Ayd??n[] = getResources().getStringArray(R.array.Ayd??n);
        final String Bal??kesir[] = getResources().getStringArray(R.array.Bal??kesir);
        final String Bilecik[] = getResources().getStringArray(R.array.Bilecik);
        final String Bing??l[] = getResources().getStringArray(R.array.Bing??l);
        final String Bitlis[] = getResources().getStringArray(R.array.Bitlis);
        final String Bolu[] = getResources().getStringArray(R.array.Bolu);
        final String Burdur[] = getResources().getStringArray(R.array.Burdur);
        final String Bursa[] = getResources().getStringArray(R.array.Bursa);
        final String ??anakkale[] = getResources().getStringArray(R.array.??anakkale);
        final String ??ank??r??[] = getResources().getStringArray(R.array.??ank??r??);
        final String ??orum[] = getResources().getStringArray(R.array.??orum);
        final String Denizli[] = getResources().getStringArray(R.array.Denizli);
        final String Diyarbak??r[] = getResources().getStringArray(R.array.Diyarbak??r);
        final String Edirne[] = getResources().getStringArray(R.array.Edirne);
        final String Elaz????[] = getResources().getStringArray(R.array.Elaz????);
        final String Erzican[] = getResources().getStringArray(R.array.Erzincan);
        final String Erzurum[] = getResources().getStringArray(R.array.Erzurum);
        final String Eski??ehir[] = getResources().getStringArray(R.array.Eski??ehir);
        final String Gaziantep[] = getResources().getStringArray(R.array.Gaziantep);
        final String Giresun[] = getResources().getStringArray(R.array.Giresun);
        final String G??m????hane[] = getResources().getStringArray(R.array.G??m????hane);
        final String Hakkari[] = getResources().getStringArray(R.array.Hakkari);
        final String Hatay[] = getResources().getStringArray(R.array.Hatay);
        final String Isparta[] = getResources().getStringArray(R.array.Isparta);
        final String Mersin[] = getResources().getStringArray(R.array.Mersin);
        final String ??stanbul[] = getResources().getStringArray(R.array.??stanbul);
        final String ??zmir[] = getResources().getStringArray(R.array.??zmir);
        final String Kars[] = getResources().getStringArray(R.array.Kars);
        final String Kastamonu[] = getResources().getStringArray(R.array.Kastamonu);
        final String Kayseri[] = getResources().getStringArray(R.array.Kayseri);
        final String K??rklareli[] = getResources().getStringArray(R.array.K??rklareli);
        final String K??r??ehir[] = getResources().getStringArray(R.array.K??r??ehir);
        final String Kocaeli[] = getResources().getStringArray(R.array.Kocaeli);
        final String Konya[] = getResources().getStringArray(R.array.Konya);
        final String K??tahya[] = getResources().getStringArray(R.array.K??tahya);
        final String Malatya[] = getResources().getStringArray(R.array.Malatya);
        final String Manisa[] = getResources().getStringArray(R.array.Manisa);
        final String Kmara??[] = getResources().getStringArray(R.array.K_Mara??);
        final String Mardin[] = getResources().getStringArray(R.array.Mardin);
        final String Mu??la[] = getResources().getStringArray(R.array.Mu??la);
        final String Mu??[] = getResources().getStringArray(R.array.Mu??);
        final String Nev??ehir[] = getResources().getStringArray(R.array.Nev??ehir);
        final String Ni??de[] = getResources().getStringArray(R.array.Ni??de);
        final String Ordu[] = getResources().getStringArray(R.array.Ordu);
        final String Rize[] = getResources().getStringArray(R.array.Rize);
        final String Sakarya[] = getResources().getStringArray(R.array.Sakarya);
        final String Samsun[] = getResources().getStringArray(R.array.Samsun);
        final String Siirt[] = getResources().getStringArray(R.array.Siirt);
        final String Sinop[] = getResources().getStringArray(R.array.Sinop);
        final String Sivas[] = getResources().getStringArray(R.array.Sivas);
        final String Tekirda??[] = getResources().getStringArray(R.array.Tekirda??);
        final String Tokat[] = getResources().getStringArray(R.array.Tokat);
        final String Trabzo[] = getResources().getStringArray(R.array.Trabzon);
        final String Tunceli[] = getResources().getStringArray(R.array.Tunceli);
        final String ??anl??urfa[] = getResources().getStringArray(R.array.??anl??urfa);
        final String U??ak[] = getResources().getStringArray(R.array.U??ak);
        final String Van[] = getResources().getStringArray(R.array.Van);
        final String Yozgat[] = getResources().getStringArray(R.array.Yozgat);
        final String Zonguldak[] = getResources().getStringArray(R.array.Zonguldak);
        final String Aksaray[] = getResources().getStringArray(R.array.Aksaray);
        final String Bayburt[] = getResources().getStringArray(R.array.Bayburt);
        final String Karaman[] = getResources().getStringArray(R.array.Karaman);
        final String K??r??kkale[] = getResources().getStringArray(R.array.K??r??kkale);
        final String Batman[] = getResources().getStringArray(R.array.Batman);
        final String ????rnak[] = getResources().getStringArray(R.array.????rnak);
        final String Bart??n[] = getResources().getStringArray(R.array.Bart??n);
        final String Ardahan[] = getResources().getStringArray(R.array.Ardahan);
        final String I??d??r[] = getResources().getStringArray(R.array.I??d??r);
        final String Yalova[] = getResources().getStringArray(R.array.Yalova);
        final String Karab??k[] = getResources().getStringArray(R.array.Karab??k);
        final String Kilis[] = getResources().getStringArray(R.array.Kilis);
        final String Osmaniye[] = getResources().getStringArray(R.array.Osmaniye);
        final String D??zce[] = getResources().getStringArray(R.array.D??zce);



        spinner1.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (adapterView.getItemAtPosition(i).equals("choose event")) {

                } else {
                    String item = adapterView.getItemAtPosition(i).toString();

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (adapterView.getItemAtPosition(i).equals("choose event")) {

                } else {
                    String item = adapterView.getItemAtPosition(i).toString();

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override

            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

                if (position == 1) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Adana);

                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


                }
                if (position == 2) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Ad??yaman);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 3) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Afyon);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 4) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, A??r??);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 5) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Amasya);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 6) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Ankara);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 7) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Antalya);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 8) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Artvin);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 9) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Ayd??n);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 10) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Bal??kesir);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 11) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item,  Bilecik);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 12) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item,Bing??l);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 13) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Bitlis);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 14) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Bolu);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 15) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Burdur);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 16) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Bursa);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 17) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, ??anakkale);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 18) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, ??ank??r??);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 19) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, ??orum);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 20) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Denizli);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 21) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Diyarbak??r);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 22) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Edirne);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 23) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Elaz????);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 24) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Erzican);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 25) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Erzurum);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 26) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Eski??ehir);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 27) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Gaziantep);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 28) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Giresun);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 29) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, G??m????hane);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 30) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Hakkari);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 31) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Hatay);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 32) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item,Isparta);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 33) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Mersin);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 34) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, ??stanbul);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 35) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, ??zmir);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 36) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Kars);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 37) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Kastamonu);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 38) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Kayseri);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 39) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, K??rklareli);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 40) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, K??r??ehir);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 41) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Kocaeli);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 42) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Konya);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 43) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, K??tahya);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 44) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Malatya);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 45) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Manisa);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 46) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Kmara??);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 47) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Mardin);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 48) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Mu??la);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 49) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Mu??);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 50) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Nev??ehir);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 51) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Ni??de);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 52) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Ordu);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 53) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Rize);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 54) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Sakarya);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 55) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Samsun);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 56) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Siirt);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 57) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Sinop);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 58) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Sivas);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 59) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Tekirda??);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 60) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Tokat);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 61) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Trabzo);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 62) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Tunceli);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 63) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, ??anl??urfa);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 64) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, U??ak);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 65) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Van);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 66) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Yozgat);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 67) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Zonguldak);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 68) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Aksaray);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 69) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Bayburt);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 70) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Karaman);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 71) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item,K??r??kkale);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 72) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Batman);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 73) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, ????rnak);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 74) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Bart??n);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 75) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Ardahan);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 76) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, I??d??r);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 77) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Yalova);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 78) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item,Karab??k);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 79) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item,Kilis);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }if (position == 80) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item,Osmaniye);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 81) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, D??zce);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }





            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
    private void getValues(){
        bilgi.setIl("??l:      "+spinner1.getSelectedItem().toString());
        bilgi.setIlce("??l??e:      "+spinner2.getSelectedItem().toString());
        bilgi.setTelno("Tel no:      "+editText5.getText().toString());
        bilgi.setSaat("Ma?? saati:      "+editText6.getText().toString());
        bilgi.setTarih("Ma?? tarihi:       "+editText7.getText().toString());
        bilgi.setMevki("Eksik mevkiler:       "+editText8.getText().toString());
        databaseReference = database.getReference("Bilgiler");
        String key = databaseReference.push().getKey();
        DatabaseReference trabzon= database.getReference("Bilgiler/"+key);
        trabzon.setValue(bilgi);

    }


    public void btnAddData(View view) {





        getValues();

        Toast.makeText(MACEKLE.this,"Ma?? kaydedildi.",Toast.LENGTH_SHORT).show();




    }
}