package com.menu.circulo.menucircle;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

import java.security.cert.PolicyQualifierInfo;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    String arrayName[] = {"Menu 1", "Menu 2", "Menu 3", "Menu 4",
                          "Menu 5", "Menu 6","Menu 7","Menu 8",
                          "Menu 9","Menu 10","Menu 11","Menu 12"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleMenu circleMenu = (CircleMenu) findViewById(R.id.circle_menu);

        circleMenu.setMainMenu(Color.parseColor("#cdcdcd"),R.drawable.ic_blue, R.drawable.ic_laranja)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.ic_red)
                .addSubMenu(Color.parseColor("#6d4c41"),R.drawable.ic_verde)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.ic_yello)
                .addSubMenu(Color.parseColor("#03a9f4"),R.drawable.ic_verde_clro)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.ic_red)
                .addSubMenu(Color.parseColor("#6d4c41"),R.drawable.ic_verde)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.ic_yello)
                .addSubMenu(Color.parseColor("#03a9f4"),R.drawable.ic_verde_clro)

                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {

                        Toast.makeText(MainActivity.this, "Voce selecionou " + arrayName[index], Toast.LENGTH_SHORT).show();

                    }
                });

        CircleMenu circleMenu2 = (CircleMenu) findViewById(R.id.circle_menu2);

        circleMenu2.setMainMenu(Color.parseColor("#cdcdcd"),R.drawable.ic_blue, R.drawable.ic_laranja)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.ic_red)
                .addSubMenu(Color.parseColor("#6d4c41"),R.drawable.ic_verde)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.ic_yello)
                .addSubMenu(Color.parseColor("#03a9f4"),R.drawable.ic_verde_clro)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.ic_red)
                .addSubMenu(Color.parseColor("#6d4c41"),R.drawable.ic_verde)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.ic_yello)
                .addSubMenu(Color.parseColor("#03a9f4"),R.drawable.ic_verde_clro)

                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {

                        Toast.makeText(MainActivity.this, "Voce selecionou " + arrayName[index], Toast.LENGTH_SHORT).show();

                    }
                });

    }
}
