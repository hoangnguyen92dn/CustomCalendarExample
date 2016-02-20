package com.example.hoang.myapplication;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HOANG on 2/20/2016.
 */
public class SwipeListViewFragment extends Fragment {

    public static SwipeListViewFragment newInstance() {
        SwipeListViewFragment fragment = new SwipeListViewFragment();
        return fragment;
    }

    private SwipeListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.swipelistview_fragment, container, false);
        listView = (SwipeListView) view.findViewById(R.id.swipeListView);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final ArrayList<String> listData = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            listData.add("Item: " + i);
        }
        listView.setAdapter(new MyAdapter(getActivity(), R.layout.swipelistview_item, listData));
    }
}
