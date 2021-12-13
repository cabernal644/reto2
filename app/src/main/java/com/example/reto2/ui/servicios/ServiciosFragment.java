package com.example.reto2.ui.servicios;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.reto2.R;
import com.example.reto2.databinding.FragmentHomeBinding;
import com.example.reto2.ui.home.HomeViewModel;

public class ServiciosFragment extends Fragment {
    private ServiciosViewModel serviciosViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        serviciosViewModel =
                new ViewModelProvider(this).get(ServiciosViewModel.class);

        View root = inflater.inflate(R.layout.fragment_service,container,false);

        final TextView textView = root.findViewById(R.id.text_home1);
        serviciosViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
}
}
