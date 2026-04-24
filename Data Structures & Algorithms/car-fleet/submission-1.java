class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        TreeMap<Integer,Double> cars = new TreeMap<>();
        
        for (int i = 0; i < position.length; i++) {
            int remainingDist = target - position[i];
            double timeToDes = (double) remainingDist / speed[i];
            cars.put(position[i], timeToDes);
        }

        int res = 0;

        while (!cars.isEmpty()) {
            double value = cars.pollLastEntry().getValue();

            while (!cars.isEmpty() && cars.lastEntry().getValue() <= value) {
                cars.pollLastEntry();
            }

            res++;
        }

        return res;
    }
}
