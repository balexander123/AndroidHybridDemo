package com.gap.hydriddemo.tabsswipe.adapter;

/**
 * Created by barryalexander on 1/12/14.
 */

import com.gap.hybriddemo.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class ShopFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_shop, container, false);

        WebView shopWebView = (WebView) rootView.findViewById(R.id.shopwebview);

        shopWebView.setInitialScale((int) 50);

        // Enable Javascript
        WebSettings webSettings = shopWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        shopWebView.loadUrl("http://m.skavaone.com//");

        return rootView;
    }

}
