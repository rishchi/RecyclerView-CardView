package com.example.rishabh.lastone;

/**
 * Created by Rishabh on 7/5/2017.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_layout,container, false);
        return rootView;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final ArrayList<RecyclerViewModel> pname = new ArrayList<RecyclerViewModel>();

        pname.add(new RecyclerViewModel("Biology"));
        pname.add(new RecyclerViewModel("Chemistry"));
        pname.add(new RecyclerViewModel("Physics 1"));
        pname.add(new RecyclerViewModel("AP Chemistry"));
        pname.add(new RecyclerViewModel("AP Biology"));


        final RecyclerViewAdapter itemsAdapter = new RecyclerViewAdapter(SecondFragment.this.getActivity(), pname, null);
        final RecyclerView clv = (RecyclerView) view.findViewById(R.id.clist);
        clv.setLayoutManager(new LinearLayoutManager(SecondFragment.this.getActivity()));
        clv.setHasFixedSize(true);
        clv.setAdapter(itemsAdapter);

    }
}
