package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.ChuckNorrisJokeServiceImpl;
import guru.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisQuotesController {
    private final JokeService chuckNorrisQuotesService;

    public ChuckNorrisQuotesController(ChuckNorrisJokeServiceImpl chuckNorrisQuotesService) {
        this.chuckNorrisQuotesService = chuckNorrisQuotesService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke", chuckNorrisQuotesService.getJoke());
        return "jokes/index";
    }
}
