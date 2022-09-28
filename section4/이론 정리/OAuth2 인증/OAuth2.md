# OAuth2
보안된 리소스에 접근하기 위해 클라이언트에게 권한을 제공하는 프로세스를 단순화하는 프로토콜 중 한 방법.

# OAuth2 workflow
1. User가 외부 계정으로 어플리케이션에 접근 요청
2. 어플리케이션에서 외부 사이트에 인증 요청
3. 외부 사이트에서 User 인증
4. 외부 사이트에서 어플리케이션에 인증 및 접근 권한 정보 전달(토큰으로 해당 데이터 저장)

# OAuth2 주요 용어
- Resource Owner : 엑세스 중인 리소스의 유저
- Resource server : 클라이언트의 요청을 수락하고 응답할 수 있는 서버
- Authorization server : Resource server가 엑세스 토큰을 발급받는 서버
- Authorization grant : 클라이언트가 엑세스 토큰을 얻을 때 사용하는 자격 증명(방법)
- Authorization code : 엑세스 토큰을 발급 받기 전에 필요한 코드
