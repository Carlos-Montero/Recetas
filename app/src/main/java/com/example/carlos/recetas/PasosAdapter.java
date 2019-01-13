package com.example.carlos.recetas;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class PasosAdapter extends RecyclerView.Adapter<PasosAdapter.MyViewHolder> {

    private List<Paso> pasosList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nombrePaso, duracion;

        public MyViewHolder(View view) {
            super(view);
            nombrePaso = (TextView) view.findViewById(R.id.nombre_paso);
            duracion = (TextView) view.findViewById(R.id.duracion_paso);
        }
    }

    public PasosAdapter(List<Paso> pasosList) {
        this.pasosList = pasosList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rv_item_activity_2, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position){
        Paso paso = pasosList.get(position);
        holder.nombrePaso.setText(paso.getNombrePaso());
        holder.duracion.setText(paso.getDuracion());
    }

    @Override
    public int getItemCount(){
        return pasosList.size();
    }
}






