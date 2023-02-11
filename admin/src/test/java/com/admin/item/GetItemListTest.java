package com.admin.item;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.admin.dto.Criteria;
import com.admin.dto.ItemDTO;
import com.admin.service.ItemService;


@SpringBootTest
class GetItemListTest {

	@Autowired
	ItemService service;

	@Test
	void contextLoads() {
		System.out.println("item 정보 가져오기 테스트 시작---------------------------------------------------");
		Criteria cri=new Criteria();
		List<ItemDTO> list=null;
		list=service.getItemList(cri);
		for(ItemDTO o:list) {
			System.out.println(o);
		}
		System.out.println("item 정보 가져오기 끝---------------------------------------------------");
	}

}
