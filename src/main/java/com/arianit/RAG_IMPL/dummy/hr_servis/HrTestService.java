package com.arianit.RAG_IMPL.dummy.hr_servis;

import org.springframework.stereotype.Service;

@Service
public class HrTestService {
    public HrResponse getUser(){
        return new HrResponse(23,"Arianit","Likaj");
    }
}
