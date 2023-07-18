class switch2 {

    public static void main(String args[]) {
        int result = 100;
        char grade;
        if (result >= 90)
            grade = 'A';
        else if (result >= 80)
            grade = 'B';
        else if (result >= 70)
            grade = 'C';
        else if (result >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("Grade:" + grade);
    }
}
