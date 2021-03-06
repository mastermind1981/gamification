package com.esfinge.gamification.annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.esfinge.gamification.processors.RemovePointsProcessor;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@GamificationProcessor(RemovePointsProcessor.class)
public @interface RemovePoints {
		int quantity();
		String name();
}
