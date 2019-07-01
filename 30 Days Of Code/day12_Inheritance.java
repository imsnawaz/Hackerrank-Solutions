

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] scores){
        super(firstName,lastName,id);
        testScores = scores;
    }
    public char calculate(){
        int nsubs=testScores.length;
        int sum=0;
        for(int i =0;i<nsubs;i++)
            sum+=testScores[i];
        sum/=nsubs;
        if(sum>=90)
            return 'O';
        if(sum>=80 && sum<90)
            return 'E';
        if(sum>=70 && sum<80)
            return 'A';
        if(sum>=55 && sum<70)
            return 'P';
        if(sum>=40 && sum<55)
            return 'D';
        else
            return 'T';
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
}


