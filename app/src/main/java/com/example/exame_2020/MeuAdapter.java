package com.example.exame_2020;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;
import java.util.List;

public class MeuAdapter extends RecyclerView.Adapter<MeuAdapter.MinhaViewHolder> {
    private Context context;
    List<Cachorro> cao = new LinkedList<>();
    public MeuAdapter(Context ct, Cachorro c){
        context=ct;
        cao.add(c);
    }
    @NonNull
    @Override
    public MinhaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_main, parent, false);
        return new MinhaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MinhaViewHolder holder, int position) {
        holder.textView.setText((CharSequence) cao.get(position));
    }

    @Override
    public int getItemCount() {
        return cao.size();
    }

    public class MinhaViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public MinhaViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.Rview);
        }
    }
}
