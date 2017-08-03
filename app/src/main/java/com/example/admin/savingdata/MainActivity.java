package com.example.admin.savingdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText, etFname, etLname;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.etName);
        textView = (TextView) findViewById(R.id.tvName);
        etFname = (EditText) findViewById(R.id.etFName);
        etLname = (EditText) findViewById(R.id.etLName);
    }

    public void changeText(View view) {

        String data = editText.getText().toString();
        textView.setText(data);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        String data = textView.getText().toString();
        outState.putString("data", data);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        textView.setText(savedInstanceState.getString("data"));
    }

    public void doSomething(View view) {

        switch (view.getId()){
            case R.id.btnChangeText:
                break;
            case R.id.btnGoToSecond:

                String fName = etFname.getText().toString();
                String lName = etLname.getText().toString();

                Intent intent = new Intent(this, SecondActivity.class);
                intent.putExtra("person", new Person(fName, lName));
                startActivity(intent);
                break;
            case R.id.btnShareData:
                Intent sendIntent = new Intent(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "yooooooooohooooooooooo");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

                break;
        }
    }
}
