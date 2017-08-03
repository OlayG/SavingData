package com.example.admin.savingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvTextView = (TextView) findViewById(R.id.tvDisplayName);

        Intent intent = getIntent();
        Person person = intent.getParcelableExtra("person");
        String fName = person.getfName();
        String lName = person.getlName();

        tvTextView.setText(fName + " " + lName);


    }
}
