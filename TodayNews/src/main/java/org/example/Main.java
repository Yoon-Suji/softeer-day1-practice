package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // 네이버 뉴스 IT/과학 헤드라인 뉴스 페이지
        String url = "https://news.naver.com/main/main.naver?mode=LSD&mid=shm&sid1=105";

        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Elements elements = doc.select(".sh_text_headline");
        for(Element element: elements) {
            System.out.println(element.text());
        }
    }
}