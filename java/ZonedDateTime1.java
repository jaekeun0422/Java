// (27-2) 한국 출발 뉴욕 도착 비행 시간 구하기
import java.time.Duration;
import java.time.ZoneId;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

class ZonedDateTime1 {
    public static void main(String[] args) {
        // 한국 출발 2021-08-23  14:30
        ZonedDateTime departure = ZonedDateTime.of(
                LocalDateTime.of(2021, 8, 23, 14, 30), ZoneId.of("Asia/Seoul"));

        System.out.println("Departure : " + departure);

        // LA 도착 2021-08-23  11:25
        ZonedDateTime arrival = ZonedDateTime.of(
                LocalDateTime.of(2021, 8, 23, 11, 25), ZoneId.of("America/Los_Angeles"));

        System.out.println("Arrival : " + arrival);

        // 비행 시간
        System.out.println("Flight Time : " + 
                Duration.between(departure, arrival));
    }
}
