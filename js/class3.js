window.onload = () => {
    const btns = document.querySelectorAll("button")

    // 네이버 바로가기 버튼
    btns[0].onclick = () => {
        location.href = "https://www.naver.com"; // href는 변수이기때문에 더하는방식
    }

    // 현재 경로 가져오기
    btns[1].onclick = () => {
        const urlInput = document.querySelector("input");
        urlInput.value = location.pathname; // 현재 경로 보여주는 박스
        // location.pathname 현재 경로
    }

    // 새로고침 버튼
    btns[2].onclick = () => {
        location.reload();
    }

    // google로 강제 이동
    btns[3].onclick = () => {
        location.replace("https://google.com"); // replace는 메소드이다.
    }

}