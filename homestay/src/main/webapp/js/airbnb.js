//获取当天的日期
function showTime() {
    var now = new Date();
    var d = now.getDate();
    var m = now.getMonth() + 1;
    var y = now.getFullYear();
    var da = now.getDay();
    switch (da) {
        case 1:
            da = "一";break;
        case 2:
            da = "二";break;
        case 3:
            da = "三";break;
        case 4:
            da = "四";break;
        case 5:
            da = "五";break;
        case 6:
            da = "六";break;
        case 7:
            da = "日";break;
    }
    document.getElementById("time").innerHTML = y + "-" + m + "-" + d + " 星期"+da;
}


//退出至主界面
function quit(){
    window.location.replace("login.jsp");
}


//清空搜索框
function clearinput(){
    document.getElementById("clear").value="";
}


function alert1(){
    alert("提交成功");
}


//判定输入框是否有内容
function show(){
    for(var i=0;i<document.getElementsByName("form1").length-1;i++)
    {
        if(document.getElementsByName("form1")[i].value=="")
        {
            document.getElementsByName("form1")[i].focus();
        }
    }
    alert1();
}


var start = 0;
var start2 = 0;
var run;
var exhibition = document.getElementById("exhibition");
//图片滚动
function move() {
    run = setInterval(function () {
        var tp1 = document.getElementById("tp1");
        var tp2 = document.getElementById("tp2");
        var i = -1;
        if (start < 1646) {
            start++;
            start2++;
            tp1.style.transform = 'translate(' + i * start + 'px,0px)';
            tp2.style.transform = 'translate(' + i * start2 + 'px,0px)';
        } else if (start == 1646) {
            start = -1646;
            start2++;
            tp1.style.transform = 'translate(' + i * start + 'px,0px)';
            tp2.style.transform = 'translate(' + i * start2 + 'px,0px)';
        }
        if (start2 == 3292) {
            start++;
            start2 = 0;
            tp2.style.transform = 'translate(-1646px,0px)';
            tp1.style.transform = 'translate(' + i * start + 'px,0px)';
            tp2.style.transform = 'translate(' + i * start2 + 'px,0px)';
        }
    }, 10);
}
move();


//清除div块
function starclear() {
    var c = document.getElementsByClassName("maindiv");
    c[0].style.display = "none";
}


//显示菜单栏
function blockdiv(j) {
    var q = document.getElementsByClassName("maindiv");
    q[0].style.display = "block";
    var c = document.getElementsByClassName("model");
    for (var i = 0; i < 8; i++) {
        c[i].style.display = "none";
    }
    c[j].style.display = "block";
}

/*
//home
var home = document.getElementById("home");
home.onclick = function () {
    var a = document.getElementById("Main_Area").style.display = "block";
    starclear();
}

// 民宿状态
var homepage = document.getElementById("homepage");
homepage.onclick = function () {
    var a = document.getElementById("Main_Area").style.display = "none";
    blockdiv(0);
}

//入住登记
var checkIn = document.getElementById("checkIn");
checkIn.onclick = function () {
    var a = document.getElementById("Main_Area").style.display = "none";
    blockdiv(1);
}

//订单查询
var orderInquire = document.getElementById("orderInquire");
orderInquire.onclick = function () {
    var a = document.getElementById("Main_Area").style.display = "none";
    blockdiv(2);
}

//退房管理
var checkOut = document.getElementById("checkOut");
checkOut.onclick = function () {
    var a = document.getElementById("Main_Area").style.display = "none";
    blockdiv(3);
}

//留言管理
var messageBoard = document.getElementById("messageBoard");
messageBoard.onclick = function () {
    var a = document.getElementById("Main_Area").style.display = "none";
    blockdiv(4);
}

//报修管理
var repairStatue = document.getElementById("repairStatue");
repairStatue.onclick = function () {
    var a = document.getElementById("Main_Area").style.display = "none";
    blockdiv(5);
}*/
