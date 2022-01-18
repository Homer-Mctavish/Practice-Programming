int solution(int[] inputArray) {
    int last = inputArray[0] - 1;
    return inputArray.Sum(_ => (last = Math.Max(last + 1, _)) - _);
}
