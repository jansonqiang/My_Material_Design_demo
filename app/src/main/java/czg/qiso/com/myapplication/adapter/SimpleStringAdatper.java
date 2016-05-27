package czg.qiso.com.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import czg.qiso.com.myapplication.R;

/**
 * Created by qiang on 16/5/27.
 */
public class SimpleStringAdatper extends BaseAdapter {

    List<String> dataList ;

    public SimpleStringAdatper(List<String> dataList) {
        this.dataList = dataList;
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        ViewHolder holder;
        if(convertView==null){
            convertView =   LayoutInflater.from(parent.getContext()).inflate(R.layout.item_text,parent,false);
            holder = new ViewHolder();
            holder.tv = (TextView) convertView.findViewById(R.id.tv);

            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tv.setText(dataList.get(position));

        return convertView;
    }

    public  static class ViewHolder{

        TextView tv;

    }

}
