class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> stack = new ArrayList<>();

        for (String operation : operations) {
            if (operation.equals("+")) {
                int num1 = stack.get(stack.size() - 1);
                int num2 = stack.get(stack.size() - 2);
                stack.add(num1 + num2);
            } else if (operation.equals("C")) {
                stack.remove(stack.size() - 1);
            } else if (operation.equals("D")) {
                int num = stack.get(stack.size() - 1) * 2;
                stack.add(num);
            } else {
                stack.add(Integer.parseInt(operation));
            }
        }

        int total = 0;
        for (int num : stack) {
            total += num;
        }

        return total;
    }
}