package com.cookandroid.hey_bob_ver7.ui.write;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.cookandroid.hey_bob_ver7.R;

public class WriteFragment extends Fragment {

    private WriteViewModel writeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        writeViewModel =
                ViewModelProviders.of(this).get(WriteViewModel.class);
        View root = inflater.inflate(R.layout.fragment_message, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications);
        writeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}