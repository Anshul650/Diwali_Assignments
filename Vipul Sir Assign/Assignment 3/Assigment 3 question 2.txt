class DateDemo {
    int day;
    int month;
    int year;

    DateDemo() {
        day = 01;
        month = 01;
        year = 1970;
    }

    DateDemo(int day) {
        this.day = day;
        month = 01;
        year = 1970;

    }

    DateDemo(int day, int month) {
        this.day = day;
        this.month = month;
        year = 1970;

    }

    DateDemo(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    void prev_day() {

        if (day == 1) {
            day = 30;
        }

        System.out.printf("previous date is :%02d,%02d,%02d ", day - 1, month, year);
        System.out.println(" ");


    }

    void next_day() {

        int day_1 = 0;
        if (day == 30) {
            day_1 = 0;
        }
        System.out.printf("next date is :%02d,%02d,%02d ", day_1 + 1, month, year);
        System.out.println(" ");
    }

    void print_day() {
        if (day == 0) {
            day = 1;
        }
        System.out.printf("entered date is :%02d,%02d,%02d ", day, month, year);
        System.out.println(" ");
    }


    public static void main(String[] args) {

        DateDemo Date = new DateDemo(30, 03, 1999);
        Date.prev_day();
        Date.next_day();
        Date.print_day();

    }
}