import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        try {
            // Specify the URL to scrape
            String url = "https://www.fresnocitycollege.edu/";

            // Fetch and parse the HTML document from the URL
            Document document = Jsoup.connect(url).get();




            // Extract all the links and their titles from the document
            Elements links = document.select("a[href]");
            for (Element link : links) {
                // Extract the link and the title
                String linkHref = link.attr("abs:href");
                String linkText = link.text();
                System.out.println("Link: " + linkHref + ", Text: " + linkText);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}