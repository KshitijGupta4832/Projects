function GST() {
    let price, discount, slab, result, dis, f
    price = parseInt(document.getElementById("price").value)//Price
    discount = parseInt(document.getElementById("Discount").value)
    slab = parseInt(document.getElementById("GST").value)
    if (discount > 0) {
        dis = (discount / 100) * price
        f = price - dis
        result = (slab / 100) * f
        document.getElementById("Output").value = result
    }
    else {

        result = (slab / 100) * price
        document.getElementById("Output").value = result
    }
}