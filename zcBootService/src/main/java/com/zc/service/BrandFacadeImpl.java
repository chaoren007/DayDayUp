package com.zc.service;

import com.zc.api.BrandDTO;
import com.zc.api.BrandFacade;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandFacadeImpl implements BrandFacade {

	@Override
	public List<BrandDTO> queryList(BrandDTO brandQueryDTO) {
		List<BrandDTO> brandToList = new ArrayList<>();
		BrandDTO dto = new BrandDTO();
		dto.setId(1L);
		dto.setBrandName("品牌名称");
		brandToList.add(dto);
		return brandToList;
	}

	@Override
	public Long create(BrandDTO dto) {
		return 1L;
	}
}
