import java.text.SimpleDateFormat;
import java.util.*;

class Main {
    public static void main (String [] args){
        getDay(); //вывести на консоль название дня недели
        getTuesday(); // вывести на консоль дату след вторника
    }
    public static void getDay (){
        SimpleDateFormat formatter = new SimpleDateFormat("d-M-yyyy");
        SimpleDateFormat nf = new SimpleDateFormat("EEEE");
        System.out.println("Введите дату в формате d-M-yyyy");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        try {
            Date date = formatter.parse(data);
            System.out.println(nf.format(date));
        }
        catch (Exception e) {
            System.out.println("неверно ввели дату");
        }
    }
    public static void getTuesday(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM yyyy");
        Calendar calendar = new GregorianCalendar();
        Date today = calendar.getTime();
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
        if (calendar.getTime().before(today))
        {
            calendar.add(Calendar.WEEK_OF_YEAR, 1);
        }
        System.out.println("Текущая дата " + dateFormat.format(today));
        System.out.println("Cледующий вторник :" + dateFormat.format(calendar.getTime()));
    }
}