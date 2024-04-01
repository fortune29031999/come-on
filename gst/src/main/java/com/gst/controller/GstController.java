package com.gst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gst.entity.Gst;
import com.gst.service.GstService;

@RestController
@RequestMapping("/gst")
public class GstController {
	@Autowired
	GstService gstserv;

	@PostMapping("/inserting")
	public String inserting(@RequestBody List<Gst> g) {

		return gstserv.inserting(g);
	}

	@GetMapping("/getting")
	public List<Gst> finding() {
		return gstserv.finding();
	}

	@GetMapping("/gettax/{hsn}")
	public Integer gettax(@PathVariable long hsn) {
		return gstserv.gettax(hsn);
	}

}
