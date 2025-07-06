package com.arianit.RAG_IMPL.dummy.intent_classification;

import com.arianit.RAG_IMPL.dummy.hr_servis.HrTestService;
import com.arianit.RAG_IMPL.dummy.cash_advacne.CashAdvance;
import org.springframework.web.bind.annotation.*;

@RestController
public class IntentController {

    private final IntentClassificationService intentService;
    private final HrTestService hrTestService;
    private final CashAdvance cashAdvance;

    private HumanizeService humanizeService;

    public IntentController(IntentClassificationService intentService, HrTestService hrTestService, CashAdvance cashAdvance, HumanizeService humanizeService) {
        this.intentService = intentService;
        this.hrTestService = hrTestService;
        this.cashAdvance = cashAdvance;
        this.humanizeService=humanizeService;
    }


    @GetMapping("/intent")
    public String handle(@RequestParam String text) {
        String intent = intentService.classify(text);

        Object data;
        switch (intent) {
            case "HR": data = hrTestService.getUser(); break;
            case "CASH": data = cashAdvance.getResponse(); break;
            default: return "Intent not recognized!";
        }

        String json = toJson(data);
        String result = humanizeService.makeHuman(json);

        return result;
    }

    private String toJson(Object obj) {
        try {
            return new com.fasterxml.jackson.databind.ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            return obj.toString();
        }
    }
}
