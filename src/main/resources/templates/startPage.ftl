<#import "main.ftl" as main>
<@main.main>
    <head>
        <title>Добро пожаловать в мир 3D-печати</title>
    </head>
    <body style="background-color: #f5f5f5; font-family: Arial, sans-serif;">

    <section style="text-align: center; padding: 20px;">
        <h1 style="color: #333;">Добро пожаловать в мир возможностей 3D-печати!</h1>
        <p style="color: #666; font-size: 1.1em; max-width: 600px; margin: 0 auto;">
            На нашем сайте вы найдете вдохновляющие статьи, обучающие материалы и последние новости,
            посвященные всем аспектам 3D-печати. Откройте новые горизонты технологий и дизайна вместе с нами!
        </p>
    </section>

    <section style="display: flex; justify-content: center; padding: 20px;">
        <a href="/posts/postInput" style="padding: 10px 20px; background-color: #4CAF50; color: #fff;
                                               text-decoration: none; border-radius: 5px; font-weight: bold;">
            ✍️ Написать статью
        </a>
    </section>

    <section style="margin-top: 40px;">
        <h2 style="text-align: center; color: #333;">Последние статьи</h2>
        <div style="max-width: 800px; margin: 0 auto; padding: 20px; background-color: #fff;
                        box-shadow: 0 0 10px rgba(0,0,0,0.1); border-radius: 8px;">
            <#if posts?has_content>
                <ul style="list-style: none; padding: 0;">
                    <#list posts as post>
                        <li style="padding: 10px 0; border-bottom: 1px solid #ddd;">
                            <a href="/posts/${post.id}" style="font-size: 1.2em; color: #333;
                                                                   text-decoration: none; font-weight: bold;">
                                ${post.title}
                            </a>
                            <small style="display: block; color: #888; margin-top: 5px;">
                                Опубликовано: ${post.createdDate}
                            </small>
                        </li>
                    </#list>
                </ul>
            <#else>
                <p style="text-align: center; color: #666;">Пока нет опубликованных статей. Будьте первым, кто поделится своей идеей!</p>
            </#if>
        </div>
    </section>

    </body>
</@main.main>
