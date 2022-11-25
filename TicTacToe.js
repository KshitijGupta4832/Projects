let btn = document.querySelectorAll(".grids")
let m = 0
let f = 0
let a = new Audio("http://codeskulptor-demos.commondatastorage.googleapis.com/GalaxyInvaders/bonus.wav")
let b = new Audio("http://commondatastorage.googleapis.com/codeskulptor-demos/riceracer_assets/music/win.ogg")
let c = new Audio("http://commondatastorage.googleapis.com/codeskulptor-demos/pyman_assets/theygotcha.ogg")
function GAME(m, f, a, btn) {
    Array.from(btn).forEach((button) => {
        button.addEventListener("click", (e) => {
            if (m == 0) {
                if (e.target.innerHTML != "O") {
                    document.getElementById("Turns").innerHTML = "O's Turn"
                    e.target.innerHTML = "X"
                    m++;
                    f++
                    a.play()
                    winaxiom(f)
                }
            }
            else {
                if (e.target.innerHTML != "X") {
                    document.getElementById("Turns").innerHTML = "X's Turn"
                    e.target.innerHTML = "O"
                    m--
                    f++
                    a.play()
                    winaxiom(f)
                }
            }
        })
    })
}
function winaxiom(f) {
    let win0 = document.getElementById("L1").innerHTML
    let win1 = document.getElementById("L2").innerHTML
    let win2 = document.getElementById("L3").innerHTML
    let win3 = document.getElementById("L4").innerHTML
    let win4 = document.getElementById("L5").innerHTML
    let win5 = document.getElementById("L6").innerHTML
    let win6 = document.getElementById("L7").innerHTML
    let win7 = document.getElementById("L8").innerHTML
    let win8 = document.getElementById("L9").innerHTML
    if (win0 == "X" && win1 == "X" && win2 == "X" ||
        win3 == "X" && win4 == "X" && win5 == "X" ||
        win6 == "X" && win7 == "X" && win8 == "X" ||
        win0 == "X" && win3 == "X" && win6 == "X" ||
        win1 == "X" && win4 == "X" && win7 == "X" ||
        win2 == "X" && win5 == "X" && win8 == "X" ||
        win0 == "X" && win4 == "X" && win8 == "X" ||
        win2 == "X" && win4 == "X" && win6 == "X") {
        b.play()
        document.getElementById("msg").innerHTML = `X won`
        setInterval(Flip, 500)
        function Flip() {
            const array = ["red", "Lime", "SeaGreen", "Orange", "Coral", "DarkCyan"
                , "Olive", "SpringGreen", "Gold", "DeepSkyBlue", "Gray", "Lavender"
                , "Purple", "Violet"]
            let size = array.length
            for (let i = 0; i < size; i++) {
                let index = Math.floor(Math.random() * size)
                document.body.style.backgroundColor = array[index]
            }
        }
        Flip()
        setInterval(Reset, 4000)
    }
    else if (win0 == "O" && win1 == "O" && win2 == "O" ||
        win3 == "O" && win4 == "O" && win5 == "O" ||
        win6 == "O" && win7 == "O" && win8 == "O" ||
        win0 == "O" && win3 == "O" && win6 == "O" ||
        win1 == "O" && win4 == "O" && win7 == "O" ||
        win2 == "O" && win5 == "O" && win8 == "O" ||
        win0 == "O" && win4 == "O" && win8 == "O" ||
        win2 == "O" && win4 == "O" && win6 == "O") {
        b.play()
        document.getElementById("msg").innerHTML = "O won"
        setInterval(Flip, 500)
        function Flip() {
            const array = ["red", "Lime", "SeaGreen", "Orange", "Coral", "DarkCyan"
                , "Olive", "SpringGreen", "Gold", "DeepSkyBlue", "Gray", "Lavender"
                , "Purple", "Violet"]
            let size = array.length
            for (let i = 0; i < size; i++) {
                let index = Math.floor(Math.random() * size)
                document.body.style.backgroundColor = array[index]
            }
        }
        Flip()
        setInterval(Reset, 4000)
    }
    else if (f == 9) {
        document.getElementById("msg").innerHTML = "Tie"
        c.play()
        setInterval(Reset, 4000)
    }
}
GAME(m, f, a, btn)
function Reset() {
    window.location.reload()
}
