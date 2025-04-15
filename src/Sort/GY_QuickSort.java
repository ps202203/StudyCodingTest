package Sort;

public class GY_QuickSort {
    public void quickSort(int[] array, int left, int right) {
        if(left >= right) return;

        // 분할
        int pivot = partition(array, left, right);

        // 피벗은 제외한 2개의 부분 배열을 대상으로 순환 호출
        quickSort(array, left, pivot-1);  // 정복(Conquer)
        quickSort(array, pivot+1, right); // 정복(Conquer)
    }
    public int partition(int[] array, int left, int right) {
        /**
         // 최악의 경우, 개선 방법
         int mid = (left + right) / 2;
         swap(array, left, mid);
         */

        int pivot = array[left]; // 가장 왼쪽값을 피벗으로 설정
        int i = left, j = right;

        while(i < j) {
            while(pivot < array[j]) {
                j--;
            }
            while(i < j && pivot >= array[i]){
                i++;
            }
            //swap(array, i, j);
        }
        array[left] = array[i];
        array[i] = pivot;

        return i;
    }

    public static void main(String[] args) {

    }
}
