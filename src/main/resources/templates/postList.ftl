<#import "main.ftl" as main>
<@main.main>
    <head>
        <title>Приветствие</title>
    </head>
    <body>
    <h1>Добро пожаловать на сайт!</h1>
    <p>Это стартовая страница вашего приложения на Spring Boot с FreeMarker.</p>

    <!-- Ссылка на окно создания статьи -->
    <a href="/posts/new">Написать статью</a>

    <!-- Список статей -->
    <h2>Список статей:</h2>
    <#if posts?has_content>
        <ul>
            <#list posts as post>
                <li>
                    <a href="/posts/${post.id}">${post.title}</a> -
                    <small>${post.createdDate}</small>
                </li>
            </#list>
        </ul>
    <#else>
        <p>Пока нет опубликованных статей.</p>
    </#if>
    </body>
</@main.main>
