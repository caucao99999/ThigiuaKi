package com.example.luuanhkiet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Contact extends AppCompatActivity {
    TextView tvUsername;
    TextView tvNganh;
    TextView tvMSV;
    TextView tvSTC;
    TextView tvTMH;
    TextView tvMMH;
    TextView tvGV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_detil);
        OnInit();
        onGetIntent();
    }

    private void onGetIntent() {
        Intent intent = getIntent();
        ContactModel model = (ContactModel)intent.getSerializableExtra("ContactModel");
        tvUsername.setText("Name: " + "Lưu Anh Kiệt");
        tvNganh.setText("Ngành: " + "Tin học lập trình");
        tvMSV.setText("Mx SV: " + "1706020042");
        tvSTC.setText("Tín chỉ: " + model.getSTC());
        tvTMH.setText("Tên môn học: " + model.getTMH());
        tvMMH.setText("Mã môn học: " + model.getMMH());
        tvGV.setText("Giảng viên: " + "Cao Thành Phú");
    }

    private void OnInit() {
        tvUsername = findViewById(R.id.contact_detail_tvUserName);
        tvNganh = findViewById(R.id.contact_detail_tvNganh);
        tvMSV = findViewById(R.id.contact_detail_tvMSV);
        tvSTC = findViewById(R.id.contact_detail_tvSTC);
        tvTMH = findViewById(R.id.contact_detail_tvTMH);
        tvMMH = findViewById(R.id.contact_detail_tvMSV);
        tvGV = findViewById(R.id.contact_detail_tvGV);
    }
}
