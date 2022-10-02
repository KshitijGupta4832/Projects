document.getElementById("Flip").addEventListener("click", function (element) {
    const array = ["red", "Lime", "SeaGreen", "Orange", "Coral", "DarkCyan"
        , "Olive", "SpringGreen", "Gold", "DeepSkyBlue", "Gray", "Lavender"
        , "Purple", "Violet"]
    let size = array.length

    const index = Math.floor(Math.random() * size)
    //console.log(array[index])
    let x = array[index]
    document.body.style.backgroundColor = x
    console.log(x)
})