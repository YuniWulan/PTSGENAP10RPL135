package com.example.ptsgenap10rpl135;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;

import java.util.ArrayList;

public class menu extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        recyclerView = (RecyclerView) findViewById(R.id.rvdata);
        addData();
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(menu.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Biru", "1876598324543", "081577415361","BiruAn@gmail.com","Surabaya 24 Juli 2003"));
        mahasiswaArrayList.add(new Mahasiswa("Langit", "1865925321341", "081290302221", "skyIm@gmail.com", "Kediri 02 Agustus 2004"));
        mahasiswaArrayList.add(new Mahasiswa("Helen", "1451870937894", "085133765643", "Helen02@gmail.com", "Malang 13 Februari 2003"));
        mahasiswaArrayList.add (new Mahasiswa("Davi", "1647392219025" , "082178994332", "Davida@gmail.com", "Solo 17 April 2005"));
    }
}