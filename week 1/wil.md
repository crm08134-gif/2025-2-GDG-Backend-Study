  클라이언트가 요청을 보내고 서버가 응답을 하는 구조가 웹이다. 이때 사용되는 규칙은 HTTP이다. 
URL은 자원의 위치를 나타내는 주소이고 host, port, path, query로 이루어져있다. 
HTTP의 주요메서드는 조회하는 get, 추가 및 등록하는 post, 교체 및 생성하는 put, 수정하는 patch, 삭제하는 delete가 있다. 
프론트엔드는 사용자에게 보여지는 사이트의 디자인등 인터페이스를 담당하고, 백엔드는 뒤편의 데이터를 저장 및 관리한다. 
API는 클라이언트와 서버가 소통할 때 정해놓은 규칙과 기능의 목록이다. HTTP 메서드와 URI로 API 명세서를 작성한다.
  
상품 정보 등록
HTTP Method : POST
URI : /products
상품 목록 조회
HTTP Method : GET
URI : /products
개별 상품 정보 상세 조회
HTTP Method : GET
URI : /products/{productId}
상품 정보 수정
HTTP Method : PATCH
URI : /products/{productId}
상품 삭제
HTTP Method : DELETE
URI : /products/{productId}

주문 정보 생성
HTTP Method : PUT
URI : /orders
주문 목록 조회
HTTP Method : GET
URI : /orders
개별 주문 정보 상세 조회
HTTP Method : GET
URI : /orders/{orderId}
주문 취소
HTTP Method : DELETE
URI : /orders/{orderId}
