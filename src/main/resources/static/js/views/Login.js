export default function Login(props) {
    return `<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Log In</title>
</head>
<body>

<div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->
    <h2 class="active"> Log In </h2>

    <!-- Icon -->
    <div class="fadeIn first">
<!--      <img src="http://danielzawadzki.com/codepen/01/icon.svg" id="icon" alt="User Icon" />-->
    </div>

    <!-- Login Form -->
    <form>
    <input id="username" class="fadeIn second" name="username" type="text" placeholder="username" value="roger"/>
    <input id="password" class="fadeIn third" name="password" type="password" placeholder="password" value="12345"/>
    <input id="login-btn" class="fadeIn fourth" type="submit" value="Log In"/>
    </form>

    <!-- Remind Passowrd -->
    <div id="formFooter">
      <a class="underlineHover" href="#">Forgot Password?</a>
    </div>

  </div>
</div>
</body>
</html>`;

}


