package com.example.multipilcationtablecreator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
      Button btn;
    EditText Edit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        Edit1= findViewById(R.id.edit1) ;
        btn= findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value= Edit1. getText(). toString();
                int Value=Integer. parseInt(value);
                populate(Value);
            }
        });

    }




    public void populate(int table){
        String ans = "";
        for (int i =1; i<=10;i++){
           ans+=(table + " X " + i + " = " + table*i + "\n");
        }
        System.out.println(ans);
        textView.setText(ans);
    }

}
