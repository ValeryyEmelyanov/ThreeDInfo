<#import "main.ftl" as main>

<@main.main>
    <div class="container">
        <div class="row">
            <div class="col s12">
                <!-- Отображение заголовка и тела поста -->
                <h2>${post.title}</h2>
                <p>${post.body}</p>
                <p>
                    <!-- Ссылки для редактирования и удаления поста -->
                    <a href="/edit/${post.id}">Редактировать</a> |
                    <a href="/delete/${post.id}">Удалить</a>
                </p>
            </div>
        </div>
    </div>
</@main.main>
