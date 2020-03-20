package com.example.navigationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        NavController controller = Navigation.findNavController( this,R.id.fragment );
        NavigationUI.setupActionBarWithNavController( this,controller );
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController controller = Navigation.findNavController( this,R.id.fragment );
        return controller.navigateUp();
       // return super.onSupportNavigateUp( );

    }
}
