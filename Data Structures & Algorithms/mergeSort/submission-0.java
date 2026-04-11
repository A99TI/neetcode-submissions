// Definition for a pair.
// class Pair {
//     public int key;
//     public String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        if (pairs.size() <= 1) {
            return pairs;
        }

        int mid = pairs.size() / 2;

        List<Pair> left = mergeSort(pairs.subList(0, mid));
        List<Pair> right = mergeSort(pairs.subList(mid, pairs.size()));

        return merge(left, right);
    }

    public List<Pair> merge(List<Pair> left, List<Pair> right){
        List<Pair> sortedList = new ArrayList<>();

        int p2 = 0;
        int p3 = 0;

        while (p2 < left.size() &&  p3 < right.size()){
            Pair leftPair =  left.get(p2);
            Pair rightPair = right.get(p3);

            if (leftPair.key <= rightPair.key){
                sortedList.add(leftPair);
                p2++;
            } else{
                sortedList.add(rightPair);
                p3++;
            }
        }

        while (p2 < left.size()){
            sortedList.add(left.get(p2));
            p2++;
        }

        
        while (p3 < right.size()){
            sortedList.add(right.get(p3));
            p3++;
        }

        return sortedList;

    }
}
