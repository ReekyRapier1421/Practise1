package block1.pract4.seasons;

public class TestSeason {
    public static void like(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static void main(String[] args) {
        Season favorite=Season.SUMMER;
        System.out.println("Любимое время года: "+favorite);
        System.out.println("Средняя температура: "+favorite.getTemperature()+" градусов");
        System.out.println("Описание: "+favorite.getDescription());

        System.out.println();
        like(favorite);

        System.out.println("\nВсе времена года:");
        for (Season s : Season.values()) {
            System.out.printf("%-8s %4d   %s%n", s, s.getTemperature(), s.getDescription());
        }
    }
}
