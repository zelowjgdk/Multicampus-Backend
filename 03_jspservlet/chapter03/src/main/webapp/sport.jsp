<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Document</title>
<!-- Latest compiled and minified CSS -->
<!-- CDN : Content Delivert Network -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" />
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" />

<!-- jQuery library -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

<link rel="stylesheet" href="css/main.css" />
<style></style>
</head>
<body>
    <div class="container">
        <h1>getParameterValues 실습</h1>
        <form action="sport" method="post">
            <fieldset>
                <legend>좋아하는 운동 및 성별</legend>
                <ul>
                    <div><label for="baseball">
                    <i class="fa-solid fa-baseball-bat-ball"></i> 야구
                    </label>
                            <input type="checkbox" name="sports" value="야구">
                            <label for="football">
                        <i class="fa-regular fa-futbol"></i> 축구
                        </label>
                        <input type="checkbox" name="sports" value="축구">
                        <label for="basketball">
                        <i class="fa-solid fa-basketball"></i> 농구
                        </label>
                        <input type="checkbox" name="sports" value="농구">
                    </div>
                    
                    <div>
                        <label for="sex"> 남</label>
                        <input type="radio" name="sex" value="남자" checked>
                        <label for="sex"> 여</label>
                        <input type="radio" name="sex" value="여자">
                    </div>
                    <div>
                        <label>나이</label>
                        <input type="number" name="age" required>
                    </div>
                    <input type="submit" value="전송">
                </ul>
            </fieldset>
        </form>
    </div>
</body>
</html>