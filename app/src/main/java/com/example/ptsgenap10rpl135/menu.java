package com.example.ptsgenap10rpl135;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
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

        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {

                mahasiswaArrayList.remove(viewHolder.getAdapterPosition());
                adapter.notifyDataSetChanged();
            }
        }).attachToRecyclerView(recyclerView);

    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Biru", "081577415361","BiruAn@gmail.com","Surabaya 24 Juli 2003",R.drawable.boy1));
        mahasiswaArrayList.add(new Mahasiswa("Langit",  "081290302221", "skyIm@gmail.com", "Kediri 02 Agustus 2004", R.drawable.boy2));
        mahasiswaArrayList.add(new Mahasiswa("Helen" , "085133765643", "Helen02@gmail.com", "Malang 13 Februari 2003", R.drawable.girl1));
        mahasiswaArrayList.add (new Mahasiswa("Devi", "082178994332", "Devida@gmail.com", "Solo 17 Juni 2005", R.drawable.girl2));
        mahasiswaArrayList.add(new Mahasiswa("Dave","083577898000","Yourdap@gmail.com", "Malang 26 Mei 2002",R.drawable.boy3));
        mahasiswaArrayList.add(new Mahasiswa("Brian", "081235557676", "Bri@gmail.com","Surabaya 23 April 2000", R.drawable.boy4));
        mahasiswaArrayList.add(new Mahasiswa("Tania" , "085378789990", "Tan.04@gmail.com", "Malang 16 Oktober 2003", R.drawable.girl3));
        mahasiswaArrayList.add (new Mahasiswa("Bagas", "082144907651", "Bagaskara@gmail.com", "Kediri 13 Juli 2004", R.drawable.boy5));
        mahasiswaArrayList.add(new Mahasiswa("Alea","083564582132","Alea@gmail.com", "Nganjuk 8 Januari 2001",R.drawable.girl4));
        mahasiswaArrayList.add(new Mahasiswa("Dewi", "081586875421", "MahaDewi@gmail.com","Surabaya 23 Maret 2005", R.drawable.girl5));

    }


}