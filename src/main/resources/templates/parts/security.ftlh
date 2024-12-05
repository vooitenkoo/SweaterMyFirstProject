<#-- Проверяем, передан ли пользователь в модель -->
<#if user??>
<#-- Если пользователь аутентифицирован -->
<#assign name = user.getAllRolesAsString()>
<#assign isAdmin = user.isAdmin()>
<#else>
<#-- Если пользователь не аутентифицирован -->
<#assign name = "unknown">
<#assign isAdmin = false>
</#if>
