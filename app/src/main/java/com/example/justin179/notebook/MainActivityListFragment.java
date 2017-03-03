package com.example.justin179.notebook;


import android.app.ListFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainActivityListFragment extends ListFragment {


    private ArrayList<Note> notes;
    private NoteAdapter noteAdapter;

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        /*
        // String Array to represent rows
        String[] values = new String[] {"A","B","C","D","E"};

        // put context, format(row layout), content(String Array) into adapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,values);

        // put adapter into the list
        setListAdapter(arrayAdapter);
        */

        notes = new ArrayList<Note>();
        notes.add(new Note("this is the new note title","this is the body of our note", Note.Category.PERSONAL));
        notes.add(new Note("this is the new note title","this is the body of our note", Note.Category.FINANCE));
        notes.add(new Note("this is the new note title","this is the body of our note", Note.Category.QUOTE));
        notes.add(new Note("this is the new note title","this is the body of our note", Note.Category.TECHNICAL));
        notes.add(new Note("this is the new note title","this is the body of our note", Note.Category.QUOTE));
        notes.add(new Note("this is the new note title","this is the body of our note", Note.Category.FINANCE));
        notes.add(new Note("this is the new note title","this is the body of our note", Note.Category.PERSONAL));
        notes.add(new Note("this is the new note title","this is the body of our note", Note.Category.TECHNICAL));




        noteAdapter = new NoteAdapter(getActivity(), notes);

        setListAdapter(noteAdapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
    }


}
