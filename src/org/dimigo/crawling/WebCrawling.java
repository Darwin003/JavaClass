package org.dimigo.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class WebCrawling {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://comic.naver.com/webtoon/weekday.nhn").get();
//            System.out.println(doc.html());
            Elements element = doc.select("[id=realTimeRankFavorite]").select("li").select("a");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
