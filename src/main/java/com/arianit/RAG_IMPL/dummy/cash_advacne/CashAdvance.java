package com.arianit.RAG_IMPL.dummy.cash_advacne;

import org.springframework.stereotype.Service;

@Service
public class CashAdvance {
    public CashAdvacneResponse getResponse() {
        return new CashAdvacneResponse("Accept");
    }
}
