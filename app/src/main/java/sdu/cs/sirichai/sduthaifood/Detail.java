package sdu.cs.sirichai.sduthaifood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Detail extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    String tv1, tv2, tv3, dv, dv1, dv2, dv3, rp, rp1, rp2, rp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //ผูกตัวแปรบน java กับ xml
        TextView detailTextView = findViewById(R.id.txtDetail);
        ImageView logoImageView = findViewById(R.id.imvLogo);
        Button button = findViewById(R.id.btInfo);

        //รับค่าจาก Intent มาแสดงบน xml
        detailTextView.setText(getIntent().getStringExtra("Detail"));
        logoImageView.setImageResource(getIntent().getIntExtra("Logo",R.drawable.logo_01));

        //รับค่าจาก Intent แล้วแปลค่าเป็น String เพื่อไปค่าไปหน้า info
        tv1 = getIntent().getStringExtra("Approach1");
        tv2 = getIntent().getStringExtra("Approach2");
        tv3 = getIntent().getStringExtra("Approach3");
        //dv = getIntent().getStringExtra("Drive");
        dv1 = getIntent().getStringExtra("Drive1");
        dv2 = getIntent().getStringExtra("Drive2");
        dv3 = getIntent().getStringExtra("Drive3");
        //rp = getIntent().getStringExtra("responsible");
        rp1 = getIntent().getStringExtra("responsible1");
        rp2 = getIntent().getStringExtra("responsible2");
        rp3 = getIntent().getStringExtra("responsible3");


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //ส่งข้อมูลไปหน้า info
                Intent detaiIntent = new Intent(Detail.this, Info.class);
                //ส่งข้อมูล
                detaiIntent.putExtra("roach1", tv1);
                detaiIntent.putExtra("roach2", tv2);
                detaiIntent.putExtra("roach3", tv3);
                //detaiIntent.putExtra("Drive", dv);
                detaiIntent.putExtra("Drive1", dv1);
                detaiIntent.putExtra("Drive2", dv2);
                detaiIntent.putExtra("Drive3", dv3);
                //detaiIntent.putExtra("responsible", rp);
                detaiIntent.putExtra("responsible1", rp1);
                detaiIntent.putExtra("responsible2", rp2);
                detaiIntent.putExtra("responsible3", rp3);
                //เริ่มส่งข้อมูล
                startActivity(detaiIntent);
            }//end onCreate
        });

    }//end onCreate

    public void clickBack(View view) {
        finish();
    }//end clickBack
}//end Class
