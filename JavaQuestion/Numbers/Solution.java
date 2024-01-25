package Numbers;

public class Solution {

  public static void main(String[] args) {
    int arr[] = new int[5];
    arr = Assign(0, 1, arr);

    for (int i = 0; i < arr.length; i++) {
      //   System.out.println();
      //   System.out.print(arr[i] + " ");
    }
    // print factorial
    // System.out.println(printfact(-1));

    // ➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖
    // print power
    // System.out.println(power(2, 5));

    // ➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖
    // optimize power
    // System.out.println(optimizePower(3, 4));

    // ➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖
    // perfect number
    // int n = 10;
    // int sum = 0;
    // int i = 1;
    // if (n == isPerfect(n, i, sum)) {
    //   System.out.println();
    //   System.out.println("perfect number");
    // } else {
    //   System.out.println("not a perfect number");
    // }

    // ➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖
    // sum to n
    // System.out.println(sum(5));

    // ➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖
    // sum of number in a given range
    // System.out.println(sumInRange(1, 5, 0));

    // ➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖
    //print prime
    // printPrime(1, 10);

    // ➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖
    // sum of individual digit of the number
    // Long ans = SumofAnumber(15284689);

    // System.out.println(ans);

    // ➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖
    // reverse the given number
    // System.out.println(ReverseNumber(-128534));

    // ➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖
    // pallindromic number
    // System.out.println(isPallindrome(12421));

    // ➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖
    // armstrong number
    // System.out.println(isArmstrong(371));
    // ➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖

    // fibonacci series
    // int n = 7;
    // System.out.print("0" + " " + "1" + " ");
    // printFibo(0, 1, n - 2);
    // ➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖
    // Nth fibo term
    // System.out.println(NthFibo(n));
    // ➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖
    // power of a number
    // System.out.println(Power(2, 5));
    // ➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖
    // factorial of a given number
    // // System.out.println(fact(6));
    // // ➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖

    // number of a count to make a single digit number
    // System.out.println(Count(-123));
    // ➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖
    // prime factor of a number
    // primeFactor(90);  2,3,3,9
    // ➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖

    // Strong number
    // 👉👉👉👉 a number is said to be a strong number if it can be represent as the
    // the  sum of the factorial of its individua number
    // ❗❗145=1!+4!+5!

    //     if (isStrong(145)) {
    //       System.out.println(isStrong(145) + " , it's an strong number");
    //     } else {
    //       System.out.println(isStrong(145) + " , it's  not an strong number");
    //     }
    //   }
    // ➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖
    // Automorphic number
    //  a number is said to be automorphic if the unit digit of square of the number is equal to that number
    // 👉👉5=25
    //        ⬆️=5;
    // System.out.println(isAutomorphic(625));

    // ➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖
    // number is said to be the harshad number if the it is completely divisibel by the sum of its individul number
    // 21 = 2+1
    // 21/3==0
    // System.out.println(isHarshad(115));\

    // ➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖
    // ABUNDANT NUMBER
    //     Input : Number = 18
    // Output : Yes, It's an Abundant Number
    // Explanation : The Factors for the number 18 are, 1, 2, 3, 6 and 9. We don't want to include the number itself.
    // Now the sum of the factors except the number itself is :
    // 1 + 2 + 3 + 6 + 9 = 21
    // as the number 21>18 , the number itself.
    // It's an abundant number

    // System.out.println(isAbundant(4));
    // ➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖
    // 👉👉👉Friendly Pair
    // Input : 6 28
    // Output : Yes, they are a friendly pair
    // Explanation : The factors of 6 and 28 except the numbers themselves are 1, 2, 3 and 1, 2, 4, 7, 14 respectively.
    // Now the sum of factors of both the numbers are 6 and 28 respectively.
    // When we divide the sums with the numbers we get 1 and 1 respectively.
    // As the ratio of both the number match, they are considered as a friendly pair.

    System.out.println(AreFriendly(30, 140));
  }

  // program to checkBacktracking
  public static int[] Assign(int i, int value, int arr[]) {
    if (i == 5) {
      return arr;
    }
    arr[i] = value;
    // System.err.print(arr[i] + " ");
    Assign(i + 1, value + 1, arr);
    arr[i] = arr[i] - 2;

    return arr;
  }

  //   printfact
  public static int printfact(int n) {
    int fact = 1;
    if (n == 0 || n == 1) {
      return 1;
    }
    if (n < 0) {
      return -1;
    }
    return n * printfact(n - 1);
  }

  //   print power
  public static int power(int n, int power) {
    if (n == 0) {
      return 0;
    }
    if (power == 0) {
      return 1;
    }
    int n2 = power(n, power - 1);
    return n2 * n;
  }

  //   optimize way
  public static int optimizePower(int n, int power) {
    if (n == 0) {
      return 0;
    }
    if (power == 0) {
      return 1;
    }
    if (power % 2 == 0) {
      return optimizePower(n, power / 2) * optimizePower(n, power / 2);
    } else return optimizePower(n, power / 2) * optimizePower(n, power / 2) * n;
  }

  //   to check whether the number is perfect square or not
  public static int isPerfect(int n, int i, int sum) {
    if (i == n - 1) {
      return sum;
    }
    if (n % i == 0) {
      System.out.print(i + ",");
      return isPerfect(n, i + 1, sum += i);
    } else return isPerfect(n, i + 1, sum);
  }

  //   sum of n natural number
  public static int sum(int n) {
    if (n == 0) {
      return 0;
    }
    int sum = n + sum(n - 1);
    return sum;
  }

  //   sum of a number in a given range
  public static int sumInRange(int low, int high, int sum) {
    if (low > high) {
      return sum;
    }
    return low + sumInRange(low + 1, high, sum);
  }

  //   prime number with in a given range

  public static boolean isPrime(int n) {
    if (n < 2) {
      return false;
    }
    for (int i = 2; i < n; i++) {
      if (n % i == 0) return false;
    }
    return true;
  }

  public static void printPrime(int i, int n) {
    if (i == 1) {
      i++;
    }
    while (i < n) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
      i++;
    }
  }

  //   sum of a individual digit of the number

  public static long SumofAnumber(long n) {
    if (n == 0) {
      return 0;
    }
    long sum = 0;
    long num = n;
    while (num != 0) {
      long a = num % 10;
      sum += a;
      num /= 10;
    }
    return sum;
  }

  //   reverse the given number
  public static int ReverseNumber(int n) {
    int rev, reverse = 0;
    while (n != 0) {
      rev = n % 10;
      reverse = reverse * 10 + rev;
      n /= 10;
    }
    return reverse;
  }

  //   check the number is pallindromic or not
  public static boolean isPallindrome(int n) {
    int a, sum = 0;
    int num = n;
    while (num != 0) {
      a = num % 10;
      sum = sum * 10 + a;
      num /= 10;
    }
    return n == sum;
  }

  //   to check for the Armstrong

  public static boolean isArmstrong(int n) {
    int num = n;
    int sum = 0;
    while (num != 0) {
      int a = num % 10;

      sum = sum + (a * a * a);
      num = num / 10;
    }
    return sum == n;
  }

  //   fibonacci series upto n
  public static void printFibo(int a, int b, int n) {
    if (n == 0) {
      return;
    }

    int c = a + b;
    System.out.print(c + " ");
    printFibo(b, c, n - 1);
  }

  //   nth term of fibonacci series
  public static int NthFibo(int n) {
    if (n == 0 || n == 1) {
      return 0;
    } else if (n == 2) {
      return 1;
    }
    return (NthFibo(n - 1) + NthFibo(n - 2));
  }

  //   power of a number
  public static int Power(int n, int power) {
    if (n == 0) {
      return 0;
    }
    if (power == 0) {
      return 1;
    }
    return n * Power(n, power - 1);
  }

  //   print factorial
  public static int fact(int n) {
    if (n == 0) {
      return 1;
    }

    return n * fact(n - 1);
  }

  // 12345;
  public static int Count(int n) {
    if (n > -10 && n < 10) {
      return 1;
    }
    int count = -1;

    while (n != 0) {
      count++;
      n = n / 10;
    }
    return count;
  }

  public static boolean isprime(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  //   prime factor of a number
  public static void primeFactor(int n) {
    for (int i = 1; i < n; i++) {
      if (isPrime(i)) {
        int x = n;
        while (x % i == 0) {
          System.out.print(i + " ");
          x /= i;
        }
      }
    }
  }

  //   to check whether the number is strong number or not
  // 145=1!+4!+5!
  public static boolean isStrong(int n) {
    int sum = 0;
    int num = n;
    while (num != 0) {
      int a = num % 10;
      int factA = fact(a);
      sum += factA;
      num = num /= 10;
    }
    return n == sum;
  }

  //   to check whether the number is automorphic or not
  // 5**2=25== 5 unit digit of square to that number only

  public static boolean isAutomorphic(int n) {
    int sqr = n * n;
    System.out.println(sqr);
    while (n != 0) {
      if (sqr % 10 != n % 10) {
        return false;
      }
      n /= 10;
      sqr /= 10;
    }

    return true;
  }

  //   to check whether the number is harshad or not
  // 21=2+1   21/3==0
  public static boolean isHarshad(int num) {
    if (num == 0) {
      return true;
    }
    System.out.println(num);
    int n = num;
    int sum = 0;
    while (n != 0) {
      int a = n % 10;
      sum += a;
      n /= 10;
    }
    System.out.println(sum);
    return num % sum == 0;
  }

  public static boolean isAbundant(int n) {
    if (n == 0) {
      return false;
    }
    int sum = 0;

    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        sum += i;
      }
    }

    return n < sum;
  }

  //   to check friendly pair
  // 6,28     factor         result
  //  1,2,3          6/(1+2+3)==1
  // 1,2,4,7,14      28/(1+2+4+7+14)==1

  // 1==1;

  public static int getFactor(int n) {
    int sum = 0;
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        sum += i;
      }
    }
    return sum;
  }

  public static boolean AreFriendly(int m, int n) {
    if (m == n) {
      return true;
    }
    int nFactor = getFactor(n);
    int mFactor = getFactor(m);
    return m / mFactor == n / nFactor;
  }
}
