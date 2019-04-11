package sdu.cs.sirichai.sduthaifood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class MyAdapter extends BaseAdapter {
    Context context;
    int[] ints;

    public MyAdapter(Context context, int[] ints) {
        this.context = context;
        this.ints = ints;
    }

    @Override
    public int getCount() {
        return ints.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview,viewGroup,false);

        //ผูกตัวแปรบน JAVA กับ xml
        ImageView iconImageView = view1.findViewById(R.id.imvIcon);

        //Show view  นำข้อมูลไปแสดงผลบนแอป
        iconImageView.setImageResource(ints[i]);

        return view1;
    }
}
