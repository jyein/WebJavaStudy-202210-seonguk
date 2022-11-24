window.onload = () => {
    console.log("class2.html : " + localStorage.username);
    // window.alert();  원래는 이렇게 쓰는데 window를 생략해서 alert(); 이렇게 많이쓰인다.
    // window.alert(); 

    const btns = document.querySelectorAll("button");
    btns[0].onclick = () => {
        print();
    }
    
    btns[1].onclick = () => {
        history.back();
    }

}