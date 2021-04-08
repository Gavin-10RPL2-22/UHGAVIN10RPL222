package com.example.uhgavin10rpl222;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.AnalyticsListener;
import com.androidnetworking.interfaces.DownloadListener;
import com.androidnetworking.interfaces.DownloadProgressListener;

import java.util.ArrayList;

public class MahasiswaDataActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaDataAdapter adapter;
    private ArrayList<MahasiswaData> mahasiswaArrayList;
    // we user ArrayList to populate data in RecyclerView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data);
        recyclerView = (RecyclerView) findViewById(R.id.rvdata);

        addData();

        adapter = new MahasiswaDataAdapter(mahasiswaArrayList);
        //selesai ngatur data dari adapter, kemudian di tempel ke Recyclerview nya
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MahasiswaDataActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new MahasiswaData("BAHASA INDONESIA", "Jumlah Peserta : 15"));
        mahasiswaArrayList.add(new MahasiswaData("BAHASA INGGRIS", "Jumlah Peserta : 17"));
        mahasiswaArrayList.add(new MahasiswaData("MATEMATIKA", "Jumlah Peserta : 10"));
        MahasiswaData Sari = new MahasiswaData("IPA", "Jumlah Peserta : 13");
        MahasiswaData Anto = new MahasiswaData("SMK RADEN UMAR SAID", "Jumlah Peserta : 1035");
        MahasiswaData Budi = new MahasiswaData("BLOK PROGRAMMING", "Jumlah Peserta : 547");
        mahasiswaArrayList.add(Budi);
        mahasiswaArrayList.add(Sari);
        mahasiswaArrayList.add(Anto);
    }
}