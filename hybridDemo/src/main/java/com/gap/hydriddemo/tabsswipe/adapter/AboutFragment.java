package com.gap.hydriddemo.tabsswipe.adapter;

import android.support.v4.app.Fragment;

/**
 * Created by barryalexander on 1/12/14.
 */

import com.gap.hybriddemo.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class AboutFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_about, container, false);

        WebView aboutWebView = (WebView) rootView.findViewById(R.id.aboutwebview);

        aboutWebView.setInitialScale((int) 50);

        // Enable Javascript
        WebSettings webSettings = aboutWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        aboutWebView.loadUrl("http://m.gap.com/customerservice.html?webapp=1&tid=gpma000001");

        return rootView;
    }
}
