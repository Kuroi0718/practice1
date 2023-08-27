package practice1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

	@GetMapping("/test01")
	public ResponseEntity<String> getData() {
		return ResponseEntity.ok("Hello Shitty World");
	}

}
