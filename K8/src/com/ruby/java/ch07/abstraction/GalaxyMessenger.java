package com.ruby.java.ch07.abstraction;

public class GalaxyMessenger implements Messenger, workFile{

	public String getMessage() {
		return "galax";
	}

	public void setMessage(String msg) {
		System.out.println("galaxy에서 메시지를 설정합니다 : " + msg);

	}

	public void changekeyboard() {
		System.out.println("키보드아이콘 터치후 변경합니다.");
	}

	@Override
	public void fileUpload() {
		System.out.println("file을 다운로드 합니다.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fileDownload() {
		System.out.println("file을 업로드 합니다.");
		// TODO Auto-generated method stub
		
	}
	
}
