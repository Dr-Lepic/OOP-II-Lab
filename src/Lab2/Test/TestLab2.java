package Lab2.Test;

import Lab2.ChildrenBook;
import Lab2.FictionBook;
import Lab2.FineCalculator;
import Lab2.NonFictionBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestLab2 {

    @Test
    public void getBasicRent() {
        FictionBook b1 = new FictionBook("OOP", "Mahbub");
        double basicRentExp = 6;
        assertEquals(basicRentExp, b1.getBasicRent());

    }

    @Test
    public void getBaseFine() {
        FictionBook b1 = new FictionBook("OOP", "Mahbub");
        double baseFineExp = 1;
        assertEquals(baseFineExp, b1.getBaseFine());
    }

    @Test
    public void getAdditionalFine() {
        NonFictionBook b1 = new NonFictionBook("OOP", "Mahbub");
        double additionalFineExp = 2.5;
        assertEquals(additionalFineExp, b1.getAdditionalFine());
    }
    @Test
    public void calculateFine_0_3() {
        ChildrenBook childrenBook = new ChildrenBook("ABC", "Mahbub");
        double fine = childrenBook.getBaseFine() * 2;
        double expectedFine = fine - (fine * 0.2);
        assertEquals(expectedFine, FineCalculator.calculateFine(childrenBook, 2));
    }
    @Test
    public void calculateFine_0_10() {
        FictionBook b1 = new FictionBook("OOP", "Mahbub");
        double fineExp = b1.getBaseFine();
        assertEquals(fineExp, FineCalculator.calculateFine(b1, 5));
    }

    @Test
    public void calculateFine_11_20() {
        NonFictionBook nonFictionBook = new NonFictionBook("OOP", "Mahbub");
        double fineExp = nonFictionBook.getBaseFine() * 10 + nonFictionBook.getAdditionalFine() * 5;
        assertEquals(fineExp, FineCalculator.calculateFine(nonFictionBook, 15));
    }

    @Test
    public void calculateFine_21_30() {
        ChildrenBook childrenBook = new ChildrenBook("ABC", "Mahbub");
        double fineExp = childrenBook.getBaseFine() * 10 + childrenBook.getAdditionalFine() * 17;
        assertEquals(fineExp, FineCalculator.calculateFine(childrenBook, 27));
    }

    @Test
    public void calculateFine_31_40() {
        FictionBook fictionBook = new FictionBook("Math", "Mahbub");
        double fineExp = 100;
        assertEquals(fineExp, FineCalculator.calculateFine(fictionBook, 40));
    }




}