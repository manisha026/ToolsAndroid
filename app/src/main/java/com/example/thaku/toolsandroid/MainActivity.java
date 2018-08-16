package com.example.thaku.toolsandroid;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
private FunFact factBook=new FunFact();
private ColorWheel colorWhele=new ColorWheel();
    TextView funfact;
    RelativeLayout relativeLayout;
    Button switch_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
funfact=findViewById(R.id.funfact);
switch_button=findViewById(R.id.switch_button);
relativeLayout=findViewById(R.id.relativeLayout);


View.OnClickListener listener=new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String fact=factBook.getFact();
        funfact.setText(fact);
        int color=colorWhele.getColor();
        relativeLayout.setBackgroundColor(color);
        switch_button.setTextColor(color);
    }
};

switch_button.setOnClickListener(listener);
        Toast.makeText(this, "Our Activity was created", Toast.LENGTH_SHORT).show();
        Log.d("FunFact Activity","We are login through the onCreate Method");

    }
}
