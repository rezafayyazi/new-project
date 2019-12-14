package com.example.myapplication;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.viewHolder> {
    private static ArrayList<String> title;

    private static Context context;
    private static ArrayList<post> array;
    onclick click;

    public adapter(Context context, ArrayList<post> array, onclick click) {


        this.context = context;
        this.array = array;
        this.click = click;
    }

    public adapter(Context context, ArrayList<post> array) {
        this.context = context;
        this.array = array;
    }

    public adapter(ArrayList<post> array) {
        this.context = context;
        this.array = array;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.information, viewGroup, false);
        return new viewHolder(view, click);
    }

    @Override
    public void onBindViewHolder(viewHolder viewHolder, int i) {

        post p = array.get(i);
        viewHolder.textView1.setText(p.getTitle());
        viewHolder.textView2.setText(p.getText());

    }

    @Override
    public int getItemCount() {
        return array.size();
    }



    public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView imageView;
        private TextView textView1;
        private TextView textView2;
        onclick Onclick;

        public viewHolder(View itemView, onclick Onclick) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.ss);
            textView2 = itemView.findViewById(R.id.ssss);
            this.Onclick = Onclick;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Onclick.action(getAdapterPosition());
        }
    }

    public interface onclick {
        public void action(int position);


    }

    public void filter(ArrayList name) {

        array = new ArrayList<>();
        array.addAll(name);
        notifyDataSetChanged();


    }
    public static ArrayList<String> send() {
        int i;

        title = new ArrayList<>();
        for (i = 0; i < array.size(); i++) {
            Log.d(String.valueOf(context),"nummmmmmm"+array.size());
            String Title = array.get(i).getTitle();
            title.add(Title);
        }
        return title;

    }
}
