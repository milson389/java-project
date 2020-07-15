package SOLID.SRP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FoodExpiry {
    // Single Responsibility Principle (SRP) = pemisahan tanggung jawab sehingga saat dikembangkan tidak akan menimbulkan masalah
    public static boolean isExpired(String date){
        Date foodDate = new Date();
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH);
        try{
            foodDate = simpleDateFormat.parse(date);
        }catch (ParseException e){
            e.printStackTrace();
        }

        return foodDate.getTime() >= now.getTime();
    }
}
