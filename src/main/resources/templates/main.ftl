<#macro main>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>ThreeDInfo</title>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="/css/materialize.min.css" media="screen,projection"/>
        <style>
            /* Основные стили */
            body {
                font-family: 'Poppins', sans-serif;
                background-color: #f0f1f3;
                color: #4a4a4a;
                margin: 0;
                padding: 0;
            }

            /* Навигация */
            nav {
                background-color: #3b3b3b;
            }
            nav .brand-logo {
                font-weight: 500;
                font-size: 1.5rem;
                color: #f0f1f3;
            }
            .nav-wrapper .material-icons {
                color: #f0f1f3;
            }
            .nav-wrapper ul li a {
                color: #bdbdbd;
            }
            .nav-wrapper ul li a:hover {
                color: #f0f1f3;
            }

            /* Карточки */
            .card {
                background-color: #ffffff;
                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
                border-radius: 10px;
                padding: 16px;
                margin-top: 20px;
            }

            /* Кнопки */
            .btn {
                background-color: #6c757d;
                color: white;
                border-radius: 20px;
                padding: 0 20px;
            }
            .btn:hover {
                background-color: #5a6268;
            }

            /* Заголовки и текст */
            h1, h2, h3, h4, h5, h6 {
                font-weight: 600;
                color: #333333;
                margin: 20px 0 10px 0;
            }
            p {
                line-height: 1.6;
                color: #4a4a4a;
            }
        </style>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>

    <body>
    <nav>
        <div class="nav-wrapper container">
            <a href="#!" class="brand-logo"><i class="material-icons">cloud</i>ThreeDInfo</a>
            <ul class="right hide-on-med-and-down">
                <li><a href="/search"><i class="material-icons">search</i></a></li>
                <li><a href="/dashboard"><i class="material-icons">view_module</i></a></li>
                <li><a href="/refresh"><i class="material-icons">refresh</i></a></li>
                <li><a href="/more"><i class="material-icons">more_vert</i></a></li>
            </ul>
        </div>
    </nav>

    <div class="container">
        <#nested>
    </div>

    <script type="text/javascript" src="/js/materialize.min.js"></script>
    </body>
    </html>
</#macro>
