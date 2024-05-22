<#macro main>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="/css/materialize.min.css" media="screen,projection"/>

        <title>Document</title>
        <style>
            .search-wrapper {
                display: flex;
                align-items: center;
                position: relative;
            }

            .search-wrapper input {
                width: 0;
                opacity: 0;
                transition: width 0.4s ease, opacity 0.4s ease;
                border: none; /* Убираем границы у поля поиска */
                outline: none; /* Убираем контур вокруг поля при фокусе */
                background-color: #fd8b01; /* Цвет фона поля поиска */
                margin-left: 5px; /* Добавляем отступ слева */
            }

            .search-wrapper.active input {
                width: 180px; /* Ширина поля поиска при активации */
                opacity: 1;
                /*padding: 0 10px;*/
            }

            .search-trigger {
                display: inline-block; /* Показываем кнопку поиска */
            }
        </style>
    </head>
    <body>
    <nav>
        <div class="nav-wrapper">
            <a href="#!" class="brand-logo"><i class="material-icons">cloud</i>Logo</a>
            <ul class="right hide-on-med-and-down">
                <li><a href="#"><i class="material-icons">view_module</i></a></li>
                <li><a href="#"><i class="material-icons">refresh</i></a></li>
                <li><a href="#"><i class="material-icons">more_vert</i></a></li>
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

            // Toggle search bar visibility
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
