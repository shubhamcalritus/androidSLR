package com.moduser.login_signup;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.moduser.main.DrawerActivity;
import com.moduser.MyManager;
import com.moduser.R;
import com.moduser.home.HomeFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {


    @BindView(R.id.imageView_logo)
    ImageView imageViewLogo;
    @BindView(R.id.editText_email)
    EditText editTextEmail;
    @BindView(R.id.editText_password)
    EditText editTextPassword;
    @BindView(R.id.button_login)
    Button buttonLogin;
    @BindView(R.id.textView_forgotpassword)
    TextView textViewForgotpassword;
    @BindView(R.id.contratintlayout_parent)
    ConstraintLayout contratintlayoutParent;
    Unbinder unbinder;
    MyManager myManager=MyManager.getInstance();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        myManager.getActivity().setDrawerState(false);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.imageView_logo, R.id.button_login, R.id.textView_forgotpassword})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageView_logo:
                break;
            case R.id.button_login:
                HomeFragment homeFragment= new HomeFragment();
                getActivity().getSupportFragmentManager().beginTransaction().add(R.id
                        .frame_container,homeFragment,"home").setCustomAnimations(R.anim
                        .enter_anim,R.anim.exit_anim).commit();
                break;
            case R.id.textView_forgotpassword:
                break;
        }
    }
}
