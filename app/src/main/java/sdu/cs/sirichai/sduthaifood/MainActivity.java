package sdu.cs.sirichai.sduthaifood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    int[] ints = new int[]{R.drawable.logo_01, R.drawable.logo_02, R.drawable.logo_03,
            R.drawable.logo_04, R.drawable.logo_05, R.drawable.logo_06, R.drawable.logo_07,
            R.drawable.logo_08, R.drawable.logo_09,};
    String[] detailStrings ,approach1Strings,approach2Strings,approach3Strings, driveStrings,
            drive1Strings, drive2Strings, drive3Strings,responsibleStrings,responsible1Strings,
            responsible2Strings, responsible3Strings;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.livLogo);

        //ดึงค่าจาก my_content มาแสดงผมบนหน้า xml
        detailStrings = getResources().getStringArray(R.array.detail);
        approach1Strings = getResources().getStringArray(R.array.approach1);
        approach2Strings = getResources().getStringArray(R.array.approach2);
        approach3Strings = getResources().getStringArray(R.array.approach3);
        //driveStrings = getResources().getStringArray(R.array.drive);
        drive1Strings = getResources().getStringArray(R.array.drive1);
        drive2Strings = getResources().getStringArray(R.array.drive2);
        drive3Strings = getResources().getStringArray(R.array.drive3);
        //responsibleStrings = getResources().getStringArray(R.array.responsible);
        responsible1Strings = getResources().getStringArray(R.array.responsible1);
        responsible2Strings = getResources().getStringArray(R.array.responsible2);
        responsible3Strings = getResources().getStringArray(R.array.responsible3);

        //Create ListView
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, ints);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                //ส่งข้อมูลไปหน้า Detail
                Intent Intent = new Intent(MainActivity.this, Detail.class);
                //ส่งข้อมูล
                Intent.putExtra("Logo", ints[i]);
                Intent.putExtra("Detail", detailStrings[i]);
                Intent.putExtra("Approach1", approach1Strings[i]);
                Intent.putExtra("Approach2", approach2Strings[i]);
                Intent.putExtra("Approach3", approach3Strings[i]);
                //Intent.putExtra("Drive", driveStrings[i]);
                Intent.putExtra("Drive1", drive1Strings[i]);
                Intent.putExtra("Drive2", drive2Strings[i]);
                Intent.putExtra("Drive3", drive3Strings[i]);
                //Intent.putExtra("responsible", responsibleStrings[i]);
                Intent.putExtra("responsible1", responsible1Strings[i]);
                Intent.putExtra("responsible2", responsible2Strings[i]);
                Intent.putExtra("responsible3", responsible3Strings[i]);
                //เริ่มส่งข้อมูล
                startActivity(Intent);
            }
        });

    }//end onCreate

    public void clickAbout(View view) {
        Intent intent = new Intent(MainActivity.this,AboutApp.class);
        startActivity(intent);
    }
}//end class
