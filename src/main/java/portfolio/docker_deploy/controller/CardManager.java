package portfolio.docker_deploy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import portfolio.docker_deploy.entities.Card;
import portfolio.docker_deploy.repository.CardRepository;

import java.util.List;

@RestController
public class CardManager {
    @Autowired
    private CardRepository cardRepository;
    @GetMapping("/listAll")
    public List<Card> listAll () {
        return cardRepository.findAll();
    }
    @GetMapping("/listId/{id}")
    public Card getCardById (@PathVariable Long id){
        return cardRepository.findById(id).get();
    }
    @PostMapping
    public Card createCard(@RequestBody Card card) {
        return cardRepository.save(card);
    }

}
