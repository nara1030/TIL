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

for(var i = 0; i < lotto.win.length; i++) {
    setTimeout(function() { // 1초간 간격두며 당첨번호 노출(클로저 이슈로 동작안함)
        var ball = document.createElement('div');
        ball.textContent = lotto.win[i];
        result.appendChild(ball);
    }, 1000);
}

var bonus = document.getElementsByClassName('bonus')[0];
ball = document.createElement('div');
ball.textContent = lotto.bonus;
bonus.appendChild(ball);