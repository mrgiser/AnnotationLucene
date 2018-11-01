package org.apache.lucene.demo.mytest.tokenStream;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.core.WhitespaceAnalyzer;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;

import java.io.IOException;

/**
 * 描述:
 * TestTokenFilter
 *
 * @Author HeFeng
 * @Create 2018-10-10 15:04
 */
public class TestTokenFilter {

    public static void main(String[] args) throws IOException {
        String text = "Hi, Dr Wang, Mr Liu asks if you stay with Mrs Liu yesterday!";
        Analyzer analyzer = new WhitespaceAnalyzer();
        TokenStream tokenStream = analyzer.tokenStream("text", text);
        CourtesyTitleFilter filter = new CourtesyTitleFilter(tokenStream);
        CharTermAttribute charTermAttribute = filter.addAttribute(CharTermAttribute.class);
        filter.reset();
        while (filter.incrementToken()) {
            System.out.print(charTermAttribute + " ");
        }
    }

}