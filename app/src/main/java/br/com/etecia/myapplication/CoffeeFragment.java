package br.com.etecia.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class CoffeeFragment extends Fragment {

    List<Coffee> lstCoffee;

    RecyclerView lstlistacafe;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_coffee, container, false);

        lstCoffee = new ArrayList<>();

       lstCoffee.add(new Coffee("Café", "Negao do jeito que tu gosta", "9.5", R.drawable.cafe));
       lstCoffee.add(new Coffee("Café com leite", "Seu café palmiteiro", "10.0", R.drawable.cafe_com_leite));
       lstCoffee.add(new Coffee("Café Expresso", "Seu café mais rápido que um trem", "9.7", R.drawable.cafe_expresso));
       lstCoffee.add(new Coffee("Capuccino", "isso aqui foi misturado com Toddy", "7.0", R.drawable.capuccino));
       lstCoffee.add(new Coffee("Irish Coffee", "Fique bebado no seu trabalho", "10.0", R.drawable.irish_coffee));
       lstCoffee.add(new Coffee("Machiatto", "Café light-skin", "8.3", R.drawable.machiatto));
       lstCoffee.add(new Coffee("Mocha", "Cafe que não é café", "7.0", R.drawable.mocha));
       lstCoffee.add(new Coffee("Latte", "AU AU", "9.5", R.drawable.latte));

        lstlistacafe = view.findViewById(R.id.lstlistacafe);

        CoffeeAdapter adapter = new CoffeeAdapter(getContext(),lstCoffee);

        lstlistacafe.setLayoutManager(new GridLayoutManager(getContext(), 2));

        lstlistacafe.setHasFixedSize(true);

        lstlistacafe.setAdapter(adapter);

        return view;

    }
}