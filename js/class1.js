// let user = {
//     username: "cheolsu"
//     password: "1234"
// };

class User {
    // 여기도 접근지정자를 지정해줄수 있다 (# : private) 기본 : public
    username;
    password;
    name;
    email;

    constructor(username, password, name, email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    printName() {
        console.log(this.name + "님의 정보");
    }

}

class UserMain {

    static #instance = null; // 싱글톤
    static getInstance() {
        if (this.#instance == null) {
            this.#instance = new UserMain();
        }
        return this.#instance;
    }

    main() {
        let user = new User("cheolsu", "1234", "김철수", "sadsad@gmail.com");

        // user.username = "cheolsu";
        // user.password = "1234";
        // user.name = "김철수";
        // user.email = "sadsad@gmail.com";

        console.log(user);

        localStorage.username = user.username;
        // localStorage : 내 pc안에다가 값을 저장하는 것
        console.log("username : " + localStorage.username);

        user.printName();
    }

}


window.onload = () => {
    let userMain = UserMain.getInstance();

    userMain.main();
}
// 이때 이녀석이 실행된다

