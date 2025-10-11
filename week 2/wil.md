스프링 계층형 아키텍처에는 Browser, Controller, Service, DAO, DB가 있으며, DAO까지 4개의 요소는 DTO가 연결하고 DAO와 DB는 Entity가 연결한다.
HTTP는 header, request body, response body로 구성되어있다.
Service Layer에는 controller와 repository의 중간 다리 역할을 하며, 비즈니스 로직이 담긴다.
스프링 컨테이너안에 공용 객체인 스프링 빈들이 저장되어 있고, 스프링 빈이 다른 빈을 요구하는 경우 프레임워크가 가져다 준다.
Spring은 Java 백엔드 애플리케이션 프레임워크이고, Spring Boot는 Spring을 쉽게 쓸 수 있게 해주는 도구이다.