package com.gst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gst.entity.Gst;

public interface GstRepository extends JpaRepository<Gst, Integer> {
@Query(value="select d.taxpercentage from Gst d where d.hsn=:hsn")
public Integer gettax(long hsn);
}
