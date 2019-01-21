package com.example.carlos.recetas;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class IngredienteDetalleAdapter extends RecyclerView.Adapter<IngredienteDetalleAdapter.MyViewHolder> {

    private List<Ingrediente> ingredientesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nombre, cantidad, descripcion;

        public MyViewHolder(View view) {
            super(view);
            nombre = (TextView) view.findViewById(R.id.nombre_ingrediente);
            cantidad = (TextView) view.findViewById(R.id.catidad_ingrediente);
            descripcion = (TextView) view.findViewById(R.id.descripcion_ingrediente);
        }
    }

    public IngredientesAdapter(List<Ingrediente> ingredientesList) {
        this.ingredientesList = ingredientesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_ingrediente, parent, false);

        return new MyViewHolder(itemView);
    }


    //************Pasarle el ingrediente solo, no toda la lista*****************************+
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position){
        Ingrediente ingrediente = ingredientesList.get(position);
        holder.nombre.setText(ingrediente.getNombre());
        holder.cantidad.setText(ingrediente.getCantidad());
        holder.descripcion.setText(ingrediente.getDescripcion());
    }

    @Override
    public int getItemCount(){
        return ingredientesList.size();
    }
}

