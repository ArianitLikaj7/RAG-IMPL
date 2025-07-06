package com.arianit.RAG_IMPL.dummy.intent_classification;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class HumanizeService {
    private final ChatClient chatClient;

    public HumanizeService(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    public String makeHuman(String jsonData) {
        String prompt = "Convert the following JSON to a friendly, human-readable summary in Albanian.\n\n" +
                "JSON: " + jsonData + "\n\n" +
                "Summary:";

        return chatClient.prompt()
                .user(prompt)
                .call()
                .content()
                .trim();
    }
}
