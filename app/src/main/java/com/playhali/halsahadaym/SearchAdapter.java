package com.playhali.halsahadaym;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class SearchAdapter extends RecyclerView.Adapter <SearchAdapter.SearchViewHolder>{
Context context;
    ArrayList<String> ilfulList;
    ArrayList<String> ilcefulList;
    ArrayList<String> mevkifulList;
    ArrayList<String> saatfulList;
    ArrayList<String> tarihfulList;
    ArrayList<String> telnofulList;

    class SearchViewHolder extends  RecyclerView.ViewHolder{

        TextView il,ilce,mevki,saat,tarih,telno;
        public SearchViewHolder(View itemView){
            super(itemView);
            il=itemView.findViewById(R.id.textView2);
            ilce=itemView.findViewById(R.id.textView3);
            mevki=itemView.findViewById(R.id.textView4);
            saat=itemView.findViewById(R.id.textView5);
            tarih=itemView.findViewById(R.id.textView6);
            telno=itemView.findViewById(R.id.textView7);


        }
    }
   public SearchAdapter(Context context,ArrayList<String> ilfulList,ArrayList<String> ilcefulList,ArrayList<String> mevkifulList,ArrayList<String> saatfulList,
                        ArrayList<String> tarihfulList,ArrayList<String> telnofulList){

       this.context=context;
       this.ilfulList=ilfulList;
       this.ilcefulList=ilcefulList;
       this.mevkifulList=mevkifulList;
       this.saatfulList=saatfulList;
       this.tarihfulList=tarihfulList;
       this.telnofulList=telnofulList;

   }

    @NonNull
    @Override
    public SearchAdapter.SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_layout,parent,false);
        return new SearchAdapter.SearchViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {
        holder.il.setText(ilfulList.get(position));
        holder.ilce.setText(ilcefulList.get(position));
        holder.mevki.setText(mevkifulList.get(position));
        holder.saat.setText(saatfulList.get(position));
        holder.tarih.setText(tarihfulList.get(position));
        holder.telno.setText(telnofulList.get(position));

        ;

    }



    @Override
    public int getItemCount() {

        return ilfulList.size();

    }
}
