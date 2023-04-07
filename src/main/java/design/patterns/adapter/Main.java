package design.patterns.adapter;

public class Main {

    public static void main(String[] args) {

        ContinentalDevice radio = new ContinentalDevice() {

            @Override
            public void powerOn() {
                System.out.println("Music's playing");
            }
        };

        ContinentalSocket continentalSocket = new ContinentalSocket();

        continentalSocket.plugIn(radio);


        UKDevice ukDevice = new UKDevice() {
            @Override
            public void powerOn() {
                System.out.println("English music");
            }
        };

        UKSocket ukSocket = new UKSocket();

        ukSocket.plugIn(ukDevice);

    }
}
