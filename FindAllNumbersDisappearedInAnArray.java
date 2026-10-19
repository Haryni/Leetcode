class Solution {
    public java.util.List<Integer> findDisappearedNumbers(int[] nums) {
        int arrayLength = nums.length;

        // Create a boolean array to track which numbers are present
        // Index 0 is unused, indices 1 to n represent numbers 1 to n
        boolean[] isPresent = new boolean[arrayLength + 1];

        // Mark numbers that appear in the input array
        for (int number : nums) {
            if (number >= 1 && number <= arrayLength) {
                isPresent[number] = true;
            }
        }

        // Create result list to store missing numbers
        java.util.List<Integer> missingNumbers = new java.util.ArrayList<>();

        // Check each number from 1 to n
        // Add to result if not marked as present
        for (int i = 1; i <= arrayLength; i++) {
            if (!isPresent[i]) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }
}
