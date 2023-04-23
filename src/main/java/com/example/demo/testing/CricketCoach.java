package com.example.demo.testing;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach{
	
	@Override
	public String traing() {
		return "Practice fast bowling 30 minutes";
	}
	
}



