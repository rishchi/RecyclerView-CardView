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

public class FirstFragment extends Fragment {
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

 pname.add(new RecyclerViewModel("Pre-Algebra"));
 pname.add(new RecyclerViewModel("Algebra I"));
 pname.add(new RecyclerViewModel("Geometry"));
 pname.add(new RecyclerViewModel("Algebra II"));
 pname.add(new RecyclerViewModel("PreCalculus"));
 pname.add(new RecyclerViewModel("Calculus AB"));
 pname.add(new RecyclerViewModel("Calculus BC"));


 final RecyclerViewAdapter itemsAdapter = new RecyclerViewAdapter(FirstFragment.this.getActivity(), pname, null);
 final RecyclerView clv = (RecyclerView) view.findViewById(R.id.clist);
 clv.setLayoutManager(new LinearLayoutManager(FirstFragment.this.getActivity()));
 clv.setHasFixedSize(true);
 clv.setAdapter(itemsAdapter);

 }
}
