package br.com.etecia.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.MyViewHolder> {

    private Context mContext;
    private List<Coffee> mData;

    public CoffeeAdapter(Context mContext, List<Coffee> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater mInflate = LayoutInflater.from(mContext);
        view = mInflate.inflate(R.layout.modelo,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txtTitulo.setText(mData.get(position).getTitulo());
        holder.txtDescricao.setText(mData.get(position).getDescricao());
        holder.txtNota.setText(mData.get(position).getNota());
        holder.imgCafe.setImageResource(mData.get(position).getImagem());
    }

    @Override
    public int getItemCount() {

        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView txtTitulo, txtDescricao, txtNota;
        ImageView imgCafe;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtTitulo = itemView.findViewById(R.id.txttituloCafe);
            txtDescricao = itemView.findViewById(R.id.txtFrasecafe);
            txtNota = itemView.findViewById(R.id.txtNotaCafe);
            imgCafe = itemView.findViewById(R.id.imgCafe);

        }
    }
}
