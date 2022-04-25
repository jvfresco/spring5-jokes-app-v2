package guru.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeServiceImpl implements JokeService{
    @Autowired
    private ChuckNorrisQuotes chuckNorrisQuotes;

    //public ChuckNorrisJokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
    //    this.chuckNorrisQuotes = chuckNorrisQuotes;
    //}

    @Override
    public String getJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
