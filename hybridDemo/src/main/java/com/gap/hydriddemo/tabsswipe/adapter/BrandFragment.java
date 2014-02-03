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
public class BrandFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_brand, container, false);

        WebView brandWebView = (WebView) rootView.findViewById(R.id.brandwebview);

        brandWebView.setInitialScale((int) 50);

        // Enable Javascript
        WebSettings webSettings = brandWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        brandWebView.loadUrl("http://m.gap.com/skava/static/hybridapp/v2/switchbrands/index.html?id=gap");

        return rootView;
    }
}
