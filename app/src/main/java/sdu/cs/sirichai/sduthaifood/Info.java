package sdu.cs.sirichai.sduthaifood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    TextView approach1,approach2,approach3;
    String getNameString;

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
    }//end onCreate

    public void clickBack(View view) {
        finish();
    }//end clickBack
}//end Class
