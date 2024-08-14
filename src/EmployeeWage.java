public class EmployeeWage {

    public static void main(String[] args) {

        // Welcome to Employee Wage Computation
        System.out.println("Welcome to Employee Wage Computation Program");

        // Constants
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;

        // Declaration
        int empHrs,empWage;

        // Computation
        double empCheck = Math.floor(Math.random() * 10) % 2;

        // Condition
        if(empCheck == IS_PART_TIME) {
            System.out.println("Employee is working Part-Time");
            empHrs = 4;
        }
        else if(empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present");
            empHrs = 8;
        }
        else {
            System.out.println("Employee is Absent");
            empHrs = 0;
        }

        // Calculated Employee Wage
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee wage: " + empWage);

    }

}
