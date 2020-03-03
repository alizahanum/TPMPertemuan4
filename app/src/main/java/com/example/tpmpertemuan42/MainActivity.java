package com.example.tpmpertemuan42;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private BottomNavigationView bnvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnvMain = findViewById(R.id.bnvMain);
        bnvMain.setOnNavigationItemSelectedListener(this);

        setLayout(new OrangFragment());
    }

    private void setLayout(Fragment fragment){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.idframe, fragment)
                .commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemOrang:
            setLayout (new OrangFragment());
            return true;

            case R.id.itemTambah:
            setLayout (new TambahFragment());
            return true;
        }
        return false;
    }
}
