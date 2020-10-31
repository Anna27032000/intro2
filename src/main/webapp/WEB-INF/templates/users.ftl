<html>
<head>
    <title>Users</title>
</head>
<body>
<p>
<ul>
    <#list users as user>
        <li>
            ${user.name} ${user.surname} ${user.email}
        </li>
    </#list>
</ul>
</p>
</body>
</html>