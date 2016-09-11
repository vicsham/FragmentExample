package com.example.vic.fragmentexample;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Fragment1.OnSelectedButtonListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onButtonSelected(int buttonIndex) {
// подключаем FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Получаем ссылку на второй фрагмент по ID
        Fragment2 fragment2 = (Fragment2) fragmentManager
                .findFragmentById(R.id.fragment2);

        // Выводим нужную информацию
        if (fragment2 != null)
            fragment2.setDescription(buttonIndex);
    }
}
