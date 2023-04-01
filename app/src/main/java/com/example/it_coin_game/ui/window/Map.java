package com.example.it_coin_game.ui.window;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.it_coin_game.R;
import com.example.it_coin_game.databinding.FragMapBinding;

public class Map extends Fragment {

    private FragMapBinding binding;

    public Map() {
        super(R.layout.frag_map);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragMapBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.videoKarta.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_map_to_deteil_fragment));
        binding.ramPam.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_map_to_deteil_fragment));
        binding.materiPlata.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_map_to_deteil_fragment));
        binding.hardDisk.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_map_to_deteil_fragment));
        binding.blokPit.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_map_to_deteil_fragment));
        binding.processor.setOnClickListener(v ->
                Navigation.findNavController(v).navigate(R.id.action_map_to_deteil_fragment));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}
