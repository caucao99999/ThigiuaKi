package com.example.luuanhkiet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener{
    EditText edtUN;
    EditText edtPW;
    Button btnL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onInit();
        btnL.setOnClickListener(this);
    }
    public void onLogin() {
        if (onValidateForm()){
            if(edtUN.getText().toString().equals("1706020050") && edtPW.getText().toString().equals("anhkiet")){
                Toast.makeText(Login.this, "Chào mừng bạn!!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Login.this,DSMH.class);
                startActivity(intent);
            }
            else
                Toast.makeText(Login.this, "fall", Toast.LENGTH_LONG).show();

        }
    }


    private boolean onValidateForm(){
        if( edtUN.getText().toString().length() < 1){
            edtUN.setError("Please fill your Username");
            return false;
        }
        if( edtPW.getText().toString().length() < 1){
            edtPW.setError("Please fill your Password");
            return false;
        }
        return true;
    }

    private  void onInit() {
        edtUN = findViewById(R.id.main_edtUN);
        edtPW = findViewById(R.id.main_edtPW);
        btnL = findViewById(R.id.main_btnL);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.main_btnL:
                onLogin();
        }
    }
}