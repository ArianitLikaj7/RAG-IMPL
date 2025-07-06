package com.arianit.RAG_IMPL.dummy.intent_classification;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class IntentClassificationService {
    private final ChatClient chatClient;

    public IntentClassificationService(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    public String classify(String text) {
        String prompt = "Given the following text, classify the user intent as either HR or CASH. " +
                "Respond only with one of these words: HR or CASH.\nText: " + text;
        return chatClient.prompt()
                .user(prompt)
                .call()
                .content()
                .trim();
    }
}
