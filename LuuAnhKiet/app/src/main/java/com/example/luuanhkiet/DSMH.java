package com.example.luuanhkiet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class DSMH extends AppCompatActivity {
    ListView listView;
    List<ContactModel> modelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        onInit();
        onSetData();
        ContactAdapter adapter = new ContactAdapter(DSMH.this,R.layout.thongtinmonhoc,modelList);
        listView.setAdapter(adapter);
    }

    private void onSetData() {
        modelList = new ArrayList();
        modelList.add(new ContactModel("Android cơ bản","2TH129","3.0"));
        modelList.add(new ContactModel("Anh văn 2","2DC008","3.0"));
        modelList.add(new ContactModel("Lập trình PHP cơ bản","2PP129","3.0"));
    }

    private void onInit() {
        listView = findViewById(R.id.lv_contact);
    }
}
