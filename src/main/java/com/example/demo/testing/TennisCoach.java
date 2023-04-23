package com.example.demo.testing;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach{
	
	@Override
	public String traing() {
		return "Practice tennis 30 minutes";
	}

}
