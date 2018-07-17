package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 17010265 on 07/17/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_content;
    int layout_id;
    ArrayList<PeopleItems> peopleList;

    //TODO
    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<PeopleItems> objects) {
        super(context, resource, objects);
        parent_content = context;
        layout_id = resource;
        peopleList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_content.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvPeople = rowView.findViewById(R.id.textViewPeople);
        TextView tvPosition = rowView.findViewById(R.id.textViewPosition);
        TextView tvSalary = rowView.findViewById(R.id.textViewSalary);
        PeopleItems currentItem = peopleList.get(position);
        String people = currentItem.getPeople();
        String position1 = currentItem.getPosition();
        String salary = currentItem.getSalary();
        tvPeople.setText(people);
        tvPosition.setText(position1);
        tvSalary.setText(salary);
        return rowView;
    }
}
