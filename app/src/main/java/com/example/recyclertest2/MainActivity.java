package com.example.recyclertest2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<MainData> arrayList;
    private MainAdapter mainAdapter;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // RecyclerView 설정
        recyclerView = findViewById(R.id.rv);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        arrayList = new ArrayList<>();
        arrayList.add(new MainData("자습실 \n 자습실 사용이 필요한 경우, 자습실 신청을 통해서 원하는 자리를 신청해 보세요.", "재밌다"));
        arrayList.add(new MainData("잔류\n 주말 기숙사 잔류 여부를 확인하고, 잔류신청을 통해서 잔류 또는 귀가를 신청해 보세요", "재밌다"));
        arrayList.add(new MainData("외출 \n 기숙사 생활 중 밖으로 나갈 일이 있다면, 외출 신청을 통해서 나가보세요.", "재밌다"));

        mainAdapter = new MainAdapter(arrayList);
        recyclerView.setAdapter(mainAdapter);

        // 개발자 정보 버튼 클릭 시 액티비티 전환
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Developer_info.class);
                startActivity(intent);
            }
        });
    }
}
