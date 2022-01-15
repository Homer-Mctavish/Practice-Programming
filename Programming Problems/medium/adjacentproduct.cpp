
int multiply(vector<int> arr, int first, int next) {
  int temp = arr[first] * arr[next];
  return temp;
}

int solution(vector<int> inputArray) {
  int value1 = 0;
  int value2 = 0;
  int value3 = multiply(inputArray, 0, 1);
  for (int k = 0; k < inputArray.size() - 1; k++) {
    value1 = multiply(inputArray, k, k + 1);
    value2 = value1;
    if (value2 > value3) {
      value3 = value2;
    } else {
      value3 = value3;
    }
  }
  return value3;
}
