package org.apache.lucene.demo.mytest.Analyzer;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.core.LetterTokenizer;
import org.apache.lucene.analysis.core.LowerCaseFilter;
import org.apache.lucene.analysis.core.StopAnalyzer;
import org.apache.lucene.analysis.core.StopFilter;

import java.io.Reader;
import java.util.Set;

/**
 * 描述:
 * StopAnalyzer2
 *
 * @Author HeFeng
 * @Create 2018-10-24 15:25
 */
public class StopAnalyzer2 extends Analyzer {
    private Set stopWords;
    public StopAnalyzer2() {
        stopWords = StopAnalyzer.ENGLISH_STOP_WORDS_SET;
    }

    @Override
    protected TokenStreamComponents createComponents(String fieldName) {
        return null;
    }

    public StopAnalyzer2(String[] stopWords) {
        this.stopWords = StopFilter.makeStopSet(stopWords);
    }
}