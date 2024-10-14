<#import "main.ftl" as main>
<@main.main>

  <div class="row">
    <form class="col s12">

      <div class="row">
        <div class="input-field col s6">
          <input placeholder="Your Name" id="Your Name" type="text" class="validate">
          <label for="Your Name">Your Name</label>
        </div>
      </div>

      <div class="row">
        <div class="input-field col s12">
          <input placeholder="Title" id="Post Title" type="text" class="validate">
          <label for="title">Title</label>
        </div>
      </div>

      <div class="row">
        <div class="input-field col s12">
          <input placeholder="Body" id="Post Body" type="text" class="validate">
          <label for="body">Body</label>
        </div>
      </div>

      <div class="row">
        <div class="input-field col s12">
          <input id="email" type="email" class="validate">
          <label for="email">Email</label>
        </div>
      </div>

    </form>
  </div>

</@main.main>
