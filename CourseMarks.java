import java.util.Scanner;
/**This class is used to generate a student record for a course that contains:
 * Two quizzes that is quizOne and quizTwo graded on a basis of 10 points and
 * which contribute 25% of the finalScore.
 * Two examinatons that is midTermExam and finalExam graded on a basis of 100 points
 * which contribute 25% and 50% to the finalScore respectively.
 * The grade is assigned according to the final score and it consists of A,B,C,D and F grades
 */
public class CourseMarks{
    private double quizOne;
    private double quizTwo;
    private double midTermExam;
    private double finalExam;
    private double finalScore;
    private char grade;

    /**Enter scores fo the two quizes and the two exams*/
    public void readInput(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the marks for quizOne between 0 and 10 inclusive:");
        quizOne = keyboard.nextDouble();
        if (quizOne<0 || quizOne>=10){ //Checks if the appropriate quiz score has been entered
            System.out.println("The quiz scores are between 0 and 10 inclusive.\nPlease reenter the quiz scores correctly");
            System.out.println("Enter the marks for quizOne:");
            quizOne = keyboard.nextDouble();
        }
        System.out.println("Enter the marks for quiz two between 0 and 10 inclusive:");
        quizTwo = keyboard.nextDouble();
        if (quizTwo<0 || quizTwo>10){ //Checks if the appropriate quiz score has been entered
            System.out.println("The quiz scores are between 0 and 10 inclusive.\nPlease reenter the quiz scores correctly");
            System.out.println("Enter the marks for quizOne:");
            quizTwo = keyboard.nextDouble();
        }
        System.out.println("Enter the marks for the midterm exam:");
        midTermExam= keyboard.nextDouble();
        if (midTermExam<0 || midTermExam>100){ //Checks if the appropriate exam scores have been entered
            System.out.println("The exam scores are between 0 and 100 inclusive.\nPlease reenter the exam scores correctly");
            System.out.println("Enter the marks for the midterm exam:");
            midTermExam = keyboard.nextDouble();
        }
        System.out.println("Enter the marks for the final exam:");
        finalExam= keyboard.nextDouble();
        if (finalExam<0 || finalExam>100){ //Checks if the appropriate exam scores have been entered
            System.out.println("The exam scores are between 0 and 100 inclusive.\nPlease reenter the exam scores correctly");
            System.out.println("Enter the marks for the final exam:");
            finalExam = keyboard.nextDouble();
        }
    }

    /**Outputs the student record */
    public void writeOutput(){
        System.out.println("This is the record of the scores obtained during the course:");
        System.out.println("quizOne: "+quizOne);
        System.out.println("quizTwo: "+quizTwo);
        System.out.println("MidTerm Exam: "+midTermExam);
        System.out.println("Final Exam: "+finalExam);
        System.out.println("Final Score: "+finalScore);
        System.out.println("Grade: "+grade);
    }

    /**Converts quiz score to percentages */
    private double normalizeQuizOne(){
        quizOne=quizOne*10;
        return quizOne;
    }

    /**Converts quiz score to percentages */
    private double normalizeQuizTwo(){
        quizTwo=quizTwo*10;
        return quizTwo;
    }

    public void calculateFinalScore(){
        normalizeQuizOne();
        normalizeQuizTwo();
        double quizScore=((quizOne+quizTwo)/2)*0.25; //the total percentage contributed by the two quiz scores to the final score
        double midTermScore=midTermExam*0.25; //the percentage contributed by the mid term exam to the final score
        double finalExamScore=finalExam*0.5; //the percentage contributed by the final exam to the final score
        finalScore=quizScore+midTermScore+finalExamScore;
        
    }

    public double getFinalScore(){
        return finalScore;
    }

    public void setGrade(){
        if (finalScore>=90)
            grade='A';
        else if (finalScore>=80)
            grade='B';
        else if (finalScore>=70)
            grade='C';
        else if (finalScore>=60)
            grade='D';
        else
            grade='F';
    }

    public char getGrade(){
        return grade;

    }
}
