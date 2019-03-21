package com.thedakrogers.rogersresume;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.thedakrogers.rogersresume.ContactMeFragment;
import com.thedakrogers.rogersresume.EducationFragment;
import com.thedakrogers.rogersresume.TechSkillsFragment;

public class ResumeFragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;
    public ResumeFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
           switch (position) {
               case 0:
                   return new ContactMeFragment();
               case 1:
                   return new EducationFragment();
               case 2:
                   return new TechSkillsFragment();
                   default:
                       return null;
       }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.contact_me);
            case 1:
                return mContext.getString(R.string.education);
            case 2:
                return mContext.getString(R.string.tech_skills);
        default:
            return null;
        }
    }
}
