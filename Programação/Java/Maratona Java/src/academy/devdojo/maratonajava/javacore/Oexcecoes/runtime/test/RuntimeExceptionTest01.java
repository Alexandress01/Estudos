package academy.devdojo.maratonajava.javacore.Oexcecoes.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked -> Exception;
        // Unchecked -> Error/RuntimeException
        int[] nums = {1, 2, 3};

        System.out.println(nums[3]);
    }
}