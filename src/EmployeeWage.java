public class EmployeeWage {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String[] args) {

        // Welcome to Employee Wage Computation
        System.out.println("Welcome to Employee Wage Computation Program");

        // Declaration
        int empHrs,empWage;

        // Computation
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;

        // Condition using switch-case
        switch (empCheck){
            case IS_PART_TIME:
                empHrs = 4;
                break;
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }

        // Calculated Employee Wage
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Employee wage: " + empWage);

    }

}
