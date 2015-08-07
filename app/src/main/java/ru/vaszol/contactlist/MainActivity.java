package ru.vaszol.contactlist;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import ru.vaszol.contactlist.adapter.ContactModelAdapter;
import ru.vaszol.contactlist.pojo.ContactModel;


public class MainActivity extends ActionBarActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= (ListView) findViewById(R.id.listView);

//        List<String> items = initData();
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1, items);
        ContactModelAdapter adapter =new ContactModelAdapter(this,initData());
        listView.setAdapter(adapter);
    }

    private List<ContactModel> initData(){
        List<ContactModel> list = new ArrayList<ContactModel>();
        list.add(new ContactModel(1,"Ivan","Ivanov"));
        list.add(new ContactModel(1,"Petr","Petrov"));
        list.add(new ContactModel(1,"Alex","Sidorov"));
        return list;

    }


}
