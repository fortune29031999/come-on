package com.gst.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.gst.entity.Gst;
import com.gst.repository.GstRepository;
@Repository
public class GstDao {
	@Autowired
	GstRepository gstrepo;
	public String inserting( List<Gst> g) {
	    gstrepo.saveAll(g);
	    return "inserted sucessfully";
	}
	public List<Gst> finding(){
		return gstrepo.findAll();
	}
	public Integer gettax( long hsn) {
		return gstrepo.gettax(hsn);
	}
}
