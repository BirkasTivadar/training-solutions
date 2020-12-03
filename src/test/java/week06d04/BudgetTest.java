package week06d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import week06d04.Budget;
import week06d04.Item;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BudgetTest {

    @Test
    void getItemsByMonthTest() {

        LocalDate dateCar = LocalDate.of(2020, 10, 12);
        LocalDate dateDesk = LocalDate.of(2020, 9, 23);
        LocalDate dateChair = LocalDate.of(2017, 5, 22);
        LocalDate dateTelevision = LocalDate.of(2019, 5, 25);
        LocalDate dateComputer = LocalDate.of(2017, 5, 22);

        LocalDate date = LocalDate.of(2017, 5, 22);

        Item car = new Item(5000, dateCar, "Car");
        Item desk = new Item(700, dateDesk, "Desk");
        Item chair = new Item(100, dateChair, "Chair");
        Item television = new Item(1000, dateTelevision, "TV");
        Item computer = new Item(2000, dateComputer, "Computer");
        Budget budget = new Budget(Arrays.asList(car, desk, chair, television, computer));
        assertEquals(2, budget.getItemsByMonth(date).size());

    }}