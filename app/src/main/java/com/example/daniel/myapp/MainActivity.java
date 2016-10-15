package com.example.daniel.myapp;

import android.content.Intent;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener  {

    Person person;
    Button sendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Info");
        sendBtn = (Button) findViewById(R.id.button);
        sendBtn.setOnClickListener(this);
    }

    /** Called when the user clicks the Send button */
    public void onClick(View view) {
        // Do something in response to button
        person = new Person();
        EditText textInfo = (EditText) findViewById(R.id.edit_message);
        person.firstName = textInfo.getText().toString();
        textInfo = (EditText) findViewById(R.id.edit_message2);
        person.lastName = textInfo.getText().toString();
        textInfo = (EditText) findViewById(R.id.edit_message3);
        person.healthCardNo = textInfo.getText().toString();
        textInfo = (EditText) findViewById(R.id.edit_message4);
        person.symptoms = textInfo.getText().toString();
        textInfo = (EditText) findViewById(R.id.edit_message5);
        person.allergies = textInfo.getText().toString();
        System.out.println(person.createEmail());
        try {
            GMailSender sender = new GMailSender("fishingfan100@gmail.com", "smellyjohn10");
        }
    }
}
