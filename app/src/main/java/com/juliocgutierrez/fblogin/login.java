package com.juliocgutierrez.fblogin;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class login extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = null;
        fragment = new loginFragment();
        fragmentManager.beginTransaction().replace(R.id.contenedorFragment, fragment).commit();

    }
}
