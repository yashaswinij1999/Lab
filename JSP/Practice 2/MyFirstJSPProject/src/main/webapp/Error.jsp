<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Error Page</title>
</head>
<body>
    <h1>Oops! Something went wrong.</h1>
    <p>Error details: <%= exception.getMessage() %></p>
</body>
</html>
