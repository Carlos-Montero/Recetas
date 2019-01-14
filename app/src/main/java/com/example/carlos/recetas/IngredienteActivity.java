package com.example.carlos.recetas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class IngredienteActivity extends AppCompatActivity {

    //private RecyclerView mRecyclerView;
    //private RecyclerView.Adapter mAdapter;
    //private RecyclerView.LayoutManager mLayoutManager;

//************************************************************************

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingrediente);
        //mRecyclerView = (RecyclerView) findViewById(R.id.rv_item_activity_1);
        //mRecyclerView.setHasFixedSize(true);
        //mLayoutManager = new LinearLayoutManager(this);
        //mRecyclerView.setLayoutManager(mLayoutManager);
        //mAdapter = new MyAdapter(myDataset);
        //mRecyclerView.setAdapter(mAdapter);
        //PREPARE DATA
        //prepareIngredienteData();


        //BOTON PARA HACER EL INTENT Y SALTAR A LA SEGUNDA ACTIVITY
        public void toSecondActivity (View v){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }

}

