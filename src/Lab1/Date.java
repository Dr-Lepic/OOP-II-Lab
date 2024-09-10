package Lab1;

public class Date {
    public int year;
    public int month;
    public int day;

    public Date(String date) {
        String[] dateParts = date.split("-");
        year = Integer.parseInt(dateParts[0]);
        month = Integer.parseInt(dateParts[1]);
        day = Integer.parseInt(dateParts[2]);
    }
}
