package com.diosaraiva.springkafka.longmessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

public class LongMessageProducer {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@Value(value = "${long.message.topic.name}")
	private String topicName;

	public void sendMessage(String message) {
		kafkaTemplate.send(topicName, message);
		System.out.println("Long message Sent");
	}
}