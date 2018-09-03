package com.dbsduwls103.ex12_recyclerweather2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.Holder> {

    private Context context;
    private ArrayList<WeeklyModel> weeklyModels;

    public RecyclerAdapter(Context context, ArrayList<WeeklyModel> weeklyModels) {
        this.context = context;
        this.weeklyModels = weeklyModels;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_item, parent, false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        WeeklyModel item = weeklyModels.get(position);
        Picasso.get().load(item.getIcon()).resize(200,200).into(holder.ivIcon);
        holder.tvDate.setText(item.getDate());
        holder.tvTemp.setText(item.getTemp());
        holder.tvTempMax.setText(item.getTempMax());
        holder.tvTempMin.setText(item.getTempMin());
        holder.tvDetail.setText(item.getDetail());
        holder.tvSummary.setText(item.getSummary());
    }

    @Override
    public int getItemCount() {
        return weeklyModels.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        private ImageView ivIcon;
        private TextView tvDate;
        private TextView tvTemp;
        private TextView tvTempMin;
        private TextView tvTempMax;
        private TextView tvDetail;
        private TextView tvSummary;

        public Holder(View itemView) {
            super(itemView);
            ivIcon = itemView.findViewById(R.id.iv_icon);
            tvDate = itemView.findViewById(R.id.tv_date);
            tvTemp = itemView.findViewById(R.id.tv_temp);
            tvTempMin = itemView.findViewById(R.id.tv_temp_min);
            tvTempMax = itemView.findViewById(R.id.tv_temp_max);
            tvDetail = itemView.findViewById(R.id.tv_detail);
            tvSummary = itemView.findViewById(R.id.tv_summary);
        }
    }
}
