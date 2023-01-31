public class Main {
  public static void main(String[] args) {
    String input = "https://www.southhills.edu:8080/index.html";
    LinkAndPort linkAndPort = new LinkAndPort(input);
    System.out.println("Protocol: " + linkAndPort.getProtocol());
    System.out.println("Link: " + linkAndPort.getLink());
    System.out.println("Port: " + linkAndPort.getPort());
    System.out.println("Page: " + linkAndPort.getPage());
    System.out.println("Default Port: " + linkAndPort.getDefaultPort());
  }
}
