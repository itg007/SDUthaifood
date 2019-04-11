package sdu.cs.sirichai.sduthaifood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Drive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drive);

        TextView textView8 = findViewById(R.id.textView8);
        TextView textView10 = findViewById(R.id.textView10);

        textView8.setText(getIntent().getStringExtra("drive"));
        textView10.setText(getIntent().getStringExtra("responsible"));

    }

    public void clickBack(View view) {
        finish();
    }//end clickBack
}//end Class
