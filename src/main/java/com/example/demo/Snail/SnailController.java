package com.example.demo.Snail;

import com.example.demo.Snail.Model.SnailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SnailController {

    @Autowired
    SnailService snailService;

    @PostMapping("/snail/traveller")
    private void snailTraveledDistance(@RequestBody Snail snail){
        snail.setTotalDistance(((snail.getTowerHigh()/snail.getHighOfStep())*snail.getLengthOfStep())+snail.getTowerHigh());
        snailService.saveSnailTraveller(snail);
    }
}
