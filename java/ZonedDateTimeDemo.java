// Testing
import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

class ZonedDateTimeDemo {
    public static void main(String[] args) {
    	
    	ZoneId.getAvailableZoneIds() // 시간대 별 ID 반환
    		.stream()
    		.filter(s -> s.startsWith("America"))
    		.sorted()
    		.forEach(s -> System.out.println(s));

        // 이곳의 현재 날짜와 시각
        ZonedDateTime here = ZonedDateTime.now();
        System.out.println(here);

        // 동일한 날짜와 시각의 뉴욕
        ZonedDateTime newyork = ZonedDateTime.of(
                               here.toLocalDateTime(), ZoneId.of("America/New_York"));
        System.out.println(newyork);

        // 이곳과 뉴욕의 시차 
        Duration diff = Duration.between(here, newyork);
        System.out.println(diff);
    }
}