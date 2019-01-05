package com.mass.creative.hello_world_android;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button helloBtn;
    TextView nameTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloBtn = (Button) findViewById(R.id.helloBtn);
        nameTxt = (TextView)findViewById(R.id.nameTxt);
        helloBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Greetings "+nameTxt.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });

    }


}
