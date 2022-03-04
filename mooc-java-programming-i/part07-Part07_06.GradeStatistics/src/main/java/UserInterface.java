import java.util.Scanner;

public class UserInterface {
    private Grade grade;
    private Scanner scan;
    
    public UserInterface(Scanner scanner){
        this.scan = scanner;
        this.grade = new Grade();
    }
    
    public void start(){
        readPoints();
        printPointAverage();
        printPointPassingAverage();
        printPassingPercentage();
        storePointsAsGrades();
        printGradeDistribution();
    }
    
    public void readPoints(){
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int input = Integer.valueOf(scan.nextLine());
            if(input == -1){
                break;
            }
            this.grade.add(input);
        }
    }
    
    public void printPointAverage(){
        System.out.println("Point average (all): " + this.grade.getAverage());
    }
    
    public void printPointPassingAverage(){
        if(this.grade.getAverageOfPassing() == 0){
            System.out.println("Point average (passing): -");
        }
        else{
            System.out.println("Point average (passing): " + this.grade.getAverageOfPassing());
        }
    }
    
    public void printPassingPercentage(){
        System.out.println("Pass percentage: " + this.grade.getPassPercentage());
    }
    
    public void storePointsAsGrades(){
        this.grade.pointsToGrades();
    }
    
    public void printGradeDistribution(){
        System.out.println("Grade distribution:");
        printStars();
    }
    
    public void printStars(){
        int grade = 5;
        while(grade >= 0){
            int stars = this.grade.numberOfGrades(grade);
            System.out.print(grade + ": ");
            while(stars > 0){
                System.out.print("*");
                stars--;
            }
            System.out.println("");
            grade--;
        }
    }
}
