package com.playhali.halsahadaym;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import io.paperdb.Paper;

public class girisyap extends AppCompatActivity {
    EditText emailId,password;
    Button btnSignin;
    FirebaseAuth mFirebaseAuth;




    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girisyap);
        mFirebaseAuth = FirebaseAuth.getInstance();
        emailId = findViewById(R.id.editTextTextPersonName);
        password = findViewById(R.id.editTextTextPersonName2);
        btnSignin = findViewById(R.id.buttongiris);








        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            FirebaseUser mFirebaseuser = mFirebaseAuth.getCurrentUser();


            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
          if(mFirebaseuser !=  null){
              Intent i = new Intent (girisyap.this,GİRİSMENU.class);
              startActivity(i);
          }

            }
        };
        btnSignin.setOnClickListener(v -> {
                String email = emailId.getText().toString();
                String pwd = password.getText().toString();
                if(email.isEmpty()){
                    emailId.setError("Lütfen email giriniz");
                }
                else if(pwd.isEmpty()){
                    password.setError("Lütfen şifre giriniz");
                }
                else if(email.isEmpty() && pwd.isEmpty()){
                    Toast.makeText(girisyap.this,"Alanları doldurunuz",Toast.LENGTH_LONG).show();

                }
            else if(!email.isEmpty() && !pwd.isEmpty()){
               mFirebaseAuth.signInWithEmailAndPassword(email,pwd).addOnCompleteListener(girisyap.this, task -> {
                   if(!task.isSuccessful()){
                       Toast.makeText(girisyap.this,"Bilgilerinizi kontrol edin",Toast.LENGTH_SHORT).show();

                   }
                   else {
                       Toast.makeText(girisyap.this,"Başarıyla giriş yapıldı",Toast.LENGTH_SHORT).show();
                       Intent i = new Intent(girisyap.this,GİRİSMENU.class);
                       startActivity(i);
                   }
               });
                }

        });

    }
    protected void onStart(){
        super.onStart();
        mFirebaseAuth.addAuthStateListener(mAuthStateListener);
    }


}