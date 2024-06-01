<#import "main.ftl" as main>

<@main.main>
    <div class="container">
        <h3>Добавить новый пост</h3>
        <form action="/posts/add" method="post">
            <div class="row">
                <div class="input-field col s12">
                    <input id="title" name="title" type="text" class="validate" required>
                    <label for="title">Заголовок</label>
                </div>
            </div>
            <div class="row">
                <div class="input-field col s12">
                    <textarea id="body" name="body" class="materialize-textarea" required></textarea>
                    <label for="body">Тело поста</label>
                </div>
            </div>
            <div class="row">
                <div class="input-field col s12">
                    <input id="img" name="img" type="text" class="validate">
                    <label for="img">URL изображения</label>
                </div>
            </div>
            <button class="btn waves-effect waves-light" type="submit" name="action">Добавить пост
                <i class="material-icons right">send</i>
            </button>
        </form>
    </div>
</@main.main>
