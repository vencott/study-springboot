package com.vencott.dev.springboot.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name); // assertj라는 테스트 검증 라이브러리의 검증 메소드
        assertThat((dto.getAmount())).isEqualTo(amount); // 검증 대상을 메소드 인자로 받고, 메소드 체이닝으로 isEqualTo 사용
    }
}
