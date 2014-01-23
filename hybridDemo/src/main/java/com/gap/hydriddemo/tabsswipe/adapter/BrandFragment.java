package com.gap.hydriddemo.tabsswipe.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gap.hybriddemo.R;

/**
 * Created by barryalexander on 1/12/14.
 */
public class BrandFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_brand, container, false);

        return rootView;
    }
}
