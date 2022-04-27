package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.viewHolder>
{
    String data[];
    Context context;

    public RecyclerAdapter(Context context,String[] data) {
        this.data = data;
        this.context = context;
    }
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.custome_design,parent,false);
        viewHolder viewHolder= new viewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.viewHolder holder,int position)
    {
      holder.textView.setText(data[position]);
      holder.textView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Toast.makeText(context,"Clicked on"+data[position], Toast.LENGTH_LONG).show();
          }
      });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class viewHolder extends RecyclerView.ViewHolder
    {
            TextView textView;
            public viewHolder(@NonNull View itemView)
            {
                super(itemView);
                textView=itemView.findViewById(R.id.textNames);
            }
        }
     }


