package com.codekul.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AllFragment extends Fragment {

    public static final String KEY_IMAGE = "image" ;

    public static AllFragment getInstacne(int image){

        AllFragment fragment = new AllFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_IMAGE,image);
        fragment.setArguments(bundle);
        
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_all, container, false);

        ((ImageView)rootView
                .findViewById(R.id.imageView))
                .setImageResource(getArguments().getInt(KEY_IMAGE));

        return rootView;
    }
}
