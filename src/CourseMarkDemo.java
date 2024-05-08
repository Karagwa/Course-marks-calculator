public class CourseMarkDemo {
    
    public static void main(String[] args) {
        CourseMarks courseScore= new CourseMarks();
        courseScore.readInput();
        courseScore.calculateFinalScore();
        courseScore.getFinalScore();
        courseScore.setGrade();
        courseScore.getGrade();
        courseScore.writeOutput();
    }
}
