package com.carousell.website;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TopicService {
	static HashMap<Integer, Topic> topicIdMap = getTopicIdMap();

	public TopicService() {
		super();

		if (topicIdMap == null) {
			topicIdMap = new HashMap<Integer, Topic>();
			// Creating some object of topics while initializing
			Topic carousellTopic = new Topic(1,
					"Carousell is a mobile and online consumer to consumer marketplace for buying and selling new and secondhand goods. It is headquartered in Singapore.",
					0, 0);
			Topic facebookTopic = new Topic(4,
					"Facebook is an American for-profit corporation and an online social media and social networking service based in Menlo Park, California.",
					0, 0);
			Topic amazonTopic = new Topic(3,
					"Amazon.com, also called Amazon, is an American electronic commerce and cloud computing company that was founded on July 5, 1994, by Jeff Bezos and is based in Seattle, Washington.",
					0, 0);
			Topic flipkartTopic = new Topic(2,
					"Flipkart is an electronic commerce company headquartered in Bangalore, Karnataka. It was founded in October 2007 by Sachin Bansal and Binny Bansal.",
					0, 0);

			topicIdMap.put(1, carousellTopic);
			topicIdMap.put(4, facebookTopic);
			topicIdMap.put(3, amazonTopic);
			topicIdMap.put(2, flipkartTopic);
		}
	}

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<Topic>(topicIdMap.values());
		Collections.sort(topics);
		int fromIndex = 1;
		int toIndex = topics.size();
		if (topics.size() > 20)
			toIndex = 20;

		if (fromIndex == toIndex)
			return topics;
		else
			return topics.subList(0, toIndex);
	}

	public static HashMap<Integer, Topic> getTopicIdMap() {
		return topicIdMap;
	}

	public Topic addTopic(Topic Topic) {
		Topic.setId(getMaxId() + 1);
		topicIdMap.put(Topic.getId(), Topic);
		return Topic;
	}

	public Topic updateTopic(Topic topic) {
		if (topic.getId() <= 0)
			return null;
		topicIdMap.put(topic.getId(), topic);
		return topic;
	}

	public static int getMaxId() {
		int max = 0;
		for (int id : topicIdMap.keySet()) {
			if (max <= id)
				max = id;
		}
		return max;
	}
}