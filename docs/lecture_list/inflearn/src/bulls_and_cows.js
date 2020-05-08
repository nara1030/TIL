function hit_and_run(event) {
    event.preventDefault(); // 새로고침 방지(숫자 보기 위해)
    var input_arr = document.getElementById('txt').value.split('');
    // var arr = [1, 2, 3, 4];
    console.log("입력 확인: " + input_arr);
    if(input_arr.join('') === answer_arr.arr.join('')) {
        console.log("정답");
        document.getElementById('result').textContent = '홈런!';
        document.getElementById('txt').value = '';
        document.getElementById('txt').focus();
        answer_arr.script();
    } else {
        var strike = 0;
        var ball = 0;
        for(var i = 0; i < 4; i++) {
            if(input_arr[i] === String(answer_arr.arr[i])) {
                strike++;
            } else if(input_arr.indexOf(String(answer_arr.arr[i])) > -1) {
                ball++;
            }
        }
        console.log("오답");
        document.getElementById('result').textContent = strike + ' 스트라이크 ' + ball + ' 볼입니다.';
        document.getElementById('txt').value = '';
        document.getElementById('txt').focus();
    }
}

function do_not_reload() {
    // 추후 공부
}

// 반환값 저장 및 함수 공용 사용 변수
var answer_arr = {
    arr: [],
    script: function () {
        answer_arr.arr.splice(0, 4);
        for(var i = 0; i < 4; i++) {
            answer_arr.arr.push(Math.ceil(Math.random() * 9));  // 랜덤하지 않은 문제
        }
        console.dir(answer_arr.arr);
    }
};

window.addEventListener('load', answer_arr.script);
document.getElementById('frm').addEventListener('submit', hit_and_run);