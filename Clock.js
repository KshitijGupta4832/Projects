setInterval(Time, 1000)
function Time() {
    let date = new Date()
    let hh = date.getHours()
    let mm = date.getMinutes()
    let ss = date.getSeconds()
    let period = "AM"//Default
    
    if(hh>00&&hh>=12){
    
        period = "PM"
    }
    // console.log(hh,mm,ss)
    let current = `${hh} - ${mm} - ${ss} ${period} `
    

    document.getElementById("Time").innerHTML = current
    let days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]
    let day = date.getDay()
    document.getElementById("day").innerHTML = days[day]
}
Time()

