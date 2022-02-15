package com.vencott.dev.springboot.domain.posts;

import com.vencott.dev.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// 클래스 내 모든 필드의 Getter 메소드 자동 생성
@Getter
// 기본 생성자 자동 추가
@NoArgsConstructor
// 테이블과 링크될 클래스임을 나타냄
@Entity
public class Posts extends BaseTimeEntity {

    // 해당 클래스의 PK
    @Id
    // PK의 생성 규칙, 스프링 부트 2.0에선 GenerationType.IDENTITY 옵션을 추가해야만 auto_increment
    // PK는 웬만하면 Long 타입의 auto_increment 추천
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 테이블의 컬럼(생략 가능), 기본값 이외 추가로 변경할 옵션 기입
    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    // 해당 클래스의 빌더 패턴 클래스 생성
    // 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}