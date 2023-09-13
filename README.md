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

## Spring Security

### Spring Security 의 내부 구조
- SecurityContextHolder
  - SecurityContextHolder 는 SecurityContext 를 제공하는 static 메서드(getContext) 를 지원합니다.
- SecurityContext
  - SecurityContext 는 접근 주체와 인증에 대한 정보를 담고 있는 Context 입니다.
  - 즉, Authentication 을 담고 있습니다.
- Authentication
  - Principal 과 GrantAuthority 를 제공합니다.
  - 인증이 이루어 지면 해당 Authentication 이 저장됩니다.
- Principal
  - 유저에 해당되는 정보입니다.
  - 대부분의 경우, Principal 로 UserDetails 를 반환합니다.
- GrantAuthority
  - ROLE_ADMIN, ROLE_USER 등 Principal 이 가지고 있는 권한을 나타냅니다.
  - prefix 로 'ROLE_' 이 붙습니다.
  - 인증 이후에 인가를 할 때 사용합니다.
  - 권한은 여러 개일 수 있기 때문에 Collection<GrantedAuthority> 형태로 제공합니다.
  - > ex) ROLE_DEVELOPER, ROLE_ADMIN