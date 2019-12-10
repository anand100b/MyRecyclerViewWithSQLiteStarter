package com.blueradix.android.myrecyclerviewwithsqlitestarter.recyclerView;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.blueradix.android.myrecyclerviewwithsqlitestarter.R;
import com.blueradix.android.myrecyclerviewwithsqlitestarter.entities.Monster;

//we create this view holder representing the recycler_item_view.xml
// with this class we can manipulate the view

public class monsterViewHolder extends RecyclerView.ViewHolder {

    public final ImageView monsterImageView;
    public final TextView monsterName;
    public final TextView montserDescription;

    public monsterViewHolder(@NonNull View itemView) {
        super(itemView);

        monsterImageView = itemView.findViewById(R.id.monsterImageView);
        monsterName = itemView.findViewById(R.id.monsterName);
        montserDescription = itemView.findViewById(R.id.monsterDescription);
    }

    public void updateMonster(Monster monster){
        monsterImageView.setImageResource(R.drawable.ic_monster_1);
        monsterName.setText(monster.getName());
        montserDescription.setText(monster.getDescription());

    }
}
