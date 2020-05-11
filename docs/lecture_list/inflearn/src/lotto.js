var universe = Array(45)
                .fill()
                .map(function(element, index) {
                    return index + 1;
                });
console.log(universe);

var lotto = {
    random: [],
    bonus: 0,   // lotto.random[lotto.random.length - 1],
    win: [],    // lotto.random.splice(0, 6),
    shuffle: function() {
        while(universe.length > 0) {
            var choice = universe.splice(Math.floor(Math.random() * universe.length), 1)[0];
            lotto.random.push(choice);
        }
        console.log(lotto.random);
        lotto.bonus = lotto.random[lotto.random.length - 1];
        lotto.win = lotto.random.splice(0, 6);
    },
}

lotto.shuffle();
console.log('당첨숫자: ' + lotto.win + ", 보너스: " + lotto.bonus);
console.log('당첨숫자(정렬): ' + lotto.win.sort(function(p, c) {
                                                return p - c;   // 내림차순: c - p
                                            }) + ", 보너스: " + lotto.bonus);

var result = document.getElementById('result'); // 혹은 getElementsByTagName 사용
var ball;
function create_ball(num) { // 다른 부분 → 매개변수
    ball = document.createElement('div');
    ball.textContent = num;
}
function paint_ball(num) {
    // 스타일(JS로 CSS 조작하기)
    ball.style.display = 'inline-block';
    ball.style.border = '1px solid black';
    ball.style.borderRadius = '10px';   // abc-def-gh(CSS) → abcDefGh(JS)
    ball.style.width = '20px';
    ball.style.height = '20px';
    ball.style.textAlign = 'center';
    ball.style.marginRight = '10px';
    ball.style.fontSize = '12px';
    // 참고
    // ball.id = '공ID' + num;      // HTML: id
    // ball.className = "공CLASS" + num;    // HTML: class

    // 빨간(1~10), 주황(11~20), 노란(21~30), 파란(31~40), 초록(41~45)
    var ball_color;
    if(num <= 10) {
        ball_color = 'red';
    } else if(num <= 20) {
        ball_color = 'orange';
    } else if(num <= 30) {
        ball_color = 'yellow';
    } else if(num <= 40) {
        ball_color = 'blue';
    } else {
        ball_color = 'green';
    }
    ball.style.background = ball_color;
}

for(var i = 0; i < lotto.win.length; i++) {
    setTimeout(function() { // 1초간 간격두며 당첨번호 노출(클로저 이슈로 동작안함)
        create_ball(lotto.win[i]);
        paint_ball(lotto.win[i]);
        result.appendChild(ball);
    }, 1000);
}

var bonus = document.getElementsByClassName('bonus')[0];
create_ball(lotto.bonus);
paint_ball(lotto.bonus);
bonus.appendChild(ball);