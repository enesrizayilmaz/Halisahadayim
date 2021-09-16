package com.playhali.halsahadaym;

import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MACARA extends AppCompatActivity {
DatabaseReference mDatabaseReference;
EditText searchView,searchView2,searchView3;
RecyclerView recyclerView;
FirebaseUser firebaseUser;
    public String A;
    private InterstitialAd mInterstitialAd;

ArrayList<String> ilfulList;



ArrayList<String> ilcefulList;
ArrayList<String> mevkifulList;
ArrayList<String> saatfulList;
ArrayList<String> tarihfulList;
ArrayList<String> telnofulList;
SearchAdapter searchAdapter;
String c;
String B;
SearchAdapter searchAdapter2;
String s;

    public MACARA() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3058256649555601/9707854198");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {

            @Override
            public void onAdLoaded() {
                // Load the next interstitial.
                mInterstitialAd.show();
                super.onAdLoaded();

            }

        });

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });

        setContentView(R.layout.activity_macara);
       recyclerView = findViewById(R.id.recylerView);
        searchView = findViewById(R.id.searchView);
        searchView2 = findViewById(R.id.searchView2);
        mDatabaseReference = FirebaseDatabase.getInstance().getReference();
        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();


        ilfulList = new ArrayList<>();
        ilcefulList = new ArrayList<>();
        mevkifulList = new ArrayList<>();
        saatfulList = new ArrayList<>();
        tarihfulList = new ArrayList<>();
        telnofulList = new ArrayList<>();

        boolean b = recyclerView.hasFixedSize();
        b = true;

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        dividerItemDecoration.setDrawable(getResources().getDrawable(R.drawable.recyclervieww));
        recyclerView.addItemDecoration(dividerItemDecoration);



        searchView.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

            @Override
            public void afterTextChanged(Editable c) {

                if(!c.toString().isEmpty()){

                    setAdapter(c.toString());

                } else {


                    ilfulList.clear();
                    ilcefulList.clear();
                    mevkifulList.clear();
                    saatfulList.clear();
                    tarihfulList.clear();
                    telnofulList.clear();
                    recyclerView.removeAllViews();

                }

            }

        });

        searchView2.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(!s.toString().isEmpty()){


                    A=searchView.getText().toString();
                    Editable b = new SpannableStringBuilder(A);
                    c = s.toString();
                    B=b.toString();
                    setAdapter2(B,c);


                }
                else{

                    A=searchView.getText().toString();
                    Editable b = new SpannableStringBuilder(A);

                    ilal(b);









                }


            }
        });




    }


    private void ilal(Editable s){

                if(!s.toString().isEmpty()){

                    setAdapter(s.toString());

                }

    }



    private void setAdapter(final String searchedString) {

        mDatabaseReference.child("Bilgiler").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                ilfulList.clear();
                ilcefulList.clear();
                mevkifulList.clear();
                saatfulList.clear();
                tarihfulList.clear();
                telnofulList.clear();
                recyclerView.removeAllViews();


                for(DataSnapshot snapshot:dataSnapshot.getChildren()){

                    String vid=snapshot.getKey();
                    String il= snapshot.child("il").getValue(String.class);
                    String ilce= snapshot.child("ilce").getValue(String.class);
                    String mevki= snapshot.child("mevki").getValue(String.class);
                    String saat= snapshot.child("saat").getValue(String.class);
                    String tarih= snapshot.child("tarih").getValue(String.class);
                    String telno= snapshot.child("telno").getValue(String.class);


                    if(il.toLowerCase().contains(searchedString.toLowerCase())){


                        ilfulList.add(il);
                        ilcefulList.add(ilce);
                        mevkifulList.add(mevki);
                        saatfulList.add(saat);
                        tarihfulList.add(tarih);
                        telnofulList.add(telno);





                    }
                    else {


                        recyclerView.removeAllViews();
                    }

                    searchAdapter = new SearchAdapter(MACARA.this,ilfulList,ilcefulList,mevkifulList,saatfulList,tarihfulList,telnofulList);
                    recyclerView.setAdapter(searchAdapter);



                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
    private void setAdapter2(final String searchedString ,final String searchedString2){
        mDatabaseReference.child("Bilgiler").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                ilfulList.clear();
                ilcefulList.clear();
                mevkifulList.clear();
                saatfulList.clear();
                tarihfulList.clear();
                telnofulList.clear();
                recyclerView.removeAllViews();

                for(DataSnapshot snapshot:dataSnapshot.getChildren()){

                    String  vid=snapshot.getKey();
                   String il=snapshot.child("il").getValue(String.class);
                    String ilce= snapshot.child("ilce").getValue(String.class);
                    String mevki= snapshot.child("mevki").getValue(String.class);
                    String saat= snapshot.child("saat").getValue(String.class);
                    String tarih= snapshot.child("tarih").getValue(String.class);
                    String telno= snapshot.child("telno").getValue(String.class);


                    if(il.toLowerCase().contains(searchedString.toLowerCase())&&ilce.toLowerCase().contains(searchedString2.toLowerCase())){
                        ilfulList.add(il);
                        ilcefulList.add(ilce);
                        mevkifulList.add(mevki);
                        saatfulList.add(saat);
                        tarihfulList.add(tarih);
                        telnofulList.add(telno);







                    }



                    searchAdapter2 = new SearchAdapter(MACARA.this,ilfulList,ilcefulList,mevkifulList,saatfulList,tarihfulList,telnofulList);
                    recyclerView.setAdapter(searchAdapter2);



                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }


}
