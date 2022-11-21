package com.easyzero.springboot;

import com.easyzero.springboot.web.dto.HelloResponseDto;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void TestLombok() {
        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
        assertThat(dto.getName()).isEqualTo(name);      // 검증 메소드 (assertj 라이브러리), 인자 - 검증하고 싶은 대상
        assertThat(dto.getAmount()).isEqualTo(amount);      // .isEqualTo() -> 메소드 체이닝 지원 (메소드 이어서 사용 = 메소드 체이닝), equal == true
    }
}
