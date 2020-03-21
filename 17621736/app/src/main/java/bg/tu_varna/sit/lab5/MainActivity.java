package bg.tu_varna.sit.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Animal> animalAdapter = new ArrayList<Animal>();


        animalAdapter.add(new Animal("Lion", R.drawable.lion));
        animalAdapter.add(new Animal("Wolf", R.drawable.wolf));
        animalAdapter.add(new Animal("Tiger", R.drawable.tiger));

        AnimalAdapter myAdapter = new AnimalAdapter(this,R.layout.layout, animalAdapter);

        ListView listView = findViewById(R.id.ListView);
        listView.setAdapter(myAdapter);

    }
}



