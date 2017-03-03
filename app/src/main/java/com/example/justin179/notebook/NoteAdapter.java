package com.example.justin179.notebook;

import android.content.Context;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Justin179 on 2017/3/3.
 */

public class NoteAdapter extends ArrayAdapter<Note>{

    public NoteAdapter(@NonNull Context context, ArrayList<Note> notes) {
        super(context, 0, notes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // get the data item for this position
        Note note = getItem(position);

        // check if an existing view is being reused, otherwise inflate a new view from custom row layout
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_row, parent, false);
        }

        // Grab references of views so we can populate them with specific note row data
        TextView noteTitle = (TextView) convertView.findViewById(R.id.listItemNoteTitle);
        TextView noteText = (TextView) convertView.findViewById(R.id.listItemNoteBody);
        ImageView noteIcon = (ImageView) convertView.findViewById(R.id.listItemNoteImg);

        // fill each new referenced view with data associated with note it's referencing
        noteTitle.setText(note.getTitle());
        noteText.setText(note.getMessage());
        noteIcon.setImageResource(note.getAssociatedDrawable());


        // now that we modified the view to display appropriate data, return it so it will displayed
        return convertView;
    }
}
