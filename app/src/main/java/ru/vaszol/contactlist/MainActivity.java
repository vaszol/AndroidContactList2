package ru.vaszol.contactlist;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= (ListView) findViewById(R.id.listView);

        List<String> items = initData();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
    }

    private List<String> initData(){
        List<String> list = new ArrayList<String>();
        list.add("Ivanov");
        list.add("Petrov");
        list.add("Sidorov");
        return list;

    }


}
