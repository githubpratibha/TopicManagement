package com.carousell.website;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/topics")
public class TopicController {

	TopicService topicService = new TopicService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Topic> getTopics() {

		List<Topic> listOfTopics = topicService.getAllTopics();
		return listOfTopics;
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Topic updateTopic(Topic topic) {
		return topicService.updateTopic(topic);

	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Topic addTopic(Topic Topic) {
		return topicService.addTopic(Topic);
	}
}