package ru.vaszol.contactlist;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import ru.vaszol.contactlist.adapter.ContactModelAdapter;
import ru.vaszol.contactlist.fragment.EditFragment;
import ru.vaszol.contactlist.pojo.ContactModel;


public class MainActivity extends FragmentActivity {

    private ListView listView;
    private EditFragment editFragment;
    private android.support.v4.app.FragmentManager manager;
    private android.support.v4.app.FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= (ListView) findViewById(R.id.listView);
//        List<String> items = initData();
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1, items);
        ContactModelAdapter adapter =new ContactModelAdapter(this,initData());
        listView.setAdapter(adapter);

        manager = getSupportFragmentManager();
        editFragment=new EditFragment();
    }

    public void onClickFragment(View view){
        transaction = manager.beginTransaction();
        transaction.setCustomAnimations(R.anim.slide_in_up,R.anim.slide_in_down);
        switch (view.getId()){
            case R.id.add_Btn:
                if(manager.findFragmentByTag(EditFragment.TAG)==null) { //проверка "если фрагмент недобавлялся"
                    transaction.add(R.id.container,editFragment, EditFragment.TAG);
                }
                break;
            case R.id.remove_Btn:
                if(manager.findFragmentByTag(EditFragment.TAG)!=null) //проверка "если фрагмент недобавлялся"
                    transaction.remove(editFragment);
                break;
        }
    }


    private List<ContactModel> initData(){
        List<ContactModel> list = new ArrayList<ContactModel>();
        list.add(new ContactModel(1,"Ivan","Ivanov", "ivan@ivanov.ru"));
        list.add(new ContactModel(1,"Petr","Petrov","petr@petrov.com"));
        list.add(new ContactModel(1,"Alex","Sidorov","alex@sidorov.org"));
        return list;

    }


}
