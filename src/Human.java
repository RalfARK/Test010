public class Human {
    private String imie;
    private int wiek;
    private KolorOczu kolorOczu;
    private KolorWlosow kolorWlosow;

    public Human (String imie, int wiek, KolorOczu kolorOczu, KolorWlosow kolorWlosow) {
        this.imie = imie;
        this.wiek = wiek;
        this.kolorOczu = kolorOczu;
        this.kolorWlosow = kolorWlosow;
    }

    public String getImie() {
        return this.imie;
    }

    public int getWiek() {
        return this.wiek;
    }

    public KolorOczu getKolorOczu() {
        return kolorOczu;
    }

    public KolorWlosow getKolorWlosow() {
        return kolorWlosow;
    }

    public static void main(String[] args) {
        Human czlowiek1 = new Human("imie 1", 18, KolorOczu.zielony, KolorWlosow.blond);
        Human czlowiek2 = new Human("imie 2", 20, KolorOczu.niebieski, KolorWlosow.czarne);

        System.out.println("Czlowiek 1 " + czlowiek1.getImie() + " " + czlowiek1.wiek + " " + czlowiek1.getKolorOczu() + " " + czlowiek1.getKolorWlosow());
        System.out.println("Czlowiek 2 " + czlowiek2.getImie() + " " + czlowiek2.wiek + " " + czlowiek2.getKolorOczu() + " " + czlowiek2.getKolorWlosow());
    }
}
