package com.carousell.website;

public class Topic {

	int id;
	String topicName;
	int upVotes;
	int downVotes;

	public Topic() {
		super();
	}

	public Topic(int id, String topicName, int upVotes, int downVotes) {
		super();
		this.id = id;
		this.topicName = topicName;
		this.upVotes = upVotes;
		this.downVotes = downVotes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public int getUpVotes() {
		return upVotes;
	}

	public void setUpVotes(int upVotes) {
		this.upVotes = upVotes;
	}

	public int getDownVotes() {
		return downVotes;
	}

	public void setDownVotes(int downVotes) {
		this.downVotes = downVotes;
	}
}