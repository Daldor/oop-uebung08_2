/*
package ueb08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class TweetSammlung_class implements TweetSammlung {
    @Override
    public void setStopwords(File file) throws FileNotFoundException {

    }

    @Override
    public void ingest(String tweet) {
        List<String> tweetList = new LinkedList<>();
        Map<String, Integer> tweetMap = new TreeMap<>();

        tweetList.add(tweet);

        for(String s: tweetList){
            int z = 0;

            if(tweetMap.containsKey(s)){
                z = tweetMap.get(s);
            }
            tweetMap.put(s, z+1);
        }

        TweetSammlung.tokenize(tweet);
    }

    @Override
    public Iterator<String> vocabIterator(Map<String, Integer> m) {

        return null;
    }

    @Override
    public Iterator<String> topHashTags() {
        return null;
    }

    @Override
    public Iterator<String> topWords() {
        return null;
    }

    @Override
    public Iterator<Pair> topTweets() {
        return null;
    }

    public TweetSammlung_class create(){
        return new TweetSammlung_class();
    }
}


 */