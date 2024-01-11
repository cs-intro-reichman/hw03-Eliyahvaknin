/*
* Checks if a given year is a leap year or a common year,
* and computes the number of days in a given month and a
given year.
*/
public class Calendar0 {
// Gets a year (command-line argument), and tests the
functions isLeapYear and nDaysInMonth.
public static void main(String args[]) {
int year = Integer.parseInt(args[0]);
isLeapYearTest(year);
nDaysInMonthTest(year);
}
// Tests the isLeapYear function.
private static void isLeapYearTest(int year) {
String commonOrLeap = "common";
if (isLeapYear(year)) {
commonOrLeap = "leap";
}
System.out.println(year + " is a " + commonOrLeap +
" year");
}
// Tests the nDaysInMonth function.
private static void nDaysInMonthTest(int year) {
for (int i = 1; i <= 12; i++) {
System.out.println("Month " +i+ " has
"+nDaysInMonth(i, year)+" days");
}
}
public static boolean isLeapYear(int year) {
return (year % 4 == 0 && (year % 100 != 0 || year %
400 == 0));
}
public static int nDaysInMonth(int month, int year) {
switch (month) {
case 2:
if(isLeapYear(year))
return 29;
return 28;
case 9:
case 11:
case 4:
case 6:
return 30;
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
return 31;
}
return 0;
}
}
