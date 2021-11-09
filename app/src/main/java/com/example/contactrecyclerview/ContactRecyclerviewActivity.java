package com.example.contactrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ContactRecyclerviewActivity extends AppCompatActivity {

    List<ListModel> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_recyclerview);

        addData();
    }

    private void addData() {
        elements = new ArrayList<>();
        elements.add(new ListModel("#775447","Indra","08123424567","Active"));
        elements.add(new ListModel("#409F69","Sian","08234432895","Disable"));
        elements.add(new ListModel("#7A70D4","Dimas","0818423343","Non Active"));
        elements.add(new ListModel("#EA4239","Putri","0878732443","Active"));
        elements.add(new ListModel("#66C2FF","Naadia","0895215345","Active"));
        elements.add(new ListModel("#E9B36B","Ayu","08955232345","Active"));
        elements.add(new ListModel("#BC6F2A","Putra","0895523345","Active"));
        elements.add(new ListModel("#7EB94B","Dian","0895532345","Active"));
        elements.add(new ListModel("#66C2FF","Naadia","0895215345","Active"));
        elements.add(new ListModel("#E9B36B","Ayu","08955232345","Active"));
        elements.add(new ListModel("#BC6F2A","Putra","0895523345","Active"));
        elements.add(new ListModel("#7EB94B","Dian","0895532345","Active"));



        ListAdapter listAdapter = new ListAdapter(elements, this, new ListAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(ListModel item) {
                detail(item);
            }
        });
        RecyclerView recyclerView = findViewById(R.id.RvContact);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
    public  void detail(ListModel item){
        Intent intent = new Intent(this,DetailActivity.class);
        intent.putExtra("ListModel",item);
        startActivity(intent);
    }
}