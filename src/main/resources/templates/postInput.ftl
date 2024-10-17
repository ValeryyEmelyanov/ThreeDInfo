<#import "main.ftl" as main>
<@main.main>

  <div class="row" style="max-width: 800px; margin: 40px auto; background-color: #fff; padding: 20px; box-shadow: 0 2px 10px rgba(0,0,0,0.1); border-radius: 10px;">
    <form class="col s12" action="/posts/postInput" method="post">

      <!-- Поле для имени -->
      <div class="row">
        <div class="input-field col s12">
          <label for="name" style="font-weight: 500; font-size: 1.1em; display: block;">Your Name</label>
          <input placeholder="Your Name" id="name" type="text" class="validate" name="name"
                 style="width: 100%; padding: 12px; border: 1px solid #ddd; border-radius: 8px; transition: border-color 0.3s;">
        </div>
      </div>

      <!-- Поле для заголовка -->
      <div class="row">
        <div class="input-field col s12">
          <label for="title" style="font-weight: 500; font-size: 1.1em; display: block;">Title</label>
          <input placeholder="Title" id="title" type="text" class="validate" name="title"
                 style="width: 100%; padding: 12px; border: 1px solid #ddd; border-radius: 8px; transition: border-color 0.3s;">
        </div>
      </div>

      <!-- Поле для тела статьи -->
      <div class="row">
        <div class="input-field col s12">
          <label for="body" style="font-weight: 500; font-size: 1.1em; display: block;">Body</label>
          <textarea placeholder="Body" id="body" name="body"
                    style="width: 100%; height: 150px; padding: 12px; border: 1px solid #ddd; border-radius: 8px; transition: border-color 0.3s;"></textarea>
        </div>
      </div>

      <!-- Поле для email -->
      <div class="row">
        <div class="input-field col s12">
          <label for="email" style="font-weight: 500; font-size: 1.1em; display: block;">Email</label>
          <input id="email" type="email" class="validate" name="email"
                 style="width: 100%; padding: 12px; border: 1px solid #ddd; border-radius: 8px; transition: border-color 0.3s;">
        </div>
      </div>

      <!-- Кнопка отправки -->
      <div class="row">
        <div class="col s12" style="text-align: center;">
          <button type="submit" class="btn waves-effect waves-light"
                  style="width: 60%; padding: 12px; background-color: #4CAF50; color: white; border-radius: 8px; font-size: 1.1em;">
            Опубликовать
          </button>
        </div>
      </div>
    </form>
  </div>

  <!-- Стили для фокуса и интерактивности -->
  <style>
    input:focus, textarea:focus {
      border-color: #4CAF50;
      outline: none;
      box-shadow: 0 0 5px rgba(76, 175, 80, 0.3);
    }
    input, textarea {
      font-family: 'Arial', sans-serif;
      font-size: 1em;
      color: #333;
    }
    input::placeholder, textarea::placeholder {
      color: #aaa;
    }
    label {
      color: #666;
      font-size: 0.9em;
    }
    .btn:hover {
      background-color: #45A049;
    }
  </style>

</@main.main>
