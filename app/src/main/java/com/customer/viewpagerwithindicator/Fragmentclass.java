package com.customer.viewpagerwithindicator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tesark on 18/8/16.
 */
public class Fragmentclass extends Fragment {
    Indicator indicator ;
    int[] imgs = {R.mipmap.clothing, R.mipmap.designers, R.mipmap.diapering, R.mipmap.feeding, R.mipmap.feeding, R.mipmap.footwear};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);

        indicator = new Indicator();
        indicator.imgs = imgs;

        Fragment fragment = new Indicator();
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragment, fragment).commit();

        return view;
    }
}
