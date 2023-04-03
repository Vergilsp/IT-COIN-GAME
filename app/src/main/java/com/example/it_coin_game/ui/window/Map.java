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
                {
                    Bundle bundle = new Bundle();
                    bundle.putInt("id", 6);
                    Navigation.findNavController(v).navigate(R.id.action_map_to_deteil_fragment, bundle);
                }
        );
        binding.ramPam.setOnClickListener(v ->
                {
                    Bundle bundle = new Bundle();
                    bundle.putInt("id", 5);
                    Navigation.findNavController(v).navigate(R.id.action_map_to_deteil_fragment, bundle);
                }
        );
        binding.materiPlata.setOnClickListener(v ->
                {
                    Bundle bundle = new Bundle();
                    bundle.putInt("id", 4);
                    Navigation.findNavController(v).navigate(R.id.action_map_to_deteil_fragment, bundle);
                }
        );
        binding.hardDisk.setOnClickListener(v ->
                {
                    Bundle bundle = new Bundle();
                    bundle.putInt("id", 3);
                    Navigation.findNavController(v).navigate(R.id.action_map_to_deteil_fragment, bundle);
                }
        );
        binding.blokPit.setOnClickListener(v ->
                {
                    Bundle bundle = new Bundle();
                    bundle.putInt("id", 2);
                    Navigation.findNavController(v).navigate(R.id.action_map_to_deteil_fragment, bundle);
                }
        );
        binding.processor.setOnClickListener(v -> {
                    Bundle bundle = new Bundle();
                    bundle.putInt("id", 1);
                    Navigation.findNavController(v).navigate(R.id.action_map_to_deteil_fragment, bundle);
                }
        );
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}
