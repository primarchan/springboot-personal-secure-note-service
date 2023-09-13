# Spring Security 기반 개인 보안 노트 서비스 프로젝트

## OUTLINE
- Spring Security 가 필요한 상황을 경험해 보고 직접 구현
- 구현 내용을 토대로 Spring Security 아키텍처를 이해

## REQUIREMENTS
- 사용자는 본인의 노트(게시글)만 저장하고 삭제하고 조회 가능
- 다른 사용자의 노트 조회 불가
- 관리자는 관리 차원에서 사용자들의 노트 제목 목록은 조회할 수 있지만 내용 조회 불가
- 관리자는 공지사항을 작성할 수 있고, 일반 사용자들은 공지사항 조회 가능

## TECH STACK
- Java 11
- Spring Boot
- Spring Security
- Spring Data JPA
- Thymeleaf
- Lombok
- H2
- Gradle