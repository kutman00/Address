package com.geektech.address;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AddressViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;

    public AddressViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.address);
    }

    public void bind(String address) {

        textView.setText(address);
    }
}
