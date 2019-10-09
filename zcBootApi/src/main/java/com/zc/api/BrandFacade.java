package com.zc.api;


import java.util.List;
/**
 * @author Dell
 */
public interface BrandFacade {
	/**
	 * 添加品牌
	 * @param dto
	 * @return
	 */
	Long create(BrandDTO dto);
	/**
	 * 列表查询品牌
	 * @param brandQueryDTO
	 * @return
	 */
	List<BrandDTO> queryList(BrandDTO brandQueryDTO);
}
