<#import "main.ftl" as main>

<@main.main>
    <div class="container">
        <div class="row">
            <#list posts as post>
                <div class="col s4">
                    <div class="card">
                        <div class="card-image waves-effect waves-block waves-light">
                            <img class="activator" src="${post.img}">
                        </div>
                        <div class="card-content">
                            <span class="card-title activator grey-text text-darken-4">${post.title}<i
                                        class="material-icons right">more_vert</i></span>
                            <p><a href="#">This is a link</a></p>
                        </div>
                        <div class="card-reveal">
                            <span class="card-title grey-text text-darken-4">Card Title<i
                                        class="material-icons right">close</i></span>
                            <p>${post.body}</p>
                        </div>
                    </div>
                </div>
            </#list>
        </div>
    </div>
</@main.main>
