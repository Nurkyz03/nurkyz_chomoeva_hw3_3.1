package com.geeks.nurkyz_chomoeva_hw3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.geeks.nurkyz_chomoeva_hw3_3.databinding.FragmentFirstFragmentBinding;


public class FirstFragmentFragment extends Fragment {

    FragmentFirstFragmentBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFirstFragmentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.textOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textOne.setText("1");
            }
        });

    }


}