package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private int nuevo4;
    private int nuevo5;
    private int nuevo6;

    public String myStr;
    public int num1;

    private int prueba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String helloWorld(){
        return "Hello Worl" + nuevo3;
    }
}
