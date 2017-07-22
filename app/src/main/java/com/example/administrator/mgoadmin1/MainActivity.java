package com.example.administrator.mgoadmin1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    private EditText gen;
    private Button ana;
    private DatabaseReference mDatabase;

    private String name;
    private String qrcode;
    private String date_installed;
    private String no_vice;
    private String medium;
    private String expert;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        mDatabase = FirebaseDatabase.getInstance().getReference();


        onClickButtonListener();


    }


    public void onClickButtonListener(){

        ana = (Button) findViewById(R.id.button2);
        ana.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick (View v){

                        gen = (EditText) findViewById(R.id.editText);
                        name = gen.getText().toString();

                        gen = (EditText) findViewById(R.id.editText2);
                        qrcode = gen.getText().toString();

                        gen = (EditText) findViewById(R.id.editText3);
                        date_installed = gen.getText().toString();

                        gen = (EditText) findViewById(R.id.editText4);
                        no_vice = gen.getText().toString();

                        gen = (EditText) findViewById(R.id.editText5);
                        medium = gen.getText().toString();

                        gen = (EditText) findViewById(R.id.editText6);
                        expert = gen.getText().toString();

                        Artifact a = new Artifact(name,qrcode,date_installed,"spk",no_vice,medium,expert);

                        mDatabase.child("Artifacts").child(qrcode).setValue(a);


                        Toast.makeText(getApplicationContext(), "Artifact is added Successfully", Toast.LENGTH_LONG).show();

                    }
                }
        );

    }
}
