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

public class OYUNCUBUL extends AppCompatActivity {
    EditText ilview,ilceview;
    RecyclerView recyclerView22;
    FirebaseUser firebaseUser;
    DatabaseReference mDatabaseReference;
    ArrayList<String> isimfulList;
    ArrayList<String> telfulList;
    ArrayList<String> saatfulList;
    ArrayList<String> yasfulList;
    ArrayList<String> mevkifulList;
    ArrayList<String> ilfulList;
    String A;
    String c;
    String B;
    String s;
    ArrayList<String> ilcefulList;
    private InterstitialAd mInterstitialAd;


    SearchAdapter2 searchAdapter2;

    public OYUNCUBUL() {
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_oyuncubul);
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3058256649555601/9880858985");
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


        recyclerView22 = findViewById(R.id.recylerView22);
        ilview = findViewById(R.id.ilview);
        ilceview = findViewById(R.id.ilceview);

        mDatabaseReference = FirebaseDatabase.getInstance().getReference();
        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        isimfulList = new ArrayList<>();
        ilfulList = new ArrayList<>();
        ilcefulList = new ArrayList<>();
        mevkifulList = new ArrayList<>();
        saatfulList = new ArrayList<>();
        yasfulList = new ArrayList<>();
        telfulList = new ArrayList<>();


        recyclerView22.setLayoutManager(new LinearLayoutManager(this));
        recyclerView22.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        dividerItemDecoration.setDrawable(getResources().getDrawable(R.drawable.recyclervieww));
        recyclerView22.addItemDecoration(dividerItemDecoration);

        boolean b = recyclerView22.hasFixedSize();
        b = true;

        ilview.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable c) {

                if (!c.toString().isEmpty()) {

                    setAdapter(c.toString());

                } else {


                    ilfulList.clear();
                    ilcefulList.clear();
                    mevkifulList.clear();
                    saatfulList.clear();
                    isimfulList.clear();
                    telfulList.clear();
                    yasfulList.clear();
                    recyclerView22.removeAllViews();

                }

            }

        });
        ilceview.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!s.toString().isEmpty()) {


                    A = ilview.getText().toString();
                    Editable b = new SpannableStringBuilder(A);
                    c = s.toString();
                    B = b.toString();
                    setAdapter2(B, c);


                } else {

                    A = ilview.getText().toString();
                    Editable b = new SpannableStringBuilder(A);

                    ilal(b);


                }


            }
        });
    }






    private void ilal(Editable s) {

        if (!s.toString().isEmpty()) {

            setAdapter(s.toString());

        }
    }
        private void setAdapter(final String searchedString) {

            mDatabaseReference.child("Oyuncubilgiler").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                    ilfulList.clear();
                    ilcefulList.clear();
                    mevkifulList.clear();
                    saatfulList.clear();
                    isimfulList.clear();
                    telfulList.clear();
                    yasfulList.clear();
                    recyclerView22.removeAllViews();


                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {

                        String vid = snapshot.getKey();
                        String il = snapshot.child("il").getValue(String.class);
                        String ilce = snapshot.child("ilce").getValue(String.class);
                        String isim = snapshot.child("isim").getValue(String.class);
                        String mevki = snapshot.child("mevki").getValue(String.class);
                        String saat = snapshot.child("saat").getValue(String.class);
                        String telno = snapshot.child("telno").getValue(String.class);
                        String yas = snapshot.child("yas").getValue(String.class);


                        if (il.toLowerCase().contains(searchedString.toLowerCase())) {


                            ilfulList.add(il);
                            ilcefulList.add(ilce);
                            isimfulList.add(isim);
                            mevkifulList.add(mevki);
                            saatfulList.add(saat);
                            telfulList.add(telno);
                            yasfulList.add(yas);


                        } else {


                            recyclerView22.removeAllViews();
                        }

                        searchAdapter2 = new SearchAdapter2(OYUNCUBUL.this, ilfulList, ilcefulList, isimfulList, mevkifulList, saatfulList, telfulList, yasfulList);
                        recyclerView22.setAdapter(searchAdapter2);


                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }
    private void setAdapter2(final String searchedString ,final String searchedString2){
        mDatabaseReference.child("Oyuncubilgiler").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                ilfulList.clear();
                ilcefulList.clear();
                mevkifulList.clear();
                saatfulList.clear();
                isimfulList.clear();
                telfulList.clear();
                yasfulList.clear();
                recyclerView22.removeAllViews();


                for(DataSnapshot snapshot:dataSnapshot.getChildren()){

                    String vid = snapshot.getKey();
                    String il = snapshot.child("il").getValue(String.class);
                    String ilce = snapshot.child("ilce").getValue(String.class);
                    String isim = snapshot.child("isim").getValue(String.class);
                    String mevki = snapshot.child("mevki").getValue(String.class);
                    String saat = snapshot.child("saat").getValue(String.class);
                    String telno = snapshot.child("telno").getValue(String.class);
                    String yas = snapshot.child("yas").getValue(String.class);

                    if(il.toLowerCase().contains(searchedString.toLowerCase())&&ilce.toLowerCase().contains(searchedString2.toLowerCase())){
                        ilfulList.add(il);
                        ilcefulList.add(ilce);
                        isimfulList.add(isim);
                        mevkifulList.add(mevki);
                        saatfulList.add(saat);
                        telfulList.add(telno);
                        yasfulList.add(yas);







                    }



                    searchAdapter2 = new SearchAdapter2(OYUNCUBUL.this, ilfulList, ilcefulList, isimfulList, mevkifulList, saatfulList, telfulList, yasfulList);
                    recyclerView22.setAdapter(searchAdapter2);



                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

           ilview.addTextChangedListener(new TextWatcher() {
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
                        isimfulList.clear();
                        telfulList.clear();
                        yasfulList.clear();
                        recyclerView22.removeAllViews();
                    }

                }

            });

    }
}

    