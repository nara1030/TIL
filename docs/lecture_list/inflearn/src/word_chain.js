function onClick() {
    if(document.getElementById("word").textContent[document.getElementById("word").textContent.length - 1] === document.getElementsByTagName("input")[0].value[0]) {
            document.getElementById("result").textContent = '딩동댕';
            document.getElementById("word").textContent = document.getElementsByTagName("input")[0].value;
            document.getElementsByTagName("input")[0].value = '';
            document.getElementsByTagName("input")[0].focus();
    } else {
        document.getElementById("result").textContent = '땡';
        document.getElementsByTagName("input")[0].value = '';
        document.getElementsByTagName("input")[0].focus();
    }
}

document.getElementsByTagName("button")[0].addEventListener('click', onClick);