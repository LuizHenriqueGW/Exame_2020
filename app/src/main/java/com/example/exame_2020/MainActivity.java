package com.example.exame_2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Cachorro c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        c.setNome("douglas");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.Rview);
        MeuAdapter meuAdapter = new MeuAdapter(this, c);
        recyclerView.setAdapter(meuAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}