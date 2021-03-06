/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosEnLinea;

public class EjerciciosEnLinea {
//Ejercicio 1 de Array2  
public int[] evenOdd(int[] nums) {
        int[] ret = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ret[index] = nums[i];
                index++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                ret[index] = nums[i];
                index++;
            }
        }
        return ret;
    }
//Ejercicio 2 de Array2  
public String[] fizzBuzz(int start, int end) {
        int n = end - start;
        String[] ret = new String[n];
        for (int i = 0; i < n; i++) {
            if (start % 3 == 0 && start % 5 == 0) {
                ret[i] = "FizzBuzz";
            } else if (start % 3 == 0) {
                ret[i] = "Fizz";
            } else if (start % 5 == 0) {
                ret[i] = "Buzz";
            } else {
                ret[i] = String.valueOf(start);
            }
            start++;
        }
        return ret;
    }
//Ejercicio 3 de Array2 
 public int[] withoutTen(int[] nums) {
        int index = 0;
        int[] ret = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                ret[index] = nums[i];
                index++;
            }
        }
        return ret;
    }
//Ejercicio 4 de Array2
public int[] zeroFront(int[] nums) {
        int cero = 0;
        int uno = nums.length - 1;
        int[] ret = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                ret[cero] = nums[i];
                cero++;
            } else {
                ret[uno] = nums[i];
                uno--;
            }
        }
        return ret;
    }
//Ejercicio 5 de Array2
 public int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val) {
                int mayor = 0;
                if (nums[i - 1] != val && nums[i + 1] != val) {
                    mayor = nums[i - 1] > nums[i + 1] ? nums[i - 1] : nums[i + 1];
                    if (mayor > nums[i]) {
                        nums[i] = mayor;
                    }
                }
            }
        }
        return nums;
    }
//Ejercicio 1 de Array3
 public int maxSpan(int[] nums) {
        int span = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[i] == nums[j] && j - i + 1 > span) {
                    span = j - i + 1;
                    break;
                }
            }
        }
        return span;
    }
//Ejercicio 2 de Array3
public int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3 && nums[i + 1] != 4) {
                for (int j = nums.length - 1; j > 0; j--) {
                    if (nums[j] == 4 && nums[j - 1] != 3) {
                        nums[j] = nums[i + 1];
                        nums[i + 1] = 4;
                        break;
                    }
                }
            }
        }
        return nums;
    }
//Ejercicio 3 de Array3
 public int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4 && nums[i + 1] != 5) {
                for (int j = nums.length - 1; j >= 0; j--) {
                    if (nums[j] == 5) {
                        if (j == 0 || nums[j - 1] != 4) {
                            nums[j] = nums[i + 1];
                            nums[i + 1] = 5;
                            break;
                        }
                    }
                }
            }
        }
        return nums;
    }
//Ejercicio 4 de Array3
 public boolean canBalance(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                sum = i < j ? sum + nums[j] : sum - nums[j];
            }
            if (sum == 0) {
                return true;
            }
        }
        return false;
    }
//Ejercicio 5 de Array3
  public boolean linearIn(int[] outer, int[] inner) {
        int count = 0;
        for (int i = 0; i < inner.length; i++) {
            for (int j = 0; j < outer.length; j++) {
                if (outer[j] == inner[i]) {
                    count++;
                    break;
                }
            }
        }
        return count == inner.length;
    }
}
public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
