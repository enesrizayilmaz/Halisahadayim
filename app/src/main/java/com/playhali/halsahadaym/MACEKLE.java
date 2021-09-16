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
        iller.add(0, "İl seçiniz");
        iller.add("Adana");
        iller.add("Adıyaman");
        iller.add("Afyon");
        iller.add("Ağrı");
        iller.add("Amasya");
        iller.add("Ankara");
        iller.add("Antalya");
        iller.add("Artvin");
        iller.add("Aydın");
        iller.add("Balıkesir");
        iller.add("Bilecik");
        iller.add("Bingöl");
        iller.add("Bitlis");
        iller.add("Bolu");
        iller.add("Burdur");
        iller.add("Bursa");
        iller.add("Çanakkale");
        iller.add("Çankırı");
        iller.add("Çorum");
        iller.add("Denizli");
        iller.add("Diyarbakır");
        iller.add("Edirne");
        iller.add("Elazığ");
        iller.add("Erzincan");
        iller.add("Erzurum");
        iller.add("Eskişehir");
        iller.add("Gaziantep");
        iller.add("Giresun");
        iller.add("Gümüşhane");
        iller.add("Hakkari");
        iller.add("Hatay");
        iller.add("Isparta");
        iller.add("Mersin");
        iller.add("İstanbul");
        iller.add("İzmir");
        iller.add("Kars");
        iller.add("Kastamonu");
        iller.add("Kayseri");
        iller.add("Kırklareli");
        iller.add("Kırşehir");
        iller.add("Kocaeli");
        iller.add("Konya");
        iller.add("Kütahya");
        iller.add("Malatya");
        iller.add("Manisa");
        iller.add("K.Maraş");
        iller.add("Mardin");
        iller.add("Muğla");
        iller.add("Muş");
        iller.add("Nevşehir");
        iller.add("Niğde");
        iller.add("Ordu");
        iller.add("Rize");
        iller.add("Sakarya");
        iller.add("Samsun");
        iller.add("Siirt");
        iller.add("Sinop");
        iller.add("Sivas");
        iller.add("Tekirdağ");
        iller.add("Tokat");
        iller.add("Trabzon");
        iller.add("Tunceli");
        iller.add("Şanlıurfa");
        iller.add("Uşak");
        iller.add("Van");
        iller.add("Yozgat");
        iller.add("Zonguldak");
        iller.add("Aksaray");
        iller.add("Bayburt");
        iller.add("Karaman");
        iller.add("Kırıkkale");
        iller.add("Batman");
        iller.add("Şırnak");
        iller.add("Bartın");
        iller.add("Ardahan");
        iller.add("Iğdır");
        iller.add("Yalova");
        iller.add("Karabük");
        iller.add("Kilis");
        iller.add("Osmaniye");
        iller.add("Düzce");



        ArrayAdapter<String> adapter;

        adapter = new ArrayAdapter(this, R.layout.spinner_item,iller);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        final String Adana[] = getResources().getStringArray(R.array.Adana);
        final String Adıyaman[] = getResources().getStringArray(R.array.Adıyaman);
        final String Afyon[] = getResources().getStringArray(R.array.Afyon);
        final String Ağrı[] = getResources().getStringArray(R.array.Ağrı);
        final String Amasya[] = getResources().getStringArray(R.array.Amasya);
        final String Ankara[] = getResources().getStringArray(R.array.Ankara);
        final String Antalya[] = getResources().getStringArray(R.array.Antalya);
        final String Artvin[] = getResources().getStringArray(R.array.Artvin);
        final String Aydın[] = getResources().getStringArray(R.array.Aydın);
        final String Balıkesir[] = getResources().getStringArray(R.array.Balıkesir);
        final String Bilecik[] = getResources().getStringArray(R.array.Bilecik);
        final String Bingöl[] = getResources().getStringArray(R.array.Bingöl);
        final String Bitlis[] = getResources().getStringArray(R.array.Bitlis);
        final String Bolu[] = getResources().getStringArray(R.array.Bolu);
        final String Burdur[] = getResources().getStringArray(R.array.Burdur);
        final String Bursa[] = getResources().getStringArray(R.array.Bursa);
        final String Çanakkale[] = getResources().getStringArray(R.array.Çanakkale);
        final String Çankırı[] = getResources().getStringArray(R.array.Çankırı);
        final String Çorum[] = getResources().getStringArray(R.array.Çorum);
        final String Denizli[] = getResources().getStringArray(R.array.Denizli);
        final String Diyarbakır[] = getResources().getStringArray(R.array.Diyarbakır);
        final String Edirne[] = getResources().getStringArray(R.array.Edirne);
        final String Elazığ[] = getResources().getStringArray(R.array.Elazığ);
        final String Erzican[] = getResources().getStringArray(R.array.Erzincan);
        final String Erzurum[] = getResources().getStringArray(R.array.Erzurum);
        final String Eskişehir[] = getResources().getStringArray(R.array.Eskişehir);
        final String Gaziantep[] = getResources().getStringArray(R.array.Gaziantep);
        final String Giresun[] = getResources().getStringArray(R.array.Giresun);
        final String Gümüşhane[] = getResources().getStringArray(R.array.Gümüşhane);
        final String Hakkari[] = getResources().getStringArray(R.array.Hakkari);
        final String Hatay[] = getResources().getStringArray(R.array.Hatay);
        final String Isparta[] = getResources().getStringArray(R.array.Isparta);
        final String Mersin[] = getResources().getStringArray(R.array.Mersin);
        final String İstanbul[] = getResources().getStringArray(R.array.İstanbul);
        final String İzmir[] = getResources().getStringArray(R.array.İzmir);
        final String Kars[] = getResources().getStringArray(R.array.Kars);
        final String Kastamonu[] = getResources().getStringArray(R.array.Kastamonu);
        final String Kayseri[] = getResources().getStringArray(R.array.Kayseri);
        final String Kırklareli[] = getResources().getStringArray(R.array.Kırklareli);
        final String Kırşehir[] = getResources().getStringArray(R.array.Kırşehir);
        final String Kocaeli[] = getResources().getStringArray(R.array.Kocaeli);
        final String Konya[] = getResources().getStringArray(R.array.Konya);
        final String Kütahya[] = getResources().getStringArray(R.array.Kütahya);
        final String Malatya[] = getResources().getStringArray(R.array.Malatya);
        final String Manisa[] = getResources().getStringArray(R.array.Manisa);
        final String Kmaraş[] = getResources().getStringArray(R.array.K_Maraş);
        final String Mardin[] = getResources().getStringArray(R.array.Mardin);
        final String Muğla[] = getResources().getStringArray(R.array.Muğla);
        final String Muş[] = getResources().getStringArray(R.array.Muş);
        final String Nevşehir[] = getResources().getStringArray(R.array.Nevşehir);
        final String Niğde[] = getResources().getStringArray(R.array.Niğde);
        final String Ordu[] = getResources().getStringArray(R.array.Ordu);
        final String Rize[] = getResources().getStringArray(R.array.Rize);
        final String Sakarya[] = getResources().getStringArray(R.array.Sakarya);
        final String Samsun[] = getResources().getStringArray(R.array.Samsun);
        final String Siirt[] = getResources().getStringArray(R.array.Siirt);
        final String Sinop[] = getResources().getStringArray(R.array.Sinop);
        final String Sivas[] = getResources().getStringArray(R.array.Sivas);
        final String Tekirdağ[] = getResources().getStringArray(R.array.Tekirdağ);
        final String Tokat[] = getResources().getStringArray(R.array.Tokat);
        final String Trabzo[] = getResources().getStringArray(R.array.Trabzon);
        final String Tunceli[] = getResources().getStringArray(R.array.Tunceli);
        final String Şanlıurfa[] = getResources().getStringArray(R.array.Şanlıurfa);
        final String Uşak[] = getResources().getStringArray(R.array.Uşak);
        final String Van[] = getResources().getStringArray(R.array.Van);
        final String Yozgat[] = getResources().getStringArray(R.array.Yozgat);
        final String Zonguldak[] = getResources().getStringArray(R.array.Zonguldak);
        final String Aksaray[] = getResources().getStringArray(R.array.Aksaray);
        final String Bayburt[] = getResources().getStringArray(R.array.Bayburt);
        final String Karaman[] = getResources().getStringArray(R.array.Karaman);
        final String Kırıkkale[] = getResources().getStringArray(R.array.Kırıkkale);
        final String Batman[] = getResources().getStringArray(R.array.Batman);
        final String Şırnak[] = getResources().getStringArray(R.array.Şırnak);
        final String Bartın[] = getResources().getStringArray(R.array.Bartın);
        final String Ardahan[] = getResources().getStringArray(R.array.Ardahan);
        final String Iğdır[] = getResources().getStringArray(R.array.Iğdır);
        final String Yalova[] = getResources().getStringArray(R.array.Yalova);
        final String Karabük[] = getResources().getStringArray(R.array.Karabük);
        final String Kilis[] = getResources().getStringArray(R.array.Kilis);
        final String Osmaniye[] = getResources().getStringArray(R.array.Osmaniye);
        final String Düzce[] = getResources().getStringArray(R.array.Düzce);



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
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Adıyaman);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 3) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Afyon);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 4) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Ağrı);
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
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Aydın);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 10) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Balıkesir);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 11) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item,  Bilecik);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 12) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item,Bingöl);
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
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Çanakkale);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 18) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Çankırı);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 19) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Çorum);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 20) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Denizli);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 21) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Diyarbakır);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 22) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Edirne);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 23) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Elazığ);
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
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Eskişehir);
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
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Gümüşhane);
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
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, İstanbul);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 35) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, İzmir);
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
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Kırklareli);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 40) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Kırşehir);
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
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Kütahya);
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
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Kmaraş);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 47) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Mardin);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 48) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Muğla);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 49) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Muş);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 50) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Nevşehir);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 51) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Niğde);
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
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Tekirdağ);
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
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Şanlıurfa);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 64) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Uşak);
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
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item,Kırıkkale);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 72) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Batman);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 73) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Şırnak);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 74) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Bartın);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 75) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Ardahan);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 76) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Iğdır);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 77) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Yalova);
                    spinner2.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 78) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item,Karabük);
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
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MACEKLE.this, R.layout.spinner_item, Düzce);
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
        bilgi.setIl("İl:      "+spinner1.getSelectedItem().toString());
        bilgi.setIlce("İlçe:      "+spinner2.getSelectedItem().toString());
        bilgi.setTelno("Tel no:      "+editText5.getText().toString());
        bilgi.setSaat("Maç saati:      "+editText6.getText().toString());
        bilgi.setTarih("Maç tarihi:       "+editText7.getText().toString());
        bilgi.setMevki("Eksik mevkiler:       "+editText8.getText().toString());
        databaseReference = database.getReference("Bilgiler");
        String key = databaseReference.push().getKey();
        DatabaseReference trabzon= database.getReference("Bilgiler/"+key);
        trabzon.setValue(bilgi);

    }


    public void btnAddData(View view) {





        getValues();

        Toast.makeText(MACEKLE.this,"Maç kaydedildi.",Toast.LENGTH_SHORT).show();




    }
}