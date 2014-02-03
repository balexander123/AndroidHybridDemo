package com.gap.hydriddemo.tabsswipe.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.gap.hybriddemo.R;

/**
 * Created by barryalexander on 1/12/14.
 */
public class StoresFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_stores, container, false);

        WebView storesWebView = (WebView) rootView.findViewById(R.id.storeswebview);

        storesWebView.setInitialScale((int) 50);

        // Enable Javascript
        WebSettings webSettings = storesWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        storesWebView.loadUrl("http://m.skavaone.com/storelocator.html");

        return rootView;
    }
}
