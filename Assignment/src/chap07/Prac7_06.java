package chap07;

import java.util.*;

class Location7_06 {
    private String city;
    private int longitude;
    private int latitude;

    public Location7_06(String city, int longitude, int latitude) {
        this.city = city;
        this.longitude = longitude;
        this.latitude = latitude;
    }
    public String getCity() {
        return city;
    }
    public int getLongitude() {
        return longitude;
    }
    public int getLatitude() {
        return latitude;
    }
}

public class Prac7_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Location7_06> dept = new HashMap<String, Location7_06>();

        System.out.println("도시,경도,위도를 입력하세요.");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String text = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(text, ",");
            String city = st.nextToken().trim();
            int logitude = Integer.parseInt(st.nextToken().trim());
            int latitude = Integer.parseInt(st.nextToken().trim());

            Location7_06 loc = new Location7_06(city, logitude, latitude);
            dept.put(city, loc);
        }
        Set<String> key = dept.keySet();
        Iterator<String> it = key.iterator();
        System.out.println("---------------------------");
        while (it.hasNext()) {
            String city = it.next();
            Location7_06 loc = dept.get(city);

            System.out.print(loc.getCity() + "\t");
            System.out.print(loc.getLongitude() + "\t");
            System.out.println(loc.getLatitude());
        }
        System.out.println("---------------------------");

        while (true) {
            System.out.print("도시 이름 >> ");
            String city = scanner.nextLine();
            if (city.equals("그만"))
                return;

            Location7_06 loc = dept.get(city);
            if (loc == null) {
                System.out.println(city + "는 없습니다.");
            }
            else {
                System.out.print(loc.getCity() + "\t");
                System.out.print(loc.getLongitude() + "\t");
                System.out.println(loc.getLatitude());
            }
        }
    }
}

