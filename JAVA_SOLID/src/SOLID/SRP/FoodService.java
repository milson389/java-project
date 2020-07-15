package SOLID.SRP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FoodService {
    int id;
    String name;
    String date;

    public FoodService(int id, String name, String date){
        this.id = id;
        this.name = name;
        this.date = date;
    }

    void addToStore(){
        if (!FoodExpiry.isExpired(date)){
            System.out.println("Belom kadaluarsa");
        }
    }
}


