class Ex2_ArrAverage {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;

//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }

        for (int i : numbers) {
            sum += i;
        }

        answer = sum / numbers.length;
        System.out.println(answer);
        return answer;
    }
}
