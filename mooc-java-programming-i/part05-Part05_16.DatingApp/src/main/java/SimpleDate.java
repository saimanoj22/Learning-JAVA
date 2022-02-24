
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public void advance(){
        if(this.day + 1 <= 30){
            this.day++;
        }
        else{
            if(this.month + 1 <= 12){
                this.day = 1;
                this.month++;
            }
            else{
                this.day = 1;
                this.month = 1;
                this.year++;
            }

        }
    }

    public void advance(int howManyDays){
        int yearsAdvance = howManyDays / 360;
        this.year += yearsAdvance;
        howManyDays -= (yearsAdvance * 360);
        int monthAdvance = howManyDays / 30;
        this.month += (howManyDays / 30);
        
        if(this.month > 12){
            this.month -= 12;
            this.year++;
        }
        howManyDays -= (monthAdvance * 30);
        this.day += howManyDays;
        if(this.day > 30){
            this.day -= 30;
            this.month++;
        }
        // code to be added so that it works for month = 1
        if(this.month == 13){
            this.month = 1;
            this.year++;
        }
    }
    
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate clone = new SimpleDate(this.day, this.month, this.year);
        int yearsAdvance = days / 360;
        clone.year += yearsAdvance;
        days -= (yearsAdvance * 360);
        int monthAdvance = days / 30;
        clone.month += (days / 30);
        if(clone.month > 12){
            clone.month -= 12;
            clone.year++;
        }
        days -= (monthAdvance * 30);
        clone.day += days;
        if(clone.day > 30){
            clone.day -= 30;
            clone.month++;
        }
        // code to be added so that it works for month = 1
        if(clone.month == 13){
            clone.month = 1;
            clone.year++;
        }
        
        return clone;
    }
    
    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
