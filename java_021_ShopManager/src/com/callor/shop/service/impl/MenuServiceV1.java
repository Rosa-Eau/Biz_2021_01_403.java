package com.callor.shop.service.impl;

import java.util.Scanner;

import com.callor.shop.service.MenuService;

public class MenuServiceV1 implements MenuService {

	private Scanner scan;
	private int intSelect;

	public MenuServiceV1() {
		scan = new Scanner(System.in);
	}

	@Override
	public Integer selectMenu() {
		System.out.println("===========================================");
		System.out.println("빛나라 쇼핑몰 2021");
		System.out.println("-------------------------------------------");
		System.out.println("1. 장바구니 상품 담기");
		System.out.println("2. 장바구니 전체 리스트 보기");
		System.out.println("3. 구매자별 장바구니 리스트 보기");
		System.out.println("QUIT. 끝내기");
		System.out.println("===========================================");

		while (true) {
			System.out.print("선택 >> ");
			String strSelect = scan.nextLine();
			if (strSelect.equalsIgnoreCase("QUIT")) {
				break;
			}

			try {
				intSelect = Integer.valueOf(strSelect);
				if (intSelect >= 1 && intSelect <= 3) {
					return intSelect;
				} else {
					System.out.println("존재하지 않는 요청입니다.");
				}
			} catch (Exception e) {
				System.out.println("존재하지 않는 요청입니다.");
			}
		}

		return null;
	}

}
