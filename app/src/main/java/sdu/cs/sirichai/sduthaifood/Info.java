package sdu.cs.sirichai.sduthaifood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    TextView approach1,approach2,approach3;
    String dv, dv1, dv2, dv3, rp, rp1, rp2, rp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        //ผูกตัวแปรบน java กับ xml
        approach1 = findViewById(R.id.tv1);
        approach2 = findViewById(R.id.tv2);
        approach3 = findViewById(R.id.tv3);

        //รับค่าจาก Intent มาแสดงบน xml
        approach1.setText(getIntent().getStringExtra("roach1"));
        approach2.setText(getIntent().getStringExtra("roach2"));
        approach3.setText(getIntent().getStringExtra("roach3"));

        //dv = getIntent().getStringExtra("Drive");
        dv1 = getIntent().getStringExtra("Drive1");
        dv2 = getIntent().getStringExtra("Drive2");
        dv3 = getIntent().getStringExtra("Drive3");
        //rp = getIntent().getStringExtra("responsible");
        rp1 = getIntent().getStringExtra("responsible1");
        rp2 = getIntent().getStringExtra("responsible2");
        rp3 = getIntent().getStringExtra("responsible3");
    }//end onCreate

    public void clickBack(View view) {
        finish();
    }//end clickBack

    public void click1(View view) {
        Intent intent = new Intent(Info.this, Drive.class);
        intent.putExtra("Drive",dv1);
        intent.putExtra("responsible", rp1);
        startActivity(intent);
    }

    public void click2(View view) {
        Intent intent = new Intent(Info.this, Drive.class);
        intent.putExtra("Drive",dv2);
        intent.putExtra("responsible", rp2);
        startActivity(intent);
    }

    public void click3(View view) {
        Intent intent = new Intent(Info.this, Drive.class);
        intent.putExtra("Drive",dv3);
        intent.putExtra("responsible", rp3);
        startActivity(intent);
    }
}//end Class
