class Q25 {
    public static void main(String[] args) {

        int[][] marks = {
            {80, 75, 90},
            {70, 85, 88},
            {92, 78, 84}
        };

        int sum = 0;
        int count = 0;

        for (int[] student : marks) {
            for (int mark : student) {
                sum += mark;
                count++;
            }
        }

        double average = (double) sum / count;

        System.out.println("Average Marks = " + average);
    }
}