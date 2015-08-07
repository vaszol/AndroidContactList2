package ru.vaszol.contactlist.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.vaszol.contactlist.R;

/**
 * Created by vas on 07.08.2015.
 */
public class EditFragment extends Fragment {

    public final static String TAG="EditFragmentTag";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.edit_fragment,null);
    }


}
