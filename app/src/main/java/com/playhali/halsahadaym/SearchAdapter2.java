package com.playhali.halsahadaym;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class SearchAdapter2 extends RecyclerView.Adapter <SearchAdapter2.SearchViewHolder> {
    Context context;
    ArrayList<String> ilfulList;
    ArrayList<String> isimfulList;
    ArrayList<String> ilcefulList;
    ArrayList<String> mevkifulList;
    ArrayList<String> saatfulList;
    ArrayList<String> telfulList;
    ArrayList<String> yasfulList;


    class SearchViewHolder extends RecyclerView.ViewHolder {

        TextView isim, tel, saat, yas, mevki, il, ilce;

        public SearchViewHolder(View itemView) {
            super(itemView);
            il = itemView.findViewById(R.id.textView22);
            ilce = itemView.findViewById(R.id.textView33);
            isim = itemView.findViewById(R.id.textView44);
            saat = itemView.findViewById(R.id.textView55);
            mevki = itemView.findViewById(R.id.textView66);
            tel = itemView.findViewById(R.id.textView77);
            yas = itemView.findViewById(R.id.textView88);

        }
    }

    public SearchAdapter2(Context context, ArrayList<String> ilfulList, ArrayList<String> ilcefulList, ArrayList<String> isimfulList, ArrayList<String> mevkifulList,
                          ArrayList<String> saatfulList, ArrayList<String> telfulList, ArrayList<String> yasfulList) {

        this.context = context;
        this.isimfulList = isimfulList;
        this.ilfulList = ilfulList;
        this.ilcefulList = ilcefulList;
        this.mevkifulList = mevkifulList;
        this.saatfulList = saatfulList;
        this.yasfulList = yasfulList;
        this.telfulList = telfulList;

    }
    public SearchAdapter2.SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_layout2,parent,false);
        return new SearchAdapter2.SearchViewHolder(view);


    }
    public void onBindViewHolder(@NonNull SearchAdapter2.SearchViewHolder holder, int position) {
        holder.il.setText(ilfulList.get(position));
        holder.ilce.setText(ilcefulList.get(position));
        holder.mevki.setText(mevkifulList.get(position));
        holder.isim.setText(isimfulList.get(position));
        holder.saat.setText(saatfulList.get(position));
        holder.tel.setText(telfulList.get(position));
        holder.yas.setText(yasfulList.get(position));



    }

    @Override
    public int getItemCount() {

        return ilfulList.size();

    }




}



