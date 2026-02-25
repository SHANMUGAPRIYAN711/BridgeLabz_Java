package methods.level3;
class CalendarProgram {

    static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }

    public static void main(String[] args) {
        int month = 2, year = 2024;
        int days;

        switch (month) {
            case 2: days = isLeap(year) ? 29 : 28; break;
            case 4: case 6: case 9: case 11: days = 30; break;
            default: days = 31;
        }

        System.out.println("Days: " + days);
    }
}
