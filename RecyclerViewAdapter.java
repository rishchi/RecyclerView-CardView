package com.example.rishabh.lastone;

/**
 * Created by Rishabh on 7/5/2017.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
 private static final String LOG_TAG = RecyclerViewAdapter.class.getSimpleName();
 private ArrayList<RecyclerViewModel> mItems;
 ItemListener mListener;
 Context context;
 public static int position;

 public RecyclerViewAdapter(Activity context, ArrayList<RecyclerViewModel> program, ItemListener listener) {

  this.context = context;
  mItems = program;
  mListener = listener;
 }

 public void setOnItemClickListener(ItemListener listener) {
  mListener = listener;
 }

 @Override
 public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
  View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
  context = parent.getContext();
  return new ViewHolder(v);
 }

 @Override
 public void onBindViewHolder(ViewHolder holder, int position) {
  holder.setData(mItems.get(position));
 }

 @Override
 public int getItemCount() {
  if (mItems != null) {
   return mItems.size();
  }
  return 0;
 }

 public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
  public CardView cardView;
  public RecyclerViewModel pName;
  TextView name;
  View textContainer;
  private Context context;

  public ViewHolder(View itemView) {

   super(itemView);
   itemView.setOnClickListener(this);
   cardView = (CardView) itemView.findViewById(R.id.cvItem);
   name = (TextView) itemView.findViewById(R.id.list_text);
   textContainer = itemView.findViewById(R.id.text_container);
   context=itemView.getContext();
  }

  public void setData(RecyclerViewModel pName) {
   this.pName = pName;
   name.setText(pName.getmItemName());
  }

  @Override
  public void onClick(View v) {
   final Intent intent;

   intent=new Intent (context,NextActivity.class);
   context.startActivity(intent);
   Toast.makeText(context, pName.getmItemName(), Toast.LENGTH_SHORT).show();
  }

 }

 public interface ItemListener {
  void onItemClick(RecyclerViewModel pName, int position);
 }
}

