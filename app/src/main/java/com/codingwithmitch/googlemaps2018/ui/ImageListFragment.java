package com.codingwithmitch.googlemaps2018.ui;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;



import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ImageListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ImageListFragment extends Fragment {

    private static final String TAG = "ImageListFragment";
    private static final int NUM_COLUMNS = 2;

    //widgets
    private RecyclerView mRecyclerView;


    //vars
    private ArrayList<Integer> mImageResources = new ArrayList<>();
    private IProfile mIProfile;

    public ImageListFragment() {
        // Required empty public constructor
    }


    public static ImageListFragment newInstance() {
        return new ImageListFragment();
    }





    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mIProfile = (IProfile) getActivity();
    }


}








