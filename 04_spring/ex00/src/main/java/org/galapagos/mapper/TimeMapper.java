package org.galapagos.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	@Select("SELECT sysdate()")
    String getTime();
	
	String getTime2();
  
}
