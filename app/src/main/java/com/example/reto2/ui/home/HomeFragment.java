package com.example.reto2.ui.home;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.reto2.R;
import com.example.reto2.databinding.FragmentHomeBinding;
import com.example.reto2.ui.servicios.ServiciosViewModel;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;
    private ImageView foodimage1;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //homeViewModel =
                //new ViewModelProvider(this).get(HomeViewModel.class);

        //binding = FragmentHomeBinding.inflate(inflater, container, false);
       //View root = binding.getRoot();

       // foodimage1= (ImageView) binding.foodimage1;
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        View root = inflater.inflate(R.layout.fragment_home,container,false);
        binding(R.layout.fragment_home);

        Resources res = getResources();
        Drawable drawable=res.getDrawable(R.drawable.chirizo);
        foodimage1=(ImageView) binding.foodimage1;



       return root;
    }

    private void binding(int fragment_home) {
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();


    }
}