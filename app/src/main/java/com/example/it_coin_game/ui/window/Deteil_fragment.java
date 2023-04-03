package com.example.it_coin_game.ui.window;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.it_coin_game.R;
import com.example.it_coin_game.databinding.DeteilFragBinding;

public class Deteil_fragment extends Fragment {

    private DeteilFragBinding binding;

    public Deteil_fragment() {
        super(R.layout.deteil_frag);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DeteilFragBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int id = getArguments().getInt("id");


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
