# Maven + JUnit + Jenkins Exam Project

## Question -> class -> test (run only that test with -Dtest=...)

| Q  | Program          | Test class                | Jenkins goal                              |
|----|------------------|---------------------------|-------------------------------------------|
| 1  | Add              | AddTest                   | clean test -Dtest=AddTest                 |
| 2  | EvenOdd          | EvenOddTest               | clean test -Dtest=EvenOddTest             |
| 3  | Largest          | LargestTest               | clean test -Dtest=LargestTest             |
| 4  | Factorial        | FactorialTest             | clean test -Dtest=FactorialTest           |
| 5  | Prime            | PrimeTest                 | clean test -Dtest=PrimeTest               |
| 6  | Fibonacci        | FibonacciTest             | clean test -Dtest=FibonacciTest           |
| 7  | ReverseNumber    | ReverseNumberTest         | clean test -Dtest=ReverseNumberTest       |
| 8  | PalindromeNumber | PalindromeNumberTest      | clean test -Dtest=PalindromeNumberTest    |
| 9  | SimpleInterest   | SimpleInterestTest        | clean test -Dtest=SimpleInterestTest      |
| 10 | Grade            | GradeTest                 | clean test -Dtest=GradeTest               |
| 11 | ArraySum         | ArraySumTest              | clean test -Dtest=ArraySumTest            |
| 12 | ArrayMax         | ArrayMaxTest              | clean test -Dtest=ArrayMaxTest            |
| 13 | VowelCount       | VowelCountTest            | clean test -Dtest=VowelCountTest          |
| 14 | ReverseString    | ReverseStringTest         | clean test -Dtest=ReverseStringTest       |
| 15 | PalindromeString | PalindromeStringTest      | clean test -Dtest=PalindromeStringTest    |

Run everything: `mvn clean test`
