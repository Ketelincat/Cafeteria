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

       lstCoffee.add(new Coffee("Café", "CAfe quentinho", "9.5", R.drawable.cafe));
       lstCoffee.add(new Coffee("Café", "CAfe quentinho", "9.5", R.drawable.cafe));
       lstCoffee.add(new Coffee("Café", "CAfe quentinho", "9.5", R.drawable.cafe));
       lstCoffee.add(new Coffee("Café", "CAfe quentinho", "9.5", R.drawable.cafe));
       lstCoffee.add(new Coffee("Café", "CAfe quentinho", "9.5", R.drawable.cafe));
       lstCoffee.add(new Coffee("Café", "CAfe quentinho", "9.5", R.drawable.cafe));
       lstCoffee.add(new Coffee("Café", "CAfe quentinho", "9.5", R.drawable.cafe));
       lstCoffee.add(new Coffee("Café", "CAfe quentinho", "9.5", R.drawable.cafe));

        lstlistacafe = view.findViewById(R.id.lstlistacafe);

        CoffeeAdapter adapter = new CoffeeAdapter(getContext(),lstCoffee);

        lstlistacafe.setLayoutManager(new GridLayoutManager(getContext(), 2));

        lstlistacafe.setHasFixedSize(true);

        lstlistacafe.setAdapter(adapter);

        return view;

    }
}