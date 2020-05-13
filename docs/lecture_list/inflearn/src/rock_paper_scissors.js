var img = {
    left: '0px',
    interval: '',
}

// 컴퓨터
game_start();

// 사용자
console.log(document.querySelectorAll('.btn')); // NodeList(3)
console.log(document.querySelectorAll('.btn').length);  // 3
document.querySelectorAll('.btn').forEach(function(button) {
    button.addEventListener('click', function() {
        // console.log(this.textContent, img.left);
        console.log("man: " + this.textContent + ", " + "computer: " + inverse_dictionary(img.left)[0]);
        clearInterval(img.interval);    // 이미지 고정
        judge_the_winner(dictionary[this.textContent][1], inverse_dictionary(img.left)[1][1]);  // 승무패

        setTimeout(game_start, 1000); // 게임 재실행
    });
});

var dictionary = {  // 좌표, 승무패
    rock: ['0px', 1],
    scissor: ['-142px', 0],
    paper: ['-284px', 2],
}
console.log(Object.entries(dictionary));
function inverse_dictionary(img_left) { // 하드코딩 방지 함수
    return Object.entries(dictionary).find(function(item_arr) {
        // console.log(item_arr);
        return item_arr[1][0] === img_left;
    });
}
function judge_the_winner(man, computer) {
    if(0 == (man - computer)) {
        console.log('비겼습니다.');
    } else if([1, -2].includes(man - computer)) {
        console.log('이겼습니다.');
    } else {
        console.log('졌습니다.');
    }
}
function game_start() { // 게임 재실행을 위한 모듈화
    img.interval = setInterval(() => { // 화살표 함수
        if(img.left === '0px') {
            img.left = '-142px';
        } else if(img.left === '-142px') {
            img.left = '-284px';
        } else {
            img.left = '0px';
        }
        document.querySelector('#computer').style.background
            = 'url(https://en.pimg.jp/023/182/267/1/23182267.jpg) ' + img.left + ' 0';
    }, 100);
}