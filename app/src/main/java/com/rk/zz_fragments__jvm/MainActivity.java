package com.rk.zz_fragments__jvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Fragment Penyatu = null;
    Button B_1_ActivityMain_IDJAVA, B_2_ActivityMain_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B_1_ActivityMain_IDJAVA = findViewById(R.id.B_1_ActivityMain_IDXML);
        B_2_ActivityMain_IDJAVA = findViewById(R.id.B_2_ActivityMain_IDXML);

    }

    public void Button_MainActivity_KetikaDipijit(View Tampil) {
        switch (Tampil.getId()) {
            case R.id.B_1_ActivityMain_IDXML:
                Penyatu = new FragmentSatu();
                muatFragment(Penyatu);
                break;
            case R.id.B_2_ActivityMain_IDXML:
                Penyatu = new FragmentDua();
                muatFragment(Penyatu);
                break;
        }
    }

    private void muatFragment(Fragment Penyatu) {
        FragmentManager ManagerPenyatu = getSupportFragmentManager();
        FragmentTransaction TransaksiPenyatu = ManagerPenyatu.beginTransaction();
        TransaksiPenyatu.replace(R.id.Fragment_IDXML, Penyatu);
        TransaksiPenyatu.commit();
    }
}
