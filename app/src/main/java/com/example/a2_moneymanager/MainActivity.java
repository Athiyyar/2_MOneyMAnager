package com.example.a2_moneymanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private dataKeuanganAdapter datakeuanganAdapter;
    private ArrayList<dataKeuangan> dataKeuanganArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recycleview);
        datakeuanganAdapter = new dataKeuanganAdapter(dataKeuanganArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(datakeuanganAdapter);
    }

    public void getData(){
        dataKeuanganArrayList = new ArrayList<>();
        dataKeuanganArrayList.add(new dataKeuangan("12 Maret 2021","1.200.000","500.000"));
        dataKeuanganArrayList.add(new dataKeuangan("15 Maret 2021","290.000","80.000"));
        dataKeuanganArrayList.add(new dataKeuangan("17 Maret 2021","1.200.000","180.000"));
        dataKeuanganArrayList.add(new dataKeuangan("18 Maret 2021","1.900.000","560.000"));
        dataKeuanganArrayList.add(new dataKeuangan("19 Maret 2021","1.600.000","380.000"));
        dataKeuanganArrayList.add(new dataKeuangan("20 Maret 2021","1.008.000","180.000"));
        dataKeuanganArrayList.add(new dataKeuangan("21 Maret 2021","1.090.000","100.000"));
        dataKeuanganArrayList.add(new dataKeuangan("22 Maret 2021","1.900.000","800.000"));
        dataKeuanganArrayList.add(new dataKeuangan("23 Maret 2021","1.050.000","170.000"));

    }
}