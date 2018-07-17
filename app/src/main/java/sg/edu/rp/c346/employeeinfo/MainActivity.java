package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvPeople;
    ArrayList<PeopleItems> alPeopleList;
    CustomAdapter caPeople;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvPeople = findViewById(R.id.listViewPeople);

        alPeopleList = new ArrayList<>();

        PeopleItems people1 = new PeopleItems("John", "Software Technical Leader", "3400.0");
        PeopleItems people2 = new PeopleItems("May", "Programmer", "2200.0");
        alPeopleList.add(people1);
        alPeopleList.add(people2);

        caPeople = new CustomAdapter(this, R.layout.people_items, alPeopleList);

        lvPeople.setAdapter(caPeople);
    }
}
