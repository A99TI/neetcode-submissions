class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> studentQueue = new LinkedList<>();

        for (int s : students) studentQueue.offer(s);

        int i = 0;
        int failedAttempts = 0;

        while (!studentQueue.isEmpty() && failedAttempts < studentQueue.size()){
            if (studentQueue.peek() == sandwiches[i]){
                studentQueue.poll();
                i++;
                failedAttempts = 0;
            }
            else{
                studentQueue.offer(studentQueue.poll());
                failedAttempts++;
            }

        }

        return  studentQueue.size();

    }
}