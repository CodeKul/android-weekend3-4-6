package com.codekul.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class OtherFragment extends Fragment {


    public OtherFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =
                inflater.inflate(R.layout.fragment_other, container, false);

        rootView.findViewById(R.id.btnMy).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(R.drawable.my);
            }
        });

        rootView.findViewById(R.id.btnRocket).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(R.mipmap.ic_launcher);
            }
        });

        return rootView;
    }

    private void loadFragment(int image){

        FragmentManager manager = getActivity().getSupportFragmentManager();
        FragmentTransaction txn = manager.beginTransaction();
        txn.replace(R.id.frameContainer,AllFragment.getInstacne(image));
        txn.commit();
    }
}
