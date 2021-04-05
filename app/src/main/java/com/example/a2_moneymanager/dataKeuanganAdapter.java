package com.example.a2_moneymanager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class dataKeuanganAdapter extends RecyclerView.Adapter<dataKeuanganAdapter.KeuanganViewHolder> {

    private ArrayList<dataKeuangan> listData;

    public dataKeuanganAdapter(ArrayList<dataKeuangan> listData){
        this.listData = listData;

    }

    @NonNull
    @Override
    public dataKeuanganAdapter.KeuanganViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.data_keuangan, parent, false);
        return new KeuanganViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull dataKeuanganAdapter.KeuanganViewHolder holder, int position) {
        holder.tvTanggal.setText(listData.get(position).getTanggal());
        holder.tvPemasukan.setText(listData.get(position).getPemasukan());
        holder.tvPengeluaran.setText(listData.get(position).getPengeluaran());
    }

    @Override
    public int getItemCount() {
        return (listData!= null) ? listData.size() : 0;
    }

    public class KeuanganViewHolder extends RecyclerView.ViewHolder{

        private TextView tvTanggal, tvPemasukan, tvPengeluaran;
        public KeuanganViewHolder (View view){
            super(view);

            tvTanggal = view.findViewById(R.id.tvTanggal);
            tvPemasukan = view.findViewById(R.id.tvPemasukan);
            tvPengeluaran = view.findViewById(R.id.tvPengeluaran);
        }
    }
}
