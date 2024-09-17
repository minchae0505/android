package com.example.recyclertest2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Developer_info extends AppCompatActivity {
    private ArrayList<MainData> arrayList;
    private MainAdapter mainAdapter;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.developer_info_activity);  // 적절한 레이아웃 파일을 설정하세요.

        // RecyclerView 설정
        recyclerView = findViewById(R.id.rtv);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        arrayList = new ArrayList<>();
        arrayList.add(new MainData("1층 가온실\n 전학년 남녀", "재밌다"));
        arrayList.add(new MainData("1층 나온실\n 전학년 남녀", "재밌다"));
        arrayList.add(new MainData("1층 다온실 \n 전학년 남녀", "재밌다"));
        arrayList.add(new MainData("1층 라온실 \n 전학년 남녀", "재밌다"));
        arrayList.add(new MainData("1층 라온실 \n 전학년 남녀", "재밌다"));
        arrayList.add(new MainData("2층 자습실 \n 전학년 남녀", "재밌다"));
        arrayList.add(new MainData("3층 자습실 \n 전학년 남녀", "재밌다"));
        arrayList.add(new MainData("4층 자습실1 \n 전학년 남녀", "재밌다"));
        arrayList.add(new MainData("5층 자습실 \n 전학년 남녀", "재밌다"));

        mainAdapter = new MainAdapter(arrayList);
        recyclerView.setAdapter(mainAdapter);

    }
}
