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

public class DonutsAdapter extends RecyclerView.Adapter<DonutsAdapter.MyviewHolder> {

    private Context mContext;
    private List<Coffee> mData;

    public DonutsAdapter(Context mContext, List<Coffee> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.modelo,parent,false);

        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {
        holder.txtTitulo.setText(mData.get(position).getTitulo());
        holder.txtDescricao.setText(mData.get(position).getDescricao());
        holder.txtNota.setText(mData.get(position).getNota());
        holder.imgCafe.setImageResource(mData.get(position).getImagem());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder{

        TextView txtTitulo, txtDescricao, txtNota;
        ImageView imgCafe;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);

            txtTitulo = itemView.findViewById(R.id.txttituloCafe);
            txtDescricao = itemView.findViewById(R.id.txtFrasecafe);
            txtNota = itemView.findViewById(R.id.txtNotaCafe);
            imgCafe = itemView.findViewById(R.id.imgCafe);
        }
    }
}
