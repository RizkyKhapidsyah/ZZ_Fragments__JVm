package com.rk.zz_fragments__jvm;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentSatu extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View Tampil = inflater.inflate(R.layout.fragmentsatu, container, false);
        TextView TV_1_FragmentSatu_IDJAVA = Tampil.findViewById(R.id.TV_1_FragmentSatu_IDXML);
        TV_1_FragmentSatu_IDJAVA.setText("Fragment Satu");

        return Tampil;
    }
}
