package bg.tu_varna.sit.lab5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AnimalAdapter extends ArrayAdapter<Animal>  {

    ArrayList<Animal> AnimalList;

    public AnimalAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Animal> objects) {
        super(context, resource, objects);
        AnimalList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.layout, null);

        TextView textView = v.findViewById(R.id.textView);
        ImageView imageView = v.findViewById(R.id.imageView);

        textView.setText(AnimalList.get(position).getAnimalName());
        imageView.setImageResource(AnimalList.get(position).getAnimalImage());

        return v;
    }
}
