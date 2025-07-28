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

## 어드민 
### 메인 페이지
<table>
  <tr>
    <td width="50%">
      <img width="1749" height="939" alt="image" src="https://github.com/user-attachments/assets/48677a94-18fd-4d32-9f67-dc0ff7cb6955" />
      <img width="1230" height="708" alt="image" src="https://github.com/user-attachments/assets/6f5c4bdb-4374-4d66-8ba5-4af10361e004" />
      <img width="1903" height="944" alt="image" src="https://github.com/user-attachments/assets/4365826c-b03b-4ed2-a01d-40046ebc4205" />
    </td>
    <td width="50%">
      <p><b>TMDB API 데이터 수집</b></p>
      <ul>
        <li>스케줄러를 사용해 12시간마다 TMDB API 8개를 호출하여 최신 영화 데이터를 업데이트합니다.</li>
      </ul>
      <p><b>Redis를 활용한 캐싱</b></p>
      <ul>
        <li>외부 API 데이터를 Redis에 저장하여 불필요한 쿼리 발생을 방지하고, 메인 페이지 로딩 속도를 개선합니다.</li>
      </ul>
      <p><b>직관적인 정보 제공</b></p>
      <ul>
        <li>인기 영화, 현재 상영작, 상영 예정작 등 다양한 영화 정보를 한눈에 제공합니다.</li>
      </ul>
    </td>
  </tr>
</table>

        
### 영화 차트
<div style="display: flex; gap: 10px;">
  <img width="330" alt="image1" src="https://github.com/user-attachments/assets/a300a663-6041-498e-9b77-8d51efa9785b" />
  <img width="330" alt="image2" src="https://github.com/user-attachments/assets/707d0516-b9b6-4bc6-80f0-8e970fa19443" />
  <img width="330" alt="image3" src="https://github.com/user-attachments/assets/85bb55be-de4a-45fd-b5f9-e28c412bb20c" />
</div>

### 영화 상세 페이지
<table>
  <tr>
    <td width="50%">
      <img width="721" height="771" alt="image" src="https://github.com/user-attachments/assets/45b6d20d-58ca-4a76-9cd6-5d0ef55b8ecc" />
      <img width="327" height="343" alt="image" src="https://github.com/user-attachments/assets/8a220f2b-1b25-4e03-baa4-af6e8610795e" />
    </td>
    <td width="50%">
      <p><b>영화에 대한 기본정보 제공</b></p>
      <ul>
        <li>제목, 개봉일자, 관람등급, 줄거리, 스틸컷, 상영시간, 장르 등</li>
      </ul>
      <p><b>찜하기</b></p>
      <ul>
        <li>찜 클릭 시 [마이페이지] - [나의 찜목록]추가</li>
      </ul>
      <p><b>공유하기</b></p>
      <ul>
        <li>카카오톡 API를 연동하여 현재 보고 있는 영화의 정보를 친구들에게 간편하게 공유</li>
      </ul>
    </td>
  </tr>
</table>
<table>
  <tr>
    <td width="50%">
      <img width="1169" height="232" alt="image" src="https://github.com/user-attachments/assets/7fdd1aa6-8014-4313-aabf-bff85f2617d1" />
     <img width="723" height="110" alt="image" src="https://github.com/user-attachments/assets/c6b42464-32b8-4082-b964-70f4814c62f8" />
    </td>
    <td width="50%">
      <p><b>리액션과 관람평</b></p>
      <ul>
        <li>관람한 영화에 한해서 1회 작성 가능</li>
      </ul>
    </td>
  </tr>
</table>


### 이벤트, 공지사항
<table>
  <tr>
    <td width="50%">
     <img width="401" height="451" alt="image" src="https://github.com/user-attachments/assets/2d691e58-bff0-4e92-9deb-2c00ff607b5c" />
     <img width="697" height="278" alt="image" src="https://github.com/user-attachments/assets/bf8d5d3e-abcd-47fa-ab26-139e17ae5033" />
    </td>
    <td width="50%">
      <p><b>이벤트, 공지사항</b></p>
      <ul>
        <li>공유하기 기능과 페이징처리</li>
      </ul>
    </td>
  </tr>
</table>

### 고객센터
<table>
  <tr>
    <td width="50%">
      <img width="1016" height="602" alt="image" src="https://github.com/user-attachments/assets/6d805bbc-c7f9-47e3-bfdc-042c2c588d5a" />
      <img width="235" height="37" alt="image" src="https://github.com/user-attachments/assets/ed61ae34-59dc-4614-ad1f-ada159d30333" />
       <img width="582" height="413" alt="image" src="https://github.com/user-attachments/assets/6abbffd8-d490-41ca-9eb1-b79d13ce3a89" />
    </td>
    <td width="50%">
      <p><b>1:1 채팅문의</b></p>
      <ul>
        <li>웹소켓을 활용해 실시간 채팅기능과 안 읽은 메세지 수 표시 기능 구현</li>
      </ul>
    </td>
  </tr>
</table>

<table>
  <tr>
    <td width="50%">
      <img width="986" height="938" alt="image" src="https://github.com/user-attachments/assets/5e9ced3c-8a1b-4571-bf89-b8ee4cd0928f" />
      <img width="969" height="597" alt="image" src="https://github.com/user-attachments/assets/28d9e76c-97f4-402c-bf36-e59bb68c3948" />
    </td>
    <td width="50%">
      <p><b>문의하기</b></p>
      <ul>
        <li>Naver SMTP를 활용해 문의 내용을 관리자메일로 전송</li>
      </ul>
    </td>
  </tr>
</table>

### 마이페이지
<div style="display: flex; gap: 10px;">
 <img width="330" alt="image" src="https://github.com/user-attachments/assets/8c74877f-f837-4fdb-beef-48f01a1d188c" />
 <img width="330" alt="image" src="https://github.com/user-attachments/assets/eb770d2f-d29f-416f-954a-59a16dceffd8" />
</div>

<div style="display: flex; gap: 10px;">
 <img width="330" alt="image" src="https://github.com/user-attachments/assets/132dd6aa-0da6-4c65-82a1-cf7c257a0202" />
  <img width="330" alt="image" src="https://github.com/user-attachments/assets/241a1b45-66b3-432a-90ae-d13b712e9bc0" />
</div>

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

