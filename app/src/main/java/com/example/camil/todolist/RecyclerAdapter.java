package com.example.camil.todolist;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

public  class RecyclerAdapter extends RecyclerView.Adapter <RecyclerAdapter.ToDoHolder > {

    private ArrayList<TodoItem> items;

    @Override
    public ToDoHolder onCreateViewHolder(ViewGroup  parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent,false);
        return new ToDoHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(ToDoHolder  holder, int position) {
        TodoItem it = items.get(position);
        holder.bindToDo(it);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ToDoHolder extends RecyclerView.ViewHolder {
        private Resources res;
        private ImageView img;
        private Switch sw;
        private TextView lab;
        private TodoItem item;

        public ToDoHolder(View itemView) {
            super(itemView);
            this.img = (ImageView)itemView.findViewById(R.id.image);
            this.sw = (Switch)itemView.findViewById(R.id.swi);
            this.lab = (TextView)itemView.findViewById(R.id.label);
            this.res = itemView.getResources();
        }

        public void bindToDo(TodoItem td) {
            this.lab.setText(td.getLab());
            this.sw.setChecked(td.getTachRea());
            switch(td.getTag()) {
                case Faible:
                    this.img.setBackgroundColor(this.res.getColor(R.color.faible));
                case Normal:
                    this.img.setBackgroundColor(this.res.getColor(R.color.normal));
                case Important:
                    this.img.setBackgroundColor(this.res.getColor(R.color.important));
            }
        }

    }

}
