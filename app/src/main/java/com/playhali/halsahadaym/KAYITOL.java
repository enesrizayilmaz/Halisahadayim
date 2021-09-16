package com.playhali.halsahadaym;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

import io.paperdb.Paper;

public class KAYITOL extends AppCompatActivity {
    EditText edt_isimsoyisim,edt_email,edt_telno, edt_sifre;

    Button button8_kayit,button2_kayit,button_cıkıs;

    FirebaseAuth yetki;
    DatabaseReference yol;
    ProgressDialog pd;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mFirebaseAuth = FirebaseAuth.getInstance();
        setContentView(R.layout.activity_kayitol);
        button2_kayit = findViewById(R.id.button2);
        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
        FirebaseUser mFirebaseuser = mFirebaseAuth.getCurrentUser();
        public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
            if (mFirebaseuser != null) {
                Intent i = new Intent(KAYITOL.this, GİRİSMENU.class);
                startActivity(i);
            }
        }

        };

        edt_telno = findViewById(R.id.editText2);
        edt_isimsoyisim = findViewById(R.id.editText);
        edt_sifre = findViewById(R.id.editText3);
        button8_kayit = findViewById(R.id.button8_kayit);
        yetki = FirebaseAuth.getInstance();
        edt_email=findViewById(R.id.editText4);




        button2_kayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KAYITOL.this,girisyap.class);
                startActivity(intent);
            }
        });


        button8_kayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pd = new ProgressDialog(KAYITOL.this);
                pd.setMessage("Lütfen Bekleyin");
                //yeni kullanıcı kaydı
                String str_isimsoyisim = edt_isimsoyisim.getText().toString();
                String str_telno = edt_telno.getText().toString();
                String str_sifre = edt_sifre.getText().toString();
                String str_email = edt_email.getText().toString();
                if (TextUtils.isEmpty(str_sifre) || TextUtils.isEmpty(str_email)) {
                    Toast.makeText(KAYITOL.this, "Lütfen bütün alanları doldurunuz.", Toast.LENGTH_SHORT).show();
                }
                else {
                    kaydet(str_isimsoyisim,str_email,str_telno,str_sifre);
                }
            }
        });

            }
    protected void onStart(){
        super.onStart();
        mFirebaseAuth.addAuthStateListener(mAuthStateListener);
    }






    private void kaydet(final String isimsoyisim, final String email,final String telno,final String sifre) {

        //yeni kullanıcı kaydı
        yetki.createUserWithEmailAndPassword(email, sifre)
                .addOnCompleteListener(KAYITOL.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            FirebaseUser firebasekullanici = yetki.getCurrentUser();
                            String email = firebasekullanici.getUid();
                            yol = FirebaseDatabase.getInstance().getReference().child("Kullanıcılar").child(email);
                            HashMap<String, Object> hashMap = new HashMap<>();

                            hashMap.put("isimsoyisim", isimsoyisim);
                            hashMap.put("telno", telno);

                            yol.setValue(hashMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()) {
                                        pd.dismiss();
                                        Intent intent = new Intent(KAYITOL.this, GİRİSMENU.class);
                                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                                        startActivity(intent);
                                        Toast.makeText(KAYITOL.this, "Kayıt tamamlandı", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });


                        } else {

                            Toast.makeText(KAYITOL.this, "Emailinizin doğruluğunu ve internetinizi kontrol ediniz.", Toast.LENGTH_LONG).show();
                        }

                    }

                });
    }
}