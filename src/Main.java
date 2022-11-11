import java.time.LocalDate;

public class Main {

    //region Homework1

    public static void task1() {
        var salary = 15000;
        var total = 0;
        var i = 1;
        while (total < 2_459_000) {
            total += salary;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
            i++;
        }
    }

    public static void task2() {
        var i = 0;
        while (i < 10)
            System.out.print(" " + ++i);

        System.out.println("");

        for(;i >= 1; i--)
            System.out.print(" " + i);
    }

    public static void task3() {
        var countryPopulation = 12_000_000;
        var mortality = 8;
        var birthRate = 17;
        var naturalGrowthRate = (((birthRate * countryPopulation / 1000.0) - (mortality * countryPopulation / 1000.0)) / (double)countryPopulation) * 1000;

        for(int i = 1; i<= 10; i++){
            System.out.println("Год " + i + ", численность населения составляет " + countryPopulation);
            countryPopulation += countryPopulation * (naturalGrowthRate / 1000.0);
        }
    }

    //endregion

    //region Homework2

    public static void task4() {
        var depositAmount = 15000;
        var total = 0;
        var percent = 0.07;
        int i = 0;

        while(total < 12_000_00){
            System.out.println("Сумма вкалада " + total + " за " + i++ + " месяц");
            total +=  depositAmount + (total * percent);
        }
    }

    public static void task5() {
        var depositAmount = 15000;
        var total = 0;
        var percent = 0.07;
        int i = 0;

        while(total < 12_000_00){
            if(i % 6 == 0 && i != 0)
                System.out.println("Сумма вкалада " + total + " за " + i + " месяц");
            i++;
            total +=  depositAmount + (total * percent);
        }
    }

    public static void task6() {
        var depositAmount = 15000;
        var total = 0;
        var percent = 0.07;
        var quantityYear = 9;
        int i = 0;

        for(;i < 12 * quantityYear; i++){
            if(i % 6 == 0 && i != 0)
                System.out.println("Сумма вкалада " + total + " за " + i + " месяц");
            total +=  depositAmount + (total * percent);
        }
    }

    public static void task7() {
        //Инициализирована переменная, хранящая в себе дату
        LocalDate startDate = LocalDate.now();
        var endDate = startDate.plusMonths(1);
        System.out.println(endDate.getDayOfWeek());

        //Создан цикл
        while(!startDate.equals(endDate)) {
            if (startDate.getDayOfWeek().toString().equals("FRIDAY"))
                System.out.println("Сегодня пятница, " + startDate.getDayOfMonth() + "-е число. Необходимо подготовить отчет.");
            startDate = startDate.plusDays(1);
        }
    }

    //endregion

    //Homework3

    public static void task8() {
        LocalDate startDate = LocalDate.now().minusYears(200);
        LocalDate endDate = startDate.plusYears(300);

        int i = startDate.getYear();
        do{
            if(i % 79 == 0)
                System.out.println(i);
            i++;
        }while(i < endDate.getYear());
    }

    public static void task9(){
        for(int i = 1; i <= 10; i++)
            System.out.println("2 * " + i + " = " + i * 2);
    }

    //endregion


    public static void main(String[] args) {
        task9();
    }
}