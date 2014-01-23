package com.gap.hydriddemo.tabsswipe.adapter;

/**
 * Created by barryalexander on 1/12/14.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Shopping fragment activity
                return new ShopFragment();
            case 1:
                // Switch brand fragment activity
                return new BrandFragment();
            case 2:
                // Store locator fragment activity
                return new StoresFragment();
            case 3:
                // Scan product fragment activity
                return new ScanFragment();
            case 4:
                // About fragment activity
                return new AboutFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 5;
    }

}