package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.addBtn);
        ListView listView = findViewById(R.id.listItems);
        ArrayList<String> list = new ArrayList<>();
        list.add("Zakupy: chleb,masło,ser");
        list.add("Do zrobenia: obiad,umyć podłogi");
        list.add("weekend: kkino,spacer z psem");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1,list);
        listView.setAdapter(adapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textInput = findViewById(R.id.newElementInput);
                String text = textInput.getText().toString().trim();
                list.add(text);
                adapter.notifyDataSetChanged();
            }
        });
    }
}