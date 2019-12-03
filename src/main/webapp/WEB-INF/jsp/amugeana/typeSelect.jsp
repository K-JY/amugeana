<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<!--
	Overflow by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
	<head>
		<title>아무거나를 정해드립니다.</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="/css/main.css?201912021604" />
		<noscript><link rel="stylesheet" href="/css/noscript.css?201912021504" /></noscript>
		<script type="text/javascript" src="/js/lib/jquery-3.4.1.min.js"></script>
		<script type="text/javascript" src="/js/amugeana/typeSelect.js"></script>
	</head>
	<body class="is-preload">
		<section id="lnb">
			<h2><a href="/">AMUGEANA</a></h2>
		</section>
		<!-- Banner -->
			<section id="middle">
				<section id="data">
				</section>
				<p id="typeTitle">주메뉴</p>
				<section id="type-contents">
					<c:forEach var="list" items="${list}" varStatus="status">
						<label class="button style2 scrolly typeBtn" name="typeBtn" for="${list.PARENT_CATEGORY}${status.index}">${list.CODE_NAME}</label>
						<input type="radio" class="hidden" name="typeRadioBox" id="${list.PARENT_CATEGORY}${status.index}" value="${list.TYPE_CD}|${list.TYPE_CATEGORY}">
					</c:forEach>
					<c:if test="${(fn:length(list)%2) eq 1}">
						<label class="button scrolly " id="noneTypeBtn">null</label>
					</c:if>
					
				</section>
				<section id="btn-list">
					<label class="button scrolly" id="nextBtn" name="typeBtn">다음 ></label>
				</section>
			</section>
		<section id="footer">
			<!-- <ul class="icons">
				<li><a href="#" class="icon brands fa-twitter"><span class="label">Twitter</span></a></li>
				<li><a href="#" class="icon brands fa-facebook-f"><span class="label">Facebook</span></a></li>
				<li><a href="#" class="icon brands fa-google-plus-g"><span class="label">Google+</span></a></li>
				<li><a href="#" class="icon brands fa-pinterest"><span class="label">Pinterest</span></a></li>
				<li><a href="#" class="icon brands fa-dribbble"><span class="label">Dribbble</span></a></li>
				<li><a href="#" class="icon brands fa-linkedin-in"><span class="label">LinkedIn</span></a></li>
			</ul> -->
			<div class="copyright">
				<ul class="menu">
					<li>&copy; Untitled. All rights reserved.</li><li>Design: <a href="/">AMUGEANA</a></li>
				</ul>
			</div>
		</section>

	</body>
</html>