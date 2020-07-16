package sg.edu.rpc346.id19016011.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.CustomDescription;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvToDo;
    ArrayList<ToDoItem> alToDo;
    //ArrayAdapter<AndroidVersion> alAndroidVersions;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.lvToDoList);
        alToDo = new ArrayList<ToDoItem>();

        alToDo.add(new ToDoItem("Go for movie", Calendar.getInstance()));
        alToDo.add(new ToDoItem("Go for haircut", Calendar.getInstance()));


        //aaAndroidVersion = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alAndroidVersions);
        adapter = new CustomAdapter(this, R.layout.row, alToDo);

        lvToDo.setAdapter(adapter);
    }
}
