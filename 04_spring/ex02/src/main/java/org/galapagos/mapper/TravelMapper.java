package org.galapagos.mapper;

import java.util.List;

import org.galapagos.domain.BoardVO;
import org.galapagos.domain.Criteria;
import org.galapagos.domain.TravelVO;

public interface TravelMapper {
	public int getTotalCount(Criteria cri);
	
	// 페이지 목록 추출
	public List<TravelVO> getList(Criteria cri);

	public TravelVO read(Long no);
	
	// pk 추출 포함
	public void insert(TravelVO travel);
	
	public int update(TravelVO travel);	
	
	public int delete(Long no);
	
	
	
	
}









