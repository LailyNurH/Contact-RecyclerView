package com.example.contactrecyclerview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private final LayoutInflater mInflater;
    private List<ListModel> listData;
    private LayoutInflater layoutInflater;
    private  Context context;
    final ListAdapter.OnItemClickListener listener;




    public ListAdapter(List<ListModel> listData,Context context, ListAdapter.OnItemClickListener listener) {
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.listData = listData;
        this.listener = listener;


    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_contact, null);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, final int position) {
        holder.bindData(listData.get(position));
    }

    public void setItems(List<ListModel> items) {
        listData = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iconImage;
        TextView title, no, status;

        ViewHolder(View itemView) {
            super(itemView);
            iconImage = itemView.findViewById(R.id.iconImages);
            title = itemView.findViewById(R.id.namacontact);
            no = itemView.findViewById(R.id.telf);
            status = itemView.findViewById(R.id.status);
        }


         void bindData(final ListModel item) {
            iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            title.setText(item.getTitle());
            no.setText(item.getNo());
            status.setText(item.getStatus());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }

    }
    public interface OnItemClickListener{
        void onItemClick(ListModel item);
    }


}
