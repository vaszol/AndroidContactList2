package ru.vaszol.contactlist.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ru.vaszol.contactlist.R;
import ru.vaszol.contactlist.pojo.ContactModel;

/**
 * Created by vas on 07.08.2015.
 */
public class ContactModelAdapter extends BaseAdapter {

    private List<ContactModel> list;
    private LayoutInflater layoutInflater;

    public ContactModelAdapter(Context context,List<ContactModel> list) {
        this.list = list;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null){
            view=layoutInflater.inflate(R.layout.item_layout,parent,false);
        }
        ContactModel contactModel = getContactModel(position);
        TextView name= (TextView) view.findViewById(R.id.textView);
        TextView mail = (TextView) view.findViewById(R.id.textMailView);
        ImageView avatar = (ImageView) view.findViewById(R.id.imageView);
        name.setText(contactModel.getName()+" "+contactModel.getLastName());
        mail.setText(contactModel.getMail().toLowerCase());
//        avatar.setImageURI(Uri.parse(getGravatar(contactModel.getMail())));
        avatar.setImageResource(R.mipmap.ic_launcher);
        return view;
    }

    private ContactModel getContactModel(int position){
        return (ContactModel) getItem(position);
    }


}
