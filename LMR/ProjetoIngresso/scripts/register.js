function register(e) {
  e.preventDefault();
  const name = document.getElementById("name");
  const email = document.getElementById("email");
  const password = document.getElementById("password");
  const confirmPassword = document.getElementById("confirmPassword");

  if (password.value == "" || password.value.length < 8) {
    alert("A senha deve ter no mínimo 8 caracteres.");
    password.classList.add("border-red-500");
    return;
  }
  if (password.value !== confirmPassword.value) {
    alert("As senhas não conferem.");
    password.classList.add("border-red-500");
    confirmPassword.classList.add("border-red-500");
    return;
  }
  confirmPassword.classList.remove("border-red-500");
  password.classList.remove("border-red-500");

  alert(
    `Nome: ${name.value}\nEmail: ${email.value}\nPassword: ${password.value}\n`
  );
}

document.getElementById("registerForm").addEventListener("submit", register);
