#include <stdio.h>      /* printf */
#include <math.h>

bool solution(int n) {
  int digits = (int) std::log10(n) + 1;
  int sum1 = 0, sum2 = 0;

  for (int x = 0; n > 0; n /= 10, x++) {
    if (x < digits / 2)
      sum1 += n % 10;
    else
      sum2 += n % 10;
  }

  return sum1 == sum2;
}
