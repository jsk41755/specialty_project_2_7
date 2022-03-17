package com.example.a2week_2_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button1;
    Button button2;

    RadioGroup radioGroup;
    RadioButton radioButton1;
    RadioButton radioButton2;

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editTextTextPersonName2);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);

        radioButton1 = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);


        imageView = (ImageView) findViewById(R.id.imageView);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),editText.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(str));
                startActivity(intent);
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(radioButton1.isChecked())
                    imageView.setImageResource(R.drawable.android_12);
                else if(radioButton2.isChecked())
                    imageView.setImageResource(R.drawable.cbnu_logo);
            }
        });

    }
}