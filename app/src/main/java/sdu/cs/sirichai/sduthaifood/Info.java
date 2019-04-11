package sdu.cs.sirichai.sduthaifood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Info extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TextView approach1Strings = findViewById(R.id.tv1);
        TextView approach2Strings = findViewById(R.id.tv2);
        TextView approach3Strings = findViewById(R.id.tv3);


        //รับค่าจาก Intent มาแสดงบน xml
        approach1Strings.setText(getIntent().getStringExtra("Approach1"));
        approach2Strings.setText(getIntent().getStringExtra("Approach2"));
        approach3Strings.setText(getIntent().getStringExtra("Approach3"));
    }

    public void clickBack(View view) {
        finish();
    }//end clickBack

    //ผูกตัวแปรบน java กับ xml

}//end Class
