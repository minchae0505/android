package com.example.recyclertest2; // com.example.recyclertest2 패키지에 속해 있음

public class MainData { // MainData 클래스 정의 시작
    private String tv1; // 첫 번째 텍스트 뷰의 데이터를 저장할 변수
    private String tv2; // 두 번째 텍스트 뷰의 데이터를 저장할 변수

    // 생성자: 두 개의 문자열을 받아서 tv1과 tv2를 초기화
    public MainData(String tv1, String tv2) {
        this.tv1 = tv1; // tv1 변수 초기화
        this.tv2 = tv2; // tv2 변수 초기화
    }

    // tv1 값을 반환하는 getter 메서드
    public String getTv1() {
        return tv1; // tv1 값을 반환
    }

    // tv1 값을 설정하는 setter 메서드
    public void setTv1(String tv1) {
        this.tv1 = tv1; // tv1 값을 설정
    }

    // tv2 값을 반환하는 getter 메서드
    public String getTv2() {
        return tv2; // tv2 값을 반환
    }

    // tv2 값을 설정하는 setter 메서드
    public void setTv2(String tv2) {
        this.tv2 = tv2; // tv2 값을 설정
    }
}
