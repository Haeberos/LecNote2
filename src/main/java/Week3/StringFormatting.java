package Week3;

public class StringFormatting {
    public static void main(String[] args) {

        String college = "MCTC";
        String className = "Java Programming";
        int classCode = 2545;
        int credits = 6;
        double averageGrade = 84.545345;
        boolean isOnline = true;

        System.out.println("This class code is " + classCode);

        // %d = int
        // %s = string
        // %f = double
        System.out.printf("This class is %d %s. It is taught at %s. It is %d credits, the average " +
                "grade is %f%%. Is it online? %s\n",
                classCode, className, college, credits, averageGrade, isOnline);

        System.out.printf("The average grade is %.0f\n", averageGrade);
    }
}
