package com.example.androidmaterialdesign.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.example.androidmaterialdesign.R;

import java.util.ArrayList;

public class MessageFragment extends Fragment {
    ImageButton floatingActionButton;
    ListView homeListView;
    ArrayList<String> newArrayList;

    public MessageFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_message, container, false);

        floatingActionButton = (ImageButton) rootView.findViewById(R.id.imageButton);
        homeListView = (ListView) rootView.findViewById(R.id.homeListView);
        newArrayList = new ArrayList<>();
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent innerActivity = new Intent(getContext(),InnerActivity.class);
                startActivity(innerActivity);
                Toast.makeText(getContext(), "Clicked on Floating Action Button.", Toast.LENGTH_LONG).show();
            }
        });
        for (int i = 0; i <= 15; i++) {
            newArrayList.add("This is Message Fragment.........!!!!!!!");
        }
        ArrayAdapter adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, newArrayList);
        homeListView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return rootView;
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
