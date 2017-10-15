package com.example.vikas.q;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.id;
import static android.R.attr.x;
import static com.example.vikas.q.R.id.btnC;
import static com.example.vikas.q.R.id.btnD;
import static com.example.vikas.q.R.id.btnOne;
import static com.example.vikas.q.R.id.button1;
//main class
public class MainActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.txtCalc);
        Button btnc = ( Button) findViewById(btnC);
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button btnd = ( Button) findViewById(btnD);
        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button btnone = ( Button) findViewById(btnOne);
        btnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("1");
            }
        });
    }
}
