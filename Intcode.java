import java.util.*;

public class Intcode {
    private ArrayList<Integer> memory;
    private final int EXIT_CODE = 99;
    private final int ADD_CODE = 1;
    private final int MULT_CODE = 2;

    public Intcode(String s) {
        memory = new ArrayList<Integer>();
        String[] tokens = s.split(",");
        for (String num : tokens) {
            memory.add(Integer.parseInt(num));
        }
        int inputSize = memory.size();
        for (int i = 0; i < 10 * inputSize; i++) {
            memory.add(0);
        }
    }

    public void run() {
        for (int i = 0; i < memory.size(); i++) {
            if (memory.get(i) == EXIT_CODE) {
                break;
            } else if (memory.get(i) == ADD_CODE) {
                add(memory.get(i + 1), memory.get(i + 2), memory.get(i + 3));
                i += 3;
            } else if (memory.get(i) == MULT_CODE) {
                multiply(memory.get(i + 1), memory.get(i + 2), memory.get(i + 3));
                i += 3;
            }
        }
    }

    public void add(int i, int j, int k) {
        memory.set(k, memory.get(i) + memory.get(j));
    }

    public void multiply(int i, int j, int k) {
        memory.set(k, memory.get(i) * memory.get(j));
    }
}