package com.blueradix.android.myrecyclerviewwithsqlitestarter.recyclerView;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.blueradix.android.myrecyclerviewwithsqlitestarter.R;
import com.blueradix.android.myrecyclerviewwithsqlitestarter.entities.Monster;

import java.util.List;

public class monsterRecyclerViewAdapter extends RecyclerView.Adapter<monsterViewHolder> {


    List<Monster> monsters;
    Context context;

    public monsterRecyclerViewAdapter(List<Monster> monsters, Context context) {
        this.monsters = monsters;
        this.context = context;
    }
/*
 Creates a view holder whenever the RecyclerView needs a new one.
 this is the moment when the row is inflated, passed to the viewholder object
 and each child view can be found and stored
  */

    @NonNull
    @Override
    public monsterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflate the custom layout (recycler_item_view.xml)
        LayoutInflater inflater = LayoutInflater.from(context);
        View monsterView  = inflater.inflate(R.layout.recycler_item_view, parent, false);

        //return a new holder instance
        monsterViewHolder monsterViewHolder = new monsterViewHolder(monsterView);

        return monsterViewHolder;
    }


    /*
    Takes a viewholder and sets the proper list data (from the list) on the view
     */

    @Override
    public void onBindViewHolder(@NonNull monsterViewHolder holder, int position) {
        //get the data from the list at the position position
        Monster monster = monsters.get(position);
        holder.updateMonster(monster);

    }

    @Override
    public int getItemCount() {
        return monsters.size();

    }
}
