package com.arianit.RAG_IMPL;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RagImplApplication {

	public static void main(String[] args) {
		SpringApplication.run(RagImplApplication.class, args);
	}

	@Bean
	public ChatClient openAiChatClient(OpenAiChatModel model) {
		return ChatClient.create(model);
	}

	@Bean
	public ChatClient ollamaChatModel(OllamaChatModel model) {
		return ChatClient.create(model);
	}

}
