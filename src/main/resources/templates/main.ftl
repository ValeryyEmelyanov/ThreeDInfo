<#macro main>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="/css/materialize.min.css" media="screen,projection"/>

        <title>Document</title>
    </head>
    <body>
    <nav>
        <div class="nav-wrapper">
            <a href="#!" class="brand-logo"><i class="material-icons">cloud</i>Logo</a>
            <ul class="right hide-on-med-and-down">
                <li><a href="sass.html"><i class="material-icons">search</i></a></li>
                <li><a href="badges.html"><i class="material-icons">view_module</i></a></li>
                <li><a href="collapsible.html"><i class="material-icons">refresh</i></a></li>
                <li><a href="mobile.html"><i class="material-icons">more_vert</i></a></li>
            </ul>
        </div>
    </nav>

    <#nested>

    <script type="text/javascript" src="/js/materialize.min.js"></script>
    </body>
    </html>
</#macro>
