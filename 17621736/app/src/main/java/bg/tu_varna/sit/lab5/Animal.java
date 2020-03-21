package bg.tu_varna.sit.lab5;

import android.widget.ImageView;

public class Animal {

    private String AnimalName;
    private int AnimalImage;

    public Animal(String AnimalName, int AnimalImage) {
        this.AnimalName=AnimalName;
        this.AnimalImage=AnimalImage;
    }


    public String getAnimalName() { return AnimalName; }

    public int getAnimalImage() {
        return AnimalImage;
    }
}
