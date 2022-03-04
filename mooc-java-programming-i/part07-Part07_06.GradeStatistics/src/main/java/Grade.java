import java.util.ArrayList;

public class Grade {
    private ArrayList<Integer> points, grades;
    private double sum, sumOfPassingPoints;
    private int noOfPassingPoints;
    
    public Grade(){
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
        this.sum = 0;
        this.sumOfPassingPoints = 0;
        this.noOfPassingPoints = 0;
    }
    
    public void add(int grade){
        if(grade >= 0 && grade <= 100){
            this.points.add(grade);
            this.sum += grade;
            if(grade >= 50){
                this.sumOfPassingPoints += grade;
                this.noOfPassingPoints++;
            }
        }
    }
    
    public double getSum(){
        return this.sum;
    }
    
    public double getSumOfPassingPoints(){
        return this.sumOfPassingPoints;
    }
    
    public int getNoOfPassingPoints(){
        return this.noOfPassingPoints;
    }
    
    public int getSize(){
        return this.points.size();
    }
    
    public double getAverage(){
        if(this.points.isEmpty()){
            return 0;
        }
        return getSum() / this.points.size();
    }
    
    public double getAverageOfPassing(){
        if(this.noOfPassingPoints == 0){
            return 0;
        }
        return getSumOfPassingPoints() / getNoOfPassingPoints();
    }
    
    public double getPassPercentage(){
        if(getSize() == 0){
            return 0;
        }
        double ans = 1.0 * this.noOfPassingPoints / getSize();
        return ans * 100;
    }
    
    public void pointsToGrades(){
        for(int grade : this.points){
            if(grade < 50){
                this.grades.add(0);
            } else if(grade < 60){
                this.grades.add(1);
            } else if(grade < 70){
                this.grades.add(2);
            } else if(grade < 80){
                this.grades.add(3);
            } else if(grade < 90){
                this.grades.add(4);
            } else{
                this.grades.add(5);
            }
        }
    }
    
    public int numberOfGrades(int grade){
        int count = 0;
        for(int received : this.grades){
            if(received == grade){
                count++;
            }
        }
        return count;
    }
}
