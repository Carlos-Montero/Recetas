package com.example.carlos.recetas;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class IngredientesAdapter extends RecyclerView.Adapter<IngredientesAdapter.MyViewHolder> {

    private List<Ingrediente> ingredientesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nombre, cantidad;

        public MyViewHolder(View view) {
            super(view);
            nombre = (TextView) view.findViewById(R.id.nombre_ingrediente);
            cantidad = (TextView) view.findViewById(R.id.catidad_ingrediente);
        }
    }

    public IngredientesAdapter(List<Ingrediente> ingredientesList) {
        this.ingredientesList = ingredientesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rv_item_activity_1, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position){
        Ingrediente ingrediente = ingredientesList.get(position);
        holder.nombre.setText(ingrediente.getNombre());
        holder.cantidad.setText(ingrediente.getCantidad());
    }

    @Override
    public int getItemCount(){
        return ingredientesList.size();
    }
}



















}
