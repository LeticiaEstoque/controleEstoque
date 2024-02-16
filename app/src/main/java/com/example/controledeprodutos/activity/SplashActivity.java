package com.example.controledeprodutos.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.example.controledeprodutos.R;
import com.example.controledeprodutos.autenticacao.LoginActivity;
import com.example.controledeprodutos.helper.FirebaseHelper;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler(Looper.getMainLooper()).postDelayed(this::verficaLogin, 3000);

    }

    private void verficaLogin(){
        if(FirebaseHelper.getAutenticado()){
            startActivity(new Intent(this, MainActivity.class));
        }else{
            startActivity(new Intent(this, LoginActivity.class));
        }
    }
}