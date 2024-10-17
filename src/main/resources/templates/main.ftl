<#macro main>
    <!DOCTYPE html>
    <html lang="ru">
    <head>
        <meta charset="UTF-8">
        <title>ThreeDInfo</title>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="/css/materialize.min.css" media="screen,projection"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <style>
            /* Основные стили */
            body {
                font-family: 'Poppins', sans-serif;
                background-color: #f5f5f5;
                color: #333;
                margin: 0;
                padding: 0;
            }
            /* Шапка */
            nav {
                background-color: #333;
                padding: 10px 0;
                text-align: center;
            }
            nav h1 {
                margin: 0;
                color: #fff;
            }

            /* Карточки */
            .card {
                background-color: #fff;
                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
                border-radius: 10px;
                padding: 16px;
                margin-top: 20px;
            }

            /* Кнопки */
            .btn {
                background-color: #4CAF50;
                color: white;
                border-radius: 5px;
                padding: 10px 20px;
                text-decoration: none;
                font-weight: bold;
            }

            .btn:hover {
                background-color: #45a049;
            }
        </style>
    </head>
    <body>
    <nav>
        <h1>ThreeDInfo</h1>
    </nav>

    <div class="container">
        <#nested> <!-- Для динамического контента -->
    </div>

    <script type="text/javascript" src="/js/materialize.min.js"></script>
    </body>
    </html>
</#macro>
