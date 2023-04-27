public class Main {
    public static void main(String[] args) {
        int ticketPrice = 40_000;
        int rublesPerMile = 20;
        int bonusMiles = ticketPrice / rublesPerMile;
        System.out.println(bonusMiles);
    }
}