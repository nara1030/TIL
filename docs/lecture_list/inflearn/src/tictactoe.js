function onClick(event) {
    console.log(event.target);  // 클릭된 대상
    console.log(event.target.parentNode);   // 클릭 대상의 부모
    console.log(event.target.parentNode.parentNode);

    var rowIndex = event.target.parentNode.rowIndex + 1;
    var cellIndex = event.target.cellIndex + 1;
    console.log("행: " + rowIndex + ", 열: " + cellIndex);

    console.log(event.target);    // HTMLTableCellElement
    console.log(HTMLTableCellElement.innerText); // undefined
    if(event.target.innerText !== '') {
        console.log('빈칸아닙니다.');
    } else {
        console.log('빈칸입니다.');
        event.target.innerText = tictactoe.turn;
        if(tictactoe.turn === 'X') {
            tictactoe.turn = 'O';
        } else {
            tictactoe.turn = 'X';
        }
    }
}

var tictactoe = {
    turn: 'X',
}

document.getElementById("tb").addEventListener("click", onClick);