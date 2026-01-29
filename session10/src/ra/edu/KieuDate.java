package ra.edu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KieuDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("KieuDate: "+date);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            date = sdf.parse(sdf.format(date));
        }catch(ParseException e){
            throw  new RuntimeException(e);
        }
        System.out.println("KieuDate: "+date);
    }
}
