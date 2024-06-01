<#macro main>
    <!DOCTYPE html>
    <html lang="ru">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="/css/materialize.min.css" media="screen,projection"/>

        <title>FAQ</title>
        <style>
            body {
                background-color: #2c2c2c; /* Темный фон для тела страницы */
                color: #f5f5f5; /* Светлый текст */
            }

            .nav-wrapper {
                background-color: #424242; /* Темный фон для навигации */
            }

            .input-field input, .input-field textarea {
                color: #f5f5f5; /* Цвет текста в поле ввода */
                background-color: #424242; /* Цвет фона поля ввода */
            }

            .input-field label {
                color: #9e9e9e; /* Цвет метки поля ввода */
            }

            .input-field input:focus + label, .input-field textarea:focus + label {
                color: #ffab40; /* Цвет метки поля ввода при фокусе */
            }

            .input-field input:focus, .input-field textarea:focus {
                border-bottom: 1px solid #ffab40; /* Цвет нижней границы поля ввода при фокусе */
                box-shadow: 0 1px 0 0 #ffab40; /* Тень поля ввода при фокусе */
            }

            .btn, .btn:hover {
                background-color: #ffab40; /* Оранжевый цвет для кнопок */
                color: #2c2c2c; /* Темный цвет текста кнопок */
            }

            .search-wrapper {
                display: flex;
                align-items: center;
                position: relative;
            }

            .search-wrapper input {
                width: 0;
                opacity: 0;
                transition: width 0.4s ease, opacity 0.4s ease;
                border: none;
                outline: none;
                background-color: #ffab40; /* Оранжевый цвет фона поля поиска */
                color: #2c2c2c; /* Темный цвет текста поля поиска */
                margin-left: 5px;
            }

            .search-wrapper.active input {
                width: 180px;
                opacity: 1;
            }

            .search-trigger {
                display: inline-block;
            }

            .search-wrapper .close {
                color: #ffab40; /* Цвет иконки закрытия в поле поиска */
            }
        </style>
    </head>
    <body>
    <nav>
        <div class="nav-wrapper">
            <a href="/" class="brand-logo">Logo</a>
            <ul class="right hide-on-med-and-down">
                <li><a href="/"><i class="material-icons">home</i></a></li>
                <li><a href="/posts/add"><i class="material-icons">add</i></a></li>
                <li class="search-wrapper">
                    <a href="#" class="search-trigger"><i class="material-icons">search</i></a>
                    <form>
                        <div class="input-field">
                            <input name="query" id="search" type="search" required>
                            <label class="label-icon" for="search" style="display: none;"><i class="material-icons">search</i></label>
                            <i class="material-icons close">close</i>
                        </div>
                    </form>
                </li>
            </ul>
        </div>
    </nav>

    <#nested>

    <script type="text/javascript" src="/js/materialize.min.js"></script>
    <script>
        document.addEventListener('DOMContentLoaded', function() {
            var elems = document.querySelectorAll('.sidenav');
            var instances = M.Sidenav.init(elems);

            const searchTrigger = document.querySelector('.search-trigger');
            const searchWrapper = document.querySelector('.search-wrapper');
            const searchInput = searchWrapper.querySelector('input');
            const searchClose = searchWrapper.querySelector('.material-icons.close');

            searchTrigger.addEventListener('click', function(event) {
                event.preventDefault();
                searchWrapper.classList.add('active');
                searchInput.focus();
            });

            searchClose.addEventListener('click', function() {
                searchWrapper.classList.remove('active');
                searchInput.value = '';
            });
        });
    </script>
    </body>
    </html>
</#macro>
