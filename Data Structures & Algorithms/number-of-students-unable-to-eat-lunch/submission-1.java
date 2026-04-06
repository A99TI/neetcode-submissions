class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        int studentZero = 0;
        int studentOne = 0;


        for (int student : students){
            if (student == 0) studentZero++;
            if (student == 1) studentOne++;
        }

        for (int sandwich : sandwiches){
            if (sandwich == 1 && studentOne == 0) {
                return studentZero;
            } else if (sandwich == 0 && studentZero == 0){
                return studentOne;
            } else{
                if (sandwich == 1) studentOne--; 
                if (sandwich == 0) studentZero--; 
            }   
        }

        return 0;        
    }
}