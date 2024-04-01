package com.gst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.gst.dao.GstDao;
import com.gst.entity.Gst;
@Service
public class GstService {
	@Autowired
	GstDao gstdao;
	public String inserting( List<Gst> g) {
	    
	    return gstdao.inserting(g);
	}
	public List<Gst> finding(){
		return gstdao.finding();
	}
	public Integer gettax( long hsn) {
		return gstdao.gettax(hsn);
	}
}
