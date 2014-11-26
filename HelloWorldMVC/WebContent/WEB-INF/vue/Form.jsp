<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head>
<body>
<form:form action="/form" modelattribute="subscriber">
    <label for="nameInput">Name: </label>
    <form:input path="name" id="nameInput"></form:input>
    <form:errors path="name" cssclass="error"></form:errors>
    <br />
     
    <label for="ageInput">Age: </label>
    <form:input path="age" id="ageInput"></form:input>
    <form:errors path="age" cssclass="error"></form:errors>
    <br />
     
    <label for="phoneInput">Phone: </label>
    <form:input path="phone" id="phoneInput"></form:input>
    <form:errors path="phone" cssclass="error"></form:errors>
    <br />
     
    <label for="emailInput">Email: </label>
    <form:input path="email" id="emailInput"></form:input>
    <form:errors path="email" cssclass="error"></form:errors>
    <br />
     
    <label for="birthdayInput">Birthday: </label>
    <form:input path="birthday" id="birthdayInput" placeholder="MM/DD/YYYY">
    <form:errors path="birthday" cssclass="error"></form:errors>
    <br />
     
    <label for="genderOptions">Gender: </label>
    <form:select path="gender" id="genderOptions">
        <form:option value="">Select Gender</form:option>
        <form:option value="MALE">Male</form:option>
        <form:option value="FEMALE">Female</form:option>
    </form:select>
    <form:errors path="gender" cssclass="error"></form:errors>
    <br />
     
    <label for="newsletterCheckbox">Newsletter? </label>
    <form:checkbox path="receiveNewsletter" id="newsletterCheckbox"></form:checkbox>
    <form:errors path="receiveNewsletter" cssclass="error"></form:errors>
    <br /><br />
    <input type="submit" value="Submit" />
</form:input></form:form>
</body>
</html>