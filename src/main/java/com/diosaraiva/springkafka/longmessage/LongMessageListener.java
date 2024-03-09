package com.diosaraiva.springkafka.longmessage;

import org.springframework.kafka.annotation.KafkaListener;

public class LongMessageListener {
	@KafkaListener(topics = "${long.message.topic.name}", groupId = "longMessage", containerFactory = "longMessageKafkaListenerContainerFactory")
	public void listenGroupLongMessage(String message) {
		System.out.println("Received Message in group 'longMessage'");
	}
}