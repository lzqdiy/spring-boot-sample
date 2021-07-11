package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.User;

@SpringBootApplication
public class SpringSampleApplication {

	public static void main(String[] args) {
//		var ids = new String[]{
//			      "JST",
//			      "Asia/Tokyo",
//			      "Japan",
//			      "GMT+0900", // カスタム・タイムゾーンIDで GMT+0900 を指定
//			    };
//
//			    Arrays.stream(ids).forEach(
//			      id -> {
//			        var timeZone = TimeZone.getTimeZone(id);
//			        // java.util.TimeZone
//			        System.out.println("Time zone ID: " + timeZone.getID());
//			        System.out.println("Short name: " + timeZone.getDisplayName(timeZone.useDaylightTime(), TimeZone.SHORT));
//			        System.out.println("Long name: " + timeZone.getDisplayName(timeZone.useDaylightTime(), TimeZone.LONG));
//			        System.out.println("Offset: " + (double) timeZone.getRawOffset() / (60 * 60 * 1000));
//			        // java.time.ZoneId
//			        System.out.println("Time-zone ID: " + timeZone.toZoneId().getId());
//			        System.out.println();
//			      }
//			    );
		SpringApplication.run(SpringSampleApplication.class, args);
		User u=new User();
	}

}
