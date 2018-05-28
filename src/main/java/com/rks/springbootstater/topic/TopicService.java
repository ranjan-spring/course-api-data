package com.rks.springbootstater.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topocrepository;
	
	public List<Topic> getAllTopics(){
		List<Topic> topices =new ArrayList<>();
		topocrepository.findAll().forEach(topices :: add);
		return topices;
	}
	
	public Optional<Topic> getTopic(String id) {
		return topocrepository.findById(id);
	}

	public void addTpopic(Topic topic) {
		topocrepository.save(topic);
	}

	public void updateTpopic(Topic topic, String id) {
		topocrepository.save(topic);
	}

	public void deleteTopic(String id) {
		topocrepository.deleteById(id);
	}
}
