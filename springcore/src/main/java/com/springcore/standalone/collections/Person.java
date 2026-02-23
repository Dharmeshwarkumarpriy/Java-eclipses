package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

	private List<String> friends;
	private Map<String, Integer> feestructure;
	private Properties properties;
	private Map<String, Integer> trees;
	private List<String> dosts;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getFeestructure() {
		return feestructure;
	}

	public void setFeestructure(Map<String, Integer> feestructure) {
		this.feestructure = feestructure;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	public Map<String, Integer> getTrees() {
		return trees;
	}

	public void setTrees(Map<String, Integer> trees) {
		this.trees = trees;
	}

	public List<String> getDosts() {
		return dosts;
	}

	public void setDosts(List<String> dosts) {
		this.dosts = dosts;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feestructure=" + feestructure + "]";
	}

}
