package com.project.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

	@Autowired
	NotificationService notificationService;

	@PostMapping("/notify/user")
	public ResponseEntity<Account> useradded(@RequestBody Account account) {
		notificationService.notifyUser(account);
		return new ResponseEntity<Account>(HttpStatus.OK);
	}
}
