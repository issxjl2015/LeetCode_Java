package main.weeklyContest.weekly_contest_177.contest_5169_日期之间隔几天;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Solution {
    public int daysBetweenDates(String date1, String date2) {
        LocalDate startDate = LocalDate.parse(date1);
        LocalDate endDate = LocalDate.parse(date2);

        long daysDiff = ChronoUnit.DAYS.between(startDate, endDate);
        return Math.abs((int) daysDiff);
    }

    public static void main(String[] args) throws ParseException {
        Solution solution = new Solution();
        int ans = solution.daysBetweenDates("2019-06-20", "2019-06-30");
        System.out.println(ans);
    }
}
