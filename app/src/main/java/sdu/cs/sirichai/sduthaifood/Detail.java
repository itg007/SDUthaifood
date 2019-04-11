package sdu.cs.sirichai.sduthaifood;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Detail extends AppCompatActivity {
    String[] approach1Strings,approach2Strings,approach3Strings, driveStrings;

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

        approach1Strings = getResources().getStringArray(R.array.approach1);
        approach2Strings = getResources().getStringArray(R.array.approach2);
        approach3Strings = getResources().getStringArray(R.array.approach3);
        driveStrings = getResources().getStringArray(R.array.drive);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Detail.this, Info.class);
                startActivity(intent);
            }
        });


    }

    public void clickBack(View view) {
        finish();
    }//end clickBack
}//end Class
