package com.ps.testsdk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.fareway.activity.SplashFw;
import com.fareway.utility.AppUtilFw;
import com.ps.testsdk.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;
    AppUtilFw appUtilFw;
    String EMAIL = "kaprajapati@epsilonium.com";
    String PASSWORD = "123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        binding.login.setOnClickListener(v -> {
            appUtilFw = new AppUtilFw(LoginActivity.this);
            binding.email.setText(EMAIL);
            binding.password.setText(PASSWORD);
            appUtilFw.setPrefrence("Email", EMAIL);
            appUtilFw.setPrefrence("Password", PASSWORD);
            //appUtilFw.setPrefrence("ComeFrom", );
            startActivity(new Intent(LoginActivity.this, SplashFw.class));
            //finish();
        });
    }
}
