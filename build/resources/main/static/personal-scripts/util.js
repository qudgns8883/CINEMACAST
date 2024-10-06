// 로그인이 필요한 서비스일때
function requestLogin() {
    Swal.fire({
        title: "로그인이 필요한 서비스 입니다.",
        icon: "warning",
    }).then((result) => {
        if(result.isConfirmed) {
        }
    });
}

// alert 꾸미기
// 경고
function swtAlertOne(swtTitle) {
    Swal.fire({
        title: swtTitle,
        icon: "warning",
    }).then((result) => {
        if(result.isConfirmed) {
        }
    });
}
// 확인
function swtAlertOne2(swtTitle_success) {
    Swal.fire({
        title: swtTitle_success,
        icon: "success",
    }).then((result) => {
        if(result.isConfirmed) {
        }
    });
}