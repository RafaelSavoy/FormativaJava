function login(e) {
  e.preventDefault();
  const email = document.getElementById("email");
  const password = document.getElementById("password");
  alert(`Email: ${email.value}\nPassword: ${password.value}\n`);
}

document.getElementById("loginForm").addEventListener("submit", login);
