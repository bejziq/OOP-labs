package org.example.Week12.Lectures;
import java.io.*;
import java.net.*;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://jsonbin.io/quick-store/6578205fdc74654018821d0c

public class NetworkProgramming {
    public static void main(String[] args) throws IOException {
        readURL("https://klix.ba"); //URL is ok, protocol used is https, and the authorityklix.ba
        readPageData("https://klix.ba");

    }

    public static void readURL(String urlAddress) { // ovo samo cita URL i nista vise
        try {
            URL url = new URL(urlAddress);
            System.out.println("URL is ok, protocol used is " + url.getProtocol() + ", and the authority" + url.getAuthority());
        } catch (MalformedURLException e) {
            System.out.println("String " + urlAddress + " is not a valid URL");
        }
    }

    public static void readPageData(String urlAddress) throws IOException {
        URL url = new URL(urlAddress);
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8));
        String content = "";
        String line = null;
        while ((line = inputStream.readLine()) != null)
            content = content + line;

        String pattern = "<h2[^>]*>(.*?)</h2>";

        Pattern regex = Pattern.compile(pattern, Pattern.DOTALL);
        Matcher matcher = regex.matcher(content);

        while (matcher.find()) {
            String h2Content = matcher.group(1);
            System.out.println("Matched h2 content: " + h2Content);
        }
    }

}
