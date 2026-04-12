// Definition for a pair.
// class Pair {
//     int key;
//     String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> quickSort(List<Pair> pairs) {
        List<Pair> arr = new ArrayList<>(pairs);
        sort(arr, 0, arr.size() - 1);
        return arr;
    }

    private void sort(List<Pair> arr, int left, int right) {
        if (left >= right) {
            return;
        }

        Pair pivot = arr.get(right);
        int pos = left;

        for (int i = left; i < right; i++) {
            if (arr.get(i).key < pivot.key) {
                Pair temp = arr.get(i);
                arr.set(i, arr.get(pos));
                arr.set(pos, temp);
                pos++;
            }
        }

        Pair temp = arr.get(pos);
        arr.set(pos, arr.get(right));
        arr.set(right, temp);

        sort(arr, left, pos - 1);
        sort(arr, pos + 1, right);
    }
}