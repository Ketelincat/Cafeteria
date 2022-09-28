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


public class DonutsFragment extends Fragment {

    List<Coffee> lstdonuts;

    RecyclerView lstlistaDonuts;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_donuts, container, false);

        lstdonuts = new ArrayList<>();

        lstdonuts.add(new Coffee("Donuts","Pão","9.0",R.drawable.donuts));
        lstdonuts.add(new Coffee("Donuts","Pão","9.0",R.drawable.donuts));
        lstdonuts.add(new Coffee("Donuts","Pão","9.0",R.drawable.donuts));
        lstdonuts.add(new Coffee("Donuts","Pão","9.0",R.drawable.donuts));
        lstdonuts.add(new Coffee("Donuts","Pão","9.0",R.drawable.donuts));
        lstdonuts.add(new Coffee("Donuts","Pão","9.0",R.drawable.donuts));
        lstdonuts.add(new Coffee("Donuts","Pão","9.0",R.drawable.donuts));
        lstdonuts.add(new Coffee("Donuts","Pão","9.0",R.drawable.donuts));

        lstlistaDonuts = view.findViewById(R.id.lstlistaDonuts);

        DonutsAdapter adapter = new DonutsAdapter(getContext(),lstdonuts);

        lstlistaDonuts.setLayoutManager(new GridLayoutManager(getContext(),2));

        lstlistaDonuts.setHasFixedSize(true);

        lstlistaDonuts.setAdapter(adapter);

        return view;
    }
}