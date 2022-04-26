package com.project.notification;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
	private int accId;
	private String name;
	private float accBalance;
	private String email;
	private String message;

}
