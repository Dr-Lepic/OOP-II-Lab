package Lab2;

public class FineCalculator {

    public static double calculateFine(Book book, int Overdue){
        if (Overdue == 0){
            return 0;
        }
        else if(Overdue < 4){
            double fine = book.getBaseFine() * Overdue;
            return fine - (fine * 0.2);
        }
        else if(Overdue <=10){
            return book.getBaseFine();
        }
        else if(Overdue <=20){
            return book.baseFine * 10 + book.additionalFine * (Overdue-10);
        }
        else if(Overdue <=30){
            return book.baseFine * 10 + book.additionalFine * (Overdue-10);
        }
        else {
            return 100;
        }
    }
}
