package com.playhali.halsahadaym;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class OYUNCUEKLE extends AppCompatActivity {
    EditText isimsoiyisim;
    Oyuncubilgi bilgii;
    EditText telno;
    EditText tarih;
    Spinner yas,mevki,il,ilçe;
    Button buttonkaydet;
    DatabaseReference databaseReference;
    FirebaseDatabase database;
    String isimsoyisimx;


    String telnox;
    String tarihx;
    int maxid = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_oyuncuekle);
        bilgii = new Oyuncubilgi();

        AdRequest adRequest = new AdRequest.Builder().build();


       database = FirebaseDatabase.getInstance();


        isimsoiyisim = findViewById(R.id.isimsoyisim);
        telno = findViewById(R.id.telno);
        tarih=findViewById(R.id.saat);
        yas=findViewById(R.id.yas);
        mevki=findViewById(R.id.mevki);
        il=findViewById(R.id.il);
        ilçe=findViewById(R.id.ilçe);
        tarihx=tarih.getText().toString();

        buttonkaydet=findViewById(R.id.buttonkaydet);
        isimsoyisimx=isimsoiyisim.getText().toString();
        telnox=telno.getText().toString();
        tarih = findViewById(R.id.saat);
        List<String> yaslar = new ArrayList<>();
        yaslar.add(0,"Yaş giriniz");
        yaslar.add("10-");
        yaslar.add("11");
        yaslar.add("12");
        yaslar.add("13");
        yaslar.add("14");
        yaslar.add("15");
        yaslar.add("16");
        yaslar.add("17");
        yaslar.add("18");
        yaslar.add("19");
        yaslar.add("20");
        yaslar.add("21");
        yaslar.add("22");
        yaslar.add("23");
        yaslar.add("24");
        yaslar.add("25");
        yaslar.add("26");
        yaslar.add("27");
        yaslar.add("28");
        yaslar.add("29");
        yaslar.add("30");
        yaslar.add("31");
        yaslar.add("32");
        yaslar.add("33");
        yaslar.add("34");
        yaslar.add("35");
        yaslar.add("36");
        yaslar.add("37");
        yaslar.add("38");
        yaslar.add("39");
        yaslar.add("40");
        yaslar.add("41");
        yaslar.add("42");
        yaslar.add("43");
        yaslar.add("44");
        yaslar.add("45");
        yaslar.add("46");
        yaslar.add("47");
        yaslar.add("48");
        yaslar.add("49");
        yaslar.add("50");
        yaslar.add("51");
        yaslar.add("52");
        yaslar.add("53");
        yaslar.add("54");
        yaslar.add("55");
        yaslar.add("56");
        yaslar.add("57");
        yaslar.add("58");
        yaslar.add("59");
        yaslar.add("60");
        yaslar.add("61");
        yaslar.add("62");
        yaslar.add("63");
        yaslar.add("64");
        yaslar.add("65+");
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<>(this,R.layout.spinner_item,yaslar);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        yas.setAdapter(adapter);



        List<String> mevkiler = new ArrayList<>();
        mevkiler.add(0, "Mevki seçiniz");
        mevkiler.add("Kaleci");
        mevkiler.add("Defans");
        mevkiler.add("Sol bek");
        mevkiler.add("Sağ bek");
        mevkiler.add("Orta Saha");
        mevkiler.add("Sağ açık");
        mevkiler.add("Sol açık");
        mevkiler.add("Forvet");
        ArrayAdapter<String> adapter2;
        adapter2 = new ArrayAdapter<>(this,R.layout.spinner_item,mevkiler);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mevki.setAdapter(adapter2);

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
        ArrayAdapter<String> adapter3;
        adapter3 = new ArrayAdapter<>(this,R.layout.spinner_item,iller);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        il.setAdapter(adapter3);


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


        yas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
        mevki.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
        il.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
        ilçe.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
        il.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override

            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {

                if (position == 1) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Adana);

                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


                }
                if (position == 2) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Adıyaman);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 3) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Afyon);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 4) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Ağrı);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 5) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Amasya);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 6) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Ankara);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 7) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Antalya);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 8) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Artvin);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 9) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Aydın);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 10) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Balıkesir);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 11) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item,  Bilecik);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 12) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item,Bingöl);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 13) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Bitlis);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 14) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Bolu);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 15) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Burdur);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 16) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Bursa);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 17) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Çanakkale);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 18) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Çankırı);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 19) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Çorum);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 20) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Denizli);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 21) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Diyarbakır);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 22) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Edirne);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 23) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Elazığ);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 24) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Erzican);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 25) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Erzurum);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 26) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Eskişehir);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 27) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Gaziantep);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 28) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Giresun);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 29) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Gümüşhane);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 30) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Hakkari);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 31) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Hatay);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 32) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item,Isparta);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 33) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Mersin);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 34) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, İstanbul);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 35) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, İzmir);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 36) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Kars);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 37) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Kastamonu);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 38) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Kayseri);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 39) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Kırklareli);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 40) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Kırşehir);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 41) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Kocaeli);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 42) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Konya);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 43) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Kütahya);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 44) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Malatya);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 45) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Manisa);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 46) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Kmaraş);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 47) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Mardin);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 48) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Muğla);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 49) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Muş);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 50) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Nevşehir);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 51) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Niğde);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 52) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Ordu);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 53) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Rize);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 54) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Sakarya);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 55) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Samsun);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 56) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Siirt);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 57) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Sinop);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 58) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Sivas);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 59) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Tekirdağ);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 60) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Tokat);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 61) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Trabzo);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 62) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Tunceli);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 63) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Şanlıurfa);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 64) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Uşak);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 65) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Van);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 66) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Yozgat);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 67) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Zonguldak);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 68) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Aksaray);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 69) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Bayburt);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 70) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Karaman);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 71) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item,Kırıkkale);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 72) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Batman);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 73) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Şırnak);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 74) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Bartın);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 75) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Ardahan);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 76) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Iğdır);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 77) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Yalova);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 78) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item,Karabük);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 79) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item,Kilis);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }if (position == 80) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item,Osmaniye);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }
                if (position == 81) {
                    ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OYUNCUEKLE.this, R.layout.spinner_item, Düzce);
                    ilçe.setAdapter(adapter2);
                    adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                }





            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });










    }
    private void getValues(){






        bilgii.setIsim("İsim:          "+isimsoiyisim.getText().toString());
        bilgii.setTelno("Tel no:         "+telno.getText().toString());
        bilgii.setSaat("Uygun Saatler:         "+tarih.getText().toString());
        bilgii.setYas("Yaş:         "+yas.getSelectedItem().toString());
        bilgii.setMevki("Mevki:        "+mevki.getSelectedItem().toString());
        bilgii.setIl("İl:        "+il.getSelectedItem().toString());
        bilgii.setIlce("İlçe:        "+ilçe.getSelectedItem().toString());
        databaseReference = database.getReference("Oyuncubilgiler");
        String key = databaseReference.push().getKey();
        DatabaseReference trabzon= database.getReference("Oyuncubilgiler/"+key);
        trabzon.setValue(bilgii);

    }
    public void btnAddDataa(View view) {





        getValues();

        Toast.makeText(OYUNCUEKLE.this,"Oyuncu kaydedildi.",Toast.LENGTH_SHORT).show();




    }
}