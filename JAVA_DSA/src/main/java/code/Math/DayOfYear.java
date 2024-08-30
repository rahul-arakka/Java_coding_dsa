//https://leetcode.com/problems/day-of-the-year/description/
//Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.


package code.Math;

public class DayOfYear {
    class Solution {
        public int dayOfYear(String date) {
            int day = 0;
            String[] dt = date.split("-");
            int month = Integer.parseInt(dt[1]);
            for (int i = 1; i < month; i++) {
                if (i == 2) {
                    day += 28;
                } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                    day += 30;
                } else {
                    day += 31;
                }
            }
            day += Integer.parseInt(dt[2]);
            int year = Integer.parseInt(dt[0]);
            if (month > 2 && year % 4 == 0 && ((year % 100 != 0) || (year % 400 == 0)))
                day += 1;
            return day;
        }
    }
}
