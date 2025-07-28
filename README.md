# 🖥️ 프로젝트 소개
영화관 사이트를 참고하여 "cinema"와 "broadcast"의 결합으로 영화 정보와 편리한 예매 기능을 제공하는 웹 애플리케이션을 개발하였습니다.

<br/>

## 📆 개발 기간
* 24.05.13일 ~ 24.07.04일

### 👨‍👩‍👦 프로젝트 구성원 - 4명
- **팀장**: 김소연 - 회원가입, 로그인, 관리자, 결제 페이지 개발
- **팀원1**: 조혜령 - 기획서 작성, 퍼블리싱, 좌석 선택 및 상영시간표 구현
- **팀원2**: 김우영 - TMDB.API를 이용한 영화 정보 페이지 개발
- **팀원3**: 이병훈 - TMDB.API를 이용한 영화 정보 페이지 및 고객센터 구현

## ⚙️ 사용된 기술
- Java, Spring Boot, Spring Data JPA, Spring Security, MySQL
- CSS3, HTML5, BOOTSTRAP, JQUERY, Thymeleaf

<br/>

### ERD
<img width="1326" height="625" alt="image" src="https://github.com/user-attachments/assets/492f7f8c-a04f-4736-8eb8-0da53b37d641" />

## 💡 담당기능

### 마이페이지
* 리뷰관리

### 메인 페이지

<table>
  <tr>
    <td width="50%">
    <img width="1749" height="939" alt="image" src="https://github.com/user-attachments/assets/48677a94-18fd-4d32-9f67-dc0ff7cb6955" />
    <img width="1230" height="708" alt="image" src="https://github.com/user-attachments/assets/6f5c4bdb-4374-4d66-8ba5-4af10361e004" />
    <img width="1903" height="944" alt="image" src="https://github.com/user-attachments/assets/4365826c-b03b-4ed2-a01d-40046ebc4205" />
    </td>
    <td width="50%">
      <p><b>메인화면</b></p>
      <ul>
        <li>**TMDB API 데이터 수집** </li>
            <li>스케줄러를 사용하여 12시간마다 TMDB API 8개를 호출하여 최신 영화 데이터를 업데이트</li>
        
        <li>Redis를 활용한 캐싱: 외부 API에서 수집한 데이터는 Redis에 저장하여 캐싱을 구현하여 불필요한 쿼리 발생을 방지, 메인페이지 로딩속도 개선</li>
        <li>직관적인 정보 제공: 인기 영화, 현재 상영작, 상영 예정작 등 다양한 영화 정보 제공</li>
      </ul>
    </td>
  </tr>
</table>

* Youtube API 연동
* 메인 포스터(영화) 이미지 슬라이드(CSS)
* 영화 검색

### 영화 차트
* 현재 상영작
* 인기순 상영작
* 상영 예정작

### 영화 상세 페이지
* 영화 상세
* 영화 관람평 작성 및 평점
* 찜목록
* 카카오톡 공유하기

### 이벤트, 공지사항
* 글 작성, 읽기, 수정, 삭제(CRUD)

### 고객센터
* 이메일 문의, 1:1 채팅 및 공지사항
* 글 작성, 읽기, 수정, 삭제(CRUD)

### 관리자 페이지
* 아이디: 1@admin.com 비밀번호: adminpw
* 영화관 추가(도시명/ 동명/ 지점)
* 영화 추가(상영시간 및 상영관 설정) 및 삭제
* 이벤트, 공지사항 CRUD작업
* 1대 1 채팅, 문의 답변

## 아키텍쳐  
<img width="649" height="389" alt="image" src="https://github.com/user-attachments/assets/5ddc1bba-4a8d-4b32-8abc-580c39da42cc" />

## 사용 방법

### 1:1 채팅 문의 시 로그인 방법
1. 사용자는 일반 사용자 계정으로 로그인한 상태에서 문의를 진행할 수 있습니다.
2. 관리자는 다른 브라우저에서 관리자 계정으로 로그인하여 어드민 페이지를 열어 놓습니다.
3. 이렇게 두 개의 브라우저에서 각각 일반 사용자와 관리자가 로그인함으로써, 사용자가 선택한 카테고리에 맞는 관리자에게 실시간으로 메시지가 전달되고, 즉각적인 소통이 가능합니다.

### 문의 방법
1. 카테고리 선택 (예: "예매")
2. 지정된 관리자에게 문의 전송 (예매: 1@admin.com, 판매: 2@admin.com, 행사: 3@admin.com, 기타: 4@admin.com)

### 📧 이메일 기능 설정
- 구성 편집: 이메일 기능을 사용하기 위해 환경변수로 네이버 아이디와 비밀번호를 설정해야 합니다.
    - `adminPassword= ; adminEmail=`

### 🚫 소셜 로그인
- client-id, client-secret와 같은 민감한 정보가 포함되어 있어서 소셜 로그인은 비활성화했습니다.
  
<br/>

## 📊 데이터 관리
- **영화 데이터**: 외부 API를 통해 자동으로 가져오므로, 별도로 관리자가 생성할 필요는 없습니다.
- **예매, 스낵, 이벤트, 공지사항**: 데이터는 관리자가 직접 등록해야 하며, 관련 기능은 관리자 페이지에서 처리할 수 있습니다.
- **1:1 채팅 이메일 문의**: 사용자가 문의를 하면 해당 내용이 관리자 페이지에 표시됩니다. 관리자는 이를 통해 사용자와 소통할 수 있습니다.

