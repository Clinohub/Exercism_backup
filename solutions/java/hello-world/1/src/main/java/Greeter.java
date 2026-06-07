class Greeter {

    String getGreeting() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        Greeter greet = new Greeter();
        System.out.println(greet.getGreeting());
    }

}
