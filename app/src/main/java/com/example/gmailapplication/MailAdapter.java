package com.example.gmailapplication;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MailAdapter extends BaseAdapter {
    List<UserInformation> userInformationLists;
    private ArrayList<String> listColor=new ArrayList<String>();
    public MailAdapter(List<UserInformation> userInformationLists) {
        this.userInformationLists = userInformationLists;
        listColor.add("#FF1493");
        listColor.add("#FFA500");
        listColor.add("#006400");
        listColor.add("#00FFFF");
        listColor.add("#FFF8DC");
        listColor.add("#800000");
        listColor.add("#DCDCDC");
        listColor.add("#2F4F4F");
        listColor.add("#696969");
        listColor.add("#FF0000");
    }

    @Override
    public int getCount() {
        return userInformationLists.size();
    }

    @Override
    public Object getItem(int position) {
        return userInformationLists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            convertView= LayoutInflater.from(parent.getContext()).inflate(R.layout.mail_information,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.avt=convertView.findViewById(R.id.avt);
            viewHolder.content=convertView.findViewById(R.id.content_mail);
            viewHolder.time=convertView.findViewById(R.id.time_mail);
            viewHolder.title=convertView.findViewById(R.id.title_mail);
            viewHolder.user_name=convertView.findViewById(R.id.user_name);
            viewHolder.favorite=convertView.findViewById(R.id.icon_favorite);
            convertView.setTag(viewHolder);
        }else
        {
            viewHolder=(ViewHolder) convertView.getTag();
        }
        final UserInformation userInformation=userInformationLists.get(position);
        viewHolder.avt.setText(userInformation.getUserName().substring(0,1));
        if(userInformation.getIsFavorite()){
            viewHolder.favorite.setImageResource(R.drawable.ic_star_favorite_true);
        }else{
            viewHolder.favorite.setImageResource(R.drawable.ic_star_favorite_false);
        }
        viewHolder.favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isFavorite=userInformation.getIsFavorite();
                userInformation.setFavorite(!isFavorite);
                notifyDataSetChanged();
            }
        });
        viewHolder.user_name.setText(userInformation.getUserName());
        viewHolder.title.setText(userInformation.getTitle());
        viewHolder.content.setText(userInformation.getContent());
        viewHolder.time.setText(userInformation.getTime().toString());
        Random indexOfColor=new Random();
        if(!userInformation.isAvt()){
            viewHolder.avt.getBackground().setColorFilter(Color.parseColor(listColor.get(indexOfColor.nextInt(10))), PorterDuff.Mode.SRC_ATOP);
            userInformation.setAvt(true);
        }
        return convertView;
    }
}
class ViewHolder{
    TextView avt;
    TextView user_name;
    TextView title;
    TextView content;
    TextView time;
    ImageView favorite;
}
