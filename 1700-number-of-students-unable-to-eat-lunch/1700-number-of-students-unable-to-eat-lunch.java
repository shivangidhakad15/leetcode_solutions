class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int studentsWithSquareSandwiches = 0;
        int studentsWithCircularSandwiches = 0;
        for (int student : students) {
            if (student == 1) {
                studentsWithCircularSandwiches++;
            } else {
                studentsWithSquareSandwiches++;
            }
        }
        for (int sandwich : sandwiches) {
            if (sandwich == 1 && studentsWithCircularSandwiches > 0) {
                studentsWithCircularSandwiches--;
            } else if (sandwich == 0 && studentsWithSquareSandwiches > 0) {
                studentsWithSquareSandwiches--;
            } else {
                return studentsWithCircularSandwiches + studentsWithSquareSandwiches;
            }
        }
        return 0;
    }
}