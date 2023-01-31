import java.util.regex.Matcher;
import java.util.regex.Pattern;

class LinkAndPort {
  private String protocol;
  private String link;
  private String port;
  private String page;

  public LinkAndPort(String input) {
    String regex = "(^.*)://(.*):(\\d+)/(.*)";

    Pattern pattern = Pattern.compile(regex);

    Matcher matcher = pattern.matcher(input);

    if (matcher.find()) {
      protocol = matcher.group(1);
      link = matcher.group(2);
      port = matcher.group(3);
      page = matcher.group(4);
    }
  }

  public String getProtocol() {
    return protocol;
  }
  
  public String getLink() {
    return link;
  }

  public String getPort() {
    return port;
  }
