<#import "main.ftl" as main>

<@main.main>
    <div class="container">
        <h1>FAQ</h1>
        <p>Добро пожаловать на страницу часто задаваемых вопросов. Здесь вы можете просмотреть, добавить, редактировать или удалить посты.</p>

        <div class="row">
            <div class="col s12">
                <!-- Кнопка для добавления нового поста -->
                <a href="/posts/add" class="btn waves-effect waves-light">Добавить пост
                    <i class="material-icons right">add</i>
                </a>
            </div>
        </div>

        <div class="row">
            <!-- Список постов -->
            <#list posts as post>
                <div class="col s12 m6">
                    <div class="card">
                        <div class="card-content">
                            <span class="card-title">${post.title}</span>
                            <p>${post.body}</p>
                        </div>
                        <div class="card-action">
                            <!-- Ссылки для просмотра, редактирования и удаления постов -->
                            <a href="/viewPost/${post.id}">Просмотр</a>
                            <a href="/edit/${post.id}">Редактировать</a>
                            <a href="/delete/${post.id}">Удалить</a>
                        </div>
                    </div>
                </div>
            </#list>
        </div>
    </div>
</@main.main>
