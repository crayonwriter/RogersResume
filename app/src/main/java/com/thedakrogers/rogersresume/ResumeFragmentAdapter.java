package com.thedakrogers.rogersresume;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.thedakrogers.rogersresume.ContactMeFragment;
import com.thedakrogers.rogersresume.EducationFragment;
import com.thedakrogers.rogersresume.TechSkillsFragment;

public class ResumeFragmentAdapter extends FragmentPagerAdapter {
    public ResumeFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
           switch (position) {
               case 0:
                   return new ContactMeFragment();
               case 1:
                   return new EducationFragment();
               case 3:
                   return new TechSkillsFragment();
                   default:
                       return null;
       }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
