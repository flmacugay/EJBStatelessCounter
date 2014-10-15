package com.mac.stateless;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class BeanCounter
 */
@Stateless(mappedName="BeanCounter")
public class BeanCounter implements BeanCounterRemote {

	private int count=0;
    /**
     * Default constructor. 
     */
    public BeanCounter() {
    }

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void addCount() {
		count++;
	}

	@PostConstruct
	public void init() {
		System.out.println("init method called by postconstruct annotation");
	}
	
	@PreDestroy
	public void destory() {
		System.out.println("destroy method called by predestroy annotation");
	}
	

}
