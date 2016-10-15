package com.example.daniel.myapp;

import android.content.Intent;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainActivity extends AppCompatActivity {

   Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Info");
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) throws IOException {
        // Do something in response to button
        person = new Person();
        PrintWriter out = new PrintWriter(new FileWriter("Info.txt"));
        EditText textInfo = (EditText) findViewById(R.id.edit_message);
        person.firstName = textInfo.getText().toString();
        textInfo = (EditText) findViewById(R.id.edit_message2);
        person.lastName = textInfo.getText().toString();
        out.println(person.firstName + " " + person.lastName);
        textInfo = (EditText) findViewById(R.id.edit_message3);
        person.healthCardNo = textInfo.getText().toString();
        out.println(person.healthCardNo);
        textInfo = (EditText) findViewById(R.id.edit_message4);
        person.symptoms = textInfo.getText().toString();
        out.println(person.symptoms);
        textInfo = (EditText) findViewById(R.id.edit_message5);
        person.allergies = textInfo.getText().toString();
        out.println(person.allergies);
        out.flush();
        out.close();

    }
}
