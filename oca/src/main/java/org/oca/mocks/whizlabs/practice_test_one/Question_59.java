package org.oca.mocks.whizlabs.practice_test_one;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by mx on 26/3/2017.
 */
public class Question_59 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now(Clock.systemDefaultZone());
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDateTime.now()));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(localDateTime));
    }
}
