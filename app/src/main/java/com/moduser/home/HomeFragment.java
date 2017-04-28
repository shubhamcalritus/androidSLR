package com.moduser.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.moduser.main.DrawerActivity;
import com.moduser.MyManager;
import com.moduser.R;

import butterknife.ButterKnife;

/**
 * Created by claritus on 26/04/17.
 */


public class HomeFragment extends Fragment{
    MyManager myManager=MyManager.getInstance();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        myManager.getActivity().setDrawerState(true);
    }
}

