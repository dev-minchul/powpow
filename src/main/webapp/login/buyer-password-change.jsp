<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POWPOW</title>
<link rel="stylesheet" href="assets/css/index.css"/>
<link rel="stylesheet" href="assets/css/login/buyer-password-change.css"/>
<link rel="shortcut icon" href="assets/images/favicon.ico"/>
</head>
<body>

<div class="change-passwrod-main">
        <!-- 로고 누르면 메인으로 이동 -->
        <div class="logo-box">
          <a href="http://127.0.0.1:5500/powpow-login/main.html">
            <img id="logo" src="assets/images/login/logo.png" alt="로고" />
          </a>
        </div>
        <p class="new">새로운 비밀번호를 설정해주세요.</p>
        <div class="input">
          <div>
            <div class="text-box">
              <p id="text">비밀번호</p>
              <p id="text" class="red">*</p>
            </div>
            <div class="input-container">
              <input class="inputbutton" type="password" name="password" placeholder="비밀번호">
              <div class="mark"></div>
            </div>
          </div>
          <div>
            <div class="text-box">
              <p id="text">비밀번호 확인</p>
              <p id="text" class="red">*</p>
            </div>
            <div class="input-container">
              <input class="inputbutton" type="password" name="password" placeholder="비밀번호 확인">
            </div>
          </div>
        </div>
        <a href="http://localhost:9000/powpow/password-change-complete.jsp">
          <button class="login-button">확인</button>
        </a>
      </div>
  
</body>

<script src="/jQuery.js"></script>

<script>

  const $input = $("input[name='password']");
  $("div.mark").on("click", (e) => {
    const check = $input.attr("type") === "password";
    $input.attr("type",check ? "text" : "password");
   $(e.target).css("background-image", `url(${check ? "./images/eye-on.svg" : "./images/eye-off.svg"})`)
  })

</script>
</html>