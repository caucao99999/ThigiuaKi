package com.example.luuanhkiet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends ArrayAdapter {
    private Context mContext;
    private int mResources;
    private List<ContactModel> mList;

    public ContactAdapter(Context context, int resource, List<ContactModel> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResources = resource;
        this.mList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if(viewHolder == null){
            convertView = LayoutInflater.from(mContext).inflate(mResources,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.textViewTMH = convertView.findViewById(R.id.contact_tv_TMH);
            viewHolder.textViewMMH = convertView.findViewById(R.id.contact_tv_MMH);
            viewHolder.textViewSTC = convertView.findViewById(R.id.contact_tv_STC);
        }
        else {
            viewHolder = (ViewHolder)convertView.getTag();
        }
        final ContactModel model = mList.get(position);
        viewHolder.textViewTMH.setText("Tên môn học : "+String.valueOf(model.getTMH()));
        viewHolder.textViewMMH.setText("Mã môn học : "+String.valueOf(model.getMMH()));
        viewHolder.textViewSTC.setText("Số tính chỉ : "+ String.valueOf(model.getSTC()));
//        viewHolder.listView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(mContext, ContactDetailActivity.class);
//                intent.putExtra("ContactModel",model);
//                mContext.startActivity(intent);
//            }
//        });

        return convertView;
    }


    public class ViewHolder{
        TextView textViewTMH;
        TextView textViewMMH;
        TextView textViewSTC;
    }
}