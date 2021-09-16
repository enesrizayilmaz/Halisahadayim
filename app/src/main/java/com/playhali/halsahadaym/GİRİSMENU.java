package com.playhali.halsahadaym;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.onesignal.OneSignal;


import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.auth.FirebaseAuth;

public class GİRİSMENU extends AppCompatActivity {
    public Button button11;

    public Button button13;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;
    public Button button3;
    public Button buttonilet;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girismenu);
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();

        MobileAds.initialize(this, initializationStatus -> {
            AdView adView = new AdView(this);
            adView.setAdSize(AdSize.BANNER);
            adView.setAdUnitId("ca-app-pub-3058256649555601/1958136932");
            mAdView = findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);






        });


        button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kadrokur = new Intent(GİRİSMENU.this, KADROKUR.class);
                startActivity(kadrokur);
            }
        }

        );
        buttonilet =findViewById(R.id.button75);
        buttonilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ilet = new Intent(GİRİSMENU.this,ILET.class);
                startActivity(ilet);
            }
        });


        button13 = findViewById(R.id.button63);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent adambul = new Intent(GİRİSMENU.this, OYUNCUBUL.class);
                startActivity(adambul);
            }
        }

        );
        button6 = findViewById(R.id.button64);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent adambul = new Intent(GİRİSMENU.this, OYUNCUEKLE.class);
                startActivity(adambul);
            }
        });
        button7 = findViewById(R.id.button61);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent adambul = new Intent(GİRİSMENU.this, MACEKLE.class);
                startActivity(adambul);
            }
        }

        );
        button8 = findViewById(R.id.button62);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent adambul = new Intent(GİRİSMENU.this, MACARA.class);
                startActivity(adambul);
            }
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (GİRİSMENU.this, activity.class);
                startActivity(i);
            }
        });






    }
}