package com.nikki.hack.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.nikki.hack.ImageSlider;
import com.nikki.hack.R;
import com.nikki.hack.ViewPagerAdapter;

public class HomeFragment extends Fragment {

//    private HomeViewModel homeViewModel;
        Activity context;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        context = getActivity();
        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onStart() {
        super.onStart();
        Button btn = (Button)context.findViewById(R.id.btn);
        
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ImageSlider.class);
                startActivity(intent);
            }
        });
    }
}