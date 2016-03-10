package com.challenge.arrival;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TopicCounts")
public class TopicCount {

	private String topicName;
	private String topicCount;
	
	public TopicCount() {
		// TODO Auto-generated constructor stub
	}
	
	public TopicCount(String topicName, String topicCount) {
		super();
		this.topicName = topicName;
		this.topicCount = topicCount;
	}
	
	@XmlAttribute(name = "TopicName")
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	
	@XmlAttribute(name = "TopicCount")
	public String getTopicCount() {
		return topicCount;
	}
	public void setTopicCount(String topicCount) {
		this.topicCount = topicCount;
	}
	
	
}
