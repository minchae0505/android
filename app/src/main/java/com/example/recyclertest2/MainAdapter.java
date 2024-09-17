package com.example.recyclertest2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder>{

    private ArrayList<MainData> arrayList;

    public MainAdapter(ArrayList<MainData> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.ViewHolder holder, int position) {

        holder.tv1.setText(arrayList.get(position).getTv1());
//        holder.tv2.setText(arrayList.get(position).getTv2());

    }

    @Override
    public int getItemCount() {
        return (null != arrayList ? arrayList.size() : 0);
    }

    public void remove(int position) {
        try {
            arrayList.remove(position);
            notifyItemRemoved(position);
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        protected TextView tv1;
//        protected TextView tv2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tv1 = (TextView) itemView.findViewById(R.id.tv1); // tv1 초기화
//            this.tv2 = (TextView) itemView.findViewById(R.id.tv2); // tv2 초기화
        }
    }
}