<#import "parts/common.ftlh" as c>

<@c.page>
List of users

<table>
    <thead>
    <tr>
        <th>Name</th>
        <th>Role</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <#list users as user>
    <tr>
        <td>${user.username}</td>
        <td><#list user.roles as role>${role}<#sep>, </#list></td>
        <td><a href="/user/${user.id}">edit</a></td>
    </tr>
    </#list>
    <form action="/user/delete" method="post">
        <label for="username"></label>
        <input type="text" id="username" name="username" required>
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <button type="submit">Удалить пользователя</button>
    </form>
    </tbody>
</table>
</@c.page>