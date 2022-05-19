

const btnToast = document.getElementById("liveToastBtn")
const toast = document.getElementById("liveToast")

btnToast.addEventListener("click",() => {
    const seutoast = new bootstrap.Toast(toast);

    seutoast.show();
});