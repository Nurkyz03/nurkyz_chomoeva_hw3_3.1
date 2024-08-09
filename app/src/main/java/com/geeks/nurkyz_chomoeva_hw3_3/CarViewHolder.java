package com.geeks.nurkyz_chomoeva_hw3_3;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geeks.nurkyz_chomoeva_hw3_3.databinding.CarItemBinding;

public class CarViewHolder extends RecyclerView.ViewHolder {

    CarItemBinding binding;

    public CarViewHolder(@NonNull CarItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(String name, String image) {
        binding.tvName.setText(name);

        Glide.with(binding.imgCar).load(image).into(binding.imgCar);
    }
}
