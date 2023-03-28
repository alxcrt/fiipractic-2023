package com.fiipractic.battle.controller;

import com.fiipractic.battle.service.BattleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BattleController {

    private final BattleService battleService;

    public BattleController(BattleService battleService) {
        this.battleService = battleService;
    }

    @GetMapping(value = "/battle")
    public String battle(Model model){
        battleService.battle(model);
        return "battle";
    }

}
