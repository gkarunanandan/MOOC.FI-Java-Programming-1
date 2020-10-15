
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics (){
        int numberCount;
    }
    
    public void addNumber (int number){
        this.count +=1;
        sum += number;
    }
    
    public int getCount (){
        return this.count;
    }
    
    public int sum (){
        return this.sum;
    }
    
    public double average (){
        if (this.getCount() == 0){
            return 0;
        }
        double average = (double) this.sum() / this.getCount();
        return average;
    }
}
