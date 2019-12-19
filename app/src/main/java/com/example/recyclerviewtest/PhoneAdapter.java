package com.example.recyclerviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PhoneAdapter extends RecyclerView.Adapter<PhoneAdapter.PhoneHolder> {

    ArrayList<Phone> phonelist;
    Context context;

    public PhoneAdapter(ArrayList<Phone> phonelist , Context context) {

        this.phonelist = phonelist;
        this.context = context;

    }

    @NonNull
    @Override
    public PhoneHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        
        View view = LayoutInflater.from(context).inflate(R.layout.row_design,parent,false);
        PhoneHolder holder = new PhoneHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull PhoneHolder holder, int position) {

          holder.img.setImageResource(phonelist.get(position).getImg());
          holder.tx_name.setText(phonelist.get(position).getName());
          holder.tx_price.setText(phonelist.get(position).getPrice()+"LE");
          holder.tx_seemore.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

              }
          });

    }

    @Override
    public int getItemCount() {
        return phonelist.size();
    }

    public class PhoneHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView tx_name,tx_price,tx_seemore;

        public PhoneHolder(@NonNull View itemView) {
            super(itemView);

          img = itemView.findViewById(R.id.img);
          tx_name = itemView.findViewById(R.id.name);
          tx_price = itemView.findViewById(R.id.price);
          tx_seemore = itemView.findViewById(R.id.seemore);
        }
    }
}
