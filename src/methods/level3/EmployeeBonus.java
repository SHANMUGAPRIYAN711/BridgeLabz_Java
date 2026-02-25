package methods.level3;

class EmployeeBonus {

    static double calculateBonus(double salary, int years) {
        return years > 5 ? salary * 0.05 : salary * 0.02;
    }

    public static void main(String[] args) {

        double[][] emp = {
                {30000, 6},
                {25000, 3},
                {40000, 8}
        };

        double totalBonus = 0, totalOld = 0, totalNew = 0;

        for (int i = 0; i < emp.length; i++) {
            double salary = emp[i][0];
            int years = (int) emp[i][1];

            double bonus = calculateBonus(salary, years);

            totalOld += salary;
            totalBonus += bonus;
            totalNew += salary + bonus;
        }

        System.out.println("Total Old Salary: " + totalOld);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNew);
    }
}
