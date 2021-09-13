// (27-1) 시간과 날짜의 차 구하기
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;


class LocalDateTime1 {
    public static void main(String[] args) {
        // 현재 시각
        LocalDateTime today = 
                LocalDateTime.of(2021, 8, 23, 8, 50);

        // LA 항공편의 KAL 출발 시간
        LocalDateTime kal = 
                LocalDateTime.of(2021, 9, 15, 11, 5);
        
        // LA 항공편의 ASIANA 출발 시간
        LocalDateTime asiana = 
                LocalDateTime.of(2021, 9, 14, 14, 35);


        // 빠른 항공편을 선택하는 과정
        LocalDateTime myFlight;
    
        if(kal.isBefore(asiana))
            myFlight = kal;
        else
            myFlight = asiana;

        // 빠른 항공편의 비행 탑승까지 남은 날짜 계산
        Period day = Period.between(today.toLocalDate(), myFlight.toLocalDate());

        // 빠른 항공편의 비행 탑승까지 남은 시간 계산
        Duration time = Duration.between(today.toLocalTime(), myFlight.toLocalTime());

        // 비행 탑승까지 남은 날짜와 시간 출력
        System.out.println(day);
        System.out.println(time);
        
        // dd일 hh시간 mm분
        String s = day.toString();
        s = s.substring(1,s.length());
        s = s.replace("D", "일 ");
        System.out.println(s);
        
        String t = time.toString();
        t = t.substring(2,t.length());
        t = t.replace("H", "시간 ");
        t = t.replace("M", "분");
        System.out.println(t);
        
        System.out.println("비행 탐승까지 남은 시간: "+s+" "+t);
        
    }
}