package sdu.cs.sirichai.sduthaifood;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //ผูกตัวแปรบน java กับ xml
        TextView detailTextView = findViewById(R.id.txtDetail);
        ImageView logoImageView = findViewById(R.id.imvLogo);

        //รับค่าจาก Intent มาแสดงบน xml
        detailTextView.setText(getIntent().getStringExtra("Detail"));
        //logoImageView.setImageResource(getIntent().getExtras("logo",R.drawable.logo_01));

    }
}
