
public class SortingNumber {

    public int[] of(int[] inputs) {
        int count = 1;
        while (count > 0) {
            count = 0;
            for (int i = 0; i < inputs.length - 1; i++) {
                if (inputs[i] > inputs[i + 1]) {
                    int temp = inputs[i];
                    inputs[i] = inputs[i + 1];
                    inputs[i + 1] = temp;
                    count++;
                }
            }
        }
        return inputs;
    }

}
