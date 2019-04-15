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
    String[] detailStrings ,approach1Strings,approach2Strings,approach3Strings, driveStrings, responsibleStrings;
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
        driveStrings = getResources().getStringArray(R.array.drive);
        responsibleStrings = getResources().getStringArray(R.array.responsible);

        //Create ListView
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, ints);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                //ส่งข้อมูลไปหน้า Detail
                Intent detaiIntent = new Intent(MainActivity.this, Detail.class);
                //ส่งข้อมูล
                detaiIntent.putExtra("Logo", ints[i]);
                detaiIntent.putExtra("Detail",detailStrings[i]);
                detaiIntent.putExtra("Approach1",approach1Strings[i]);
                detaiIntent.putExtra("Approach2",approach2Strings[i]);
                detaiIntent.putExtra("Approach3",approach3Strings[i]);
                //เริ่มส่งข้อมูล
                startActivity(detaiIntent);
            }
        });


    }//end onCreate
}//end class
