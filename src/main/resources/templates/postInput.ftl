<#import "main.ftl" as main>
<@main.main>

  <div class="row">
    <form class="col s12" action="/posts/postInput" method="post">
      <div class="row">
        <div class="input-field col s6">
          <input placeholder="Your Name" id="name" type="text" class="validate" name="name">
          <label for="name">Your Name</label>
        </div>
      </div>

      <div class="row">
        <div class="input-field col s12">
          <input placeholder="Title" id="title" type="text" class="validate" name="title">
          <label for="title">Title</label>
        </div>
      </div>

      <div class="row">
        <div class="input-field col s12">
          <input placeholder="Body" id="body" type="text" class="validate" name="body">
          <label for="body">Body</label>
        </div>
      </div>

      <div class="row">
        <div class="input-field col s12">
          <input id="email" type="email" class="validate" name="email">
          <label for="email">Email</label>
        </div>
      </div>

      <div class="row">
        <div class="col s12">
          <button type="submit" class="btn waves-effect waves-light">Опубликовать</button>
        </div>
      </div>
    </form>
  </div>

</@main.main>