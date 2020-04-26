package com.rk.zz_fragments__jvm;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentDua extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View Tampil = inflater.inflate(R.layout.fragmentdua, container, false);
        TextView TV_1_FragmentDua_IDJAVA = Tampil.findViewById(R.id.TV_1_FragmentDua_IDXML);
        TV_1_FragmentDua_IDJAVA.setText("Fragment Dua");

        return Tampil;
    }
}
