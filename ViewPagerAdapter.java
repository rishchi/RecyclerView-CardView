package com.example.rishabh.lastone;

/**
 * Created by Rishabh on 7/5/2017.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
public ViewPagerAdapter(FragmentManager fm) {
 super(fm);
 }

 @Override
public Fragment getItem(int position) {
  if (position == 0) {
   return new FirstFragment();
  } else {
   return new SecondFragment();
  }
 }


 @Override
 public int getCount()
 {
 return 2;
 }
}
