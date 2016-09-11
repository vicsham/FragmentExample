package com.example.vic.fragmentexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by vic on 01/09/2016.
 */
public class Fragment2 extends Fragment {

    private TextView mInfoTextView;
    private ImageView mCatImageView;
    private String[] mCatDescriptionArray;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // return super.onCreateView(inflater, container, savedInstanceState);
        View rootView =inflater.inflate(R.layout.fragment2,container,false);


        mInfoTextView = (TextView) rootView.findViewById(R.id.textView1);
        mCatImageView = (ImageView) rootView.findViewById(R.id.imageView1);

        // загружаем массив из ресурсов
        mCatDescriptionArray = getResources().getStringArray(R.array.cats);

        return rootView;
    }


    public void setDescription(int buttonIndex) {
        String catDescription = mCatDescriptionArray[buttonIndex];
        mInfoTextView.setText(catDescription);

        switch (buttonIndex) {
            case 1:
                mCatImageView.setImageResource(R.drawable.cat1);
                break;
            case 2:
                mCatImageView.setImageResource(R.drawable.cat2);
                break;
            case 3:
                mCatImageView.setImageResource(R.drawable.cat3);
                break;

            default:
                break;
        }
    }
}
