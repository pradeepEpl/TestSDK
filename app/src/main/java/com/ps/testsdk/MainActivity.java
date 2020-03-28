package com.ps.testsdk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.fareway.activity.ShoppingFw;
import com.fareway.utility.AppUtilFw;
import com.ps.testsdk.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    String TAG = MainActivity.class.getName();
    ActivityMainBinding binding;
    AppUtilFw appUtilFw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        appUtilFw = new AppUtilFw(MainActivity.this);
        binding.login.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
        });

        binding.shoppingList.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ShoppingFw.class));
        });

        binding.saveLogin.setOnClickListener(v -> {
            appUtilFw.setPrefrence("Email", "kaprajapati@epsilonium.com");
            appUtilFw.setPrefrence("Password", "123456");
        });

        binding.logout.setOnClickListener(v -> {
            appUtilFw.setPrefrence("Email", null);
            appUtilFw.setPrefrence("Password", null);
        });

        binding.pHistory.setOnClickListener(v -> {

        });
    }
}
