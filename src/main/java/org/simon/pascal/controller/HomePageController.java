/**
 *
 */
package org.simon.pascal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author simon.pascal.ngos
 *
 */
@Controller
public class HomePageController {

	@GetMapping("/")
	public String home() {
		return "redirect:/index.htm";
	}

	@GetMapping("index.htm")
	public String index() {
		return "index";
	}
}
