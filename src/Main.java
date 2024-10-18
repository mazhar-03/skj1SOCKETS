public class Main {
    public static void main(String[] args) {
        //1
        TCPMessage client2 = new TCPMessage("10.22.26.17", 9005);
        System.out.println(client2.getMessage());

        //2
        TCP2 client3 = new TCP2("10.22.26.17", 9006);
        System.out.println(client3.getMessage());
        client3.close();

        //3
        TCPClient client = new TCPClient("10.22.26.17", 9007);
        System.out.println(client.getMessage());
        client.sendMessage("Hello there");
        System.out.println(client.getMessage());
        client.close();
    }
}
