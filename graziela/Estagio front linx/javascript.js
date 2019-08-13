var page = 1;
getDados = function(page) {
    this.page = page;
    $.getJSON("https://frontend-intern-challenge-api.iurykrieger.now.sh/products?page=" + this.page, function(data) {
        var itens = $("#produtos-corpo")[0].innerHTML;
        for (let index = 0; index < data.products.length; index++) {
            const produto = data.products[index];
            var item = '<img style="border: 1px solid #707070;" src="http:' + produto.image + '" height="150" width="200" />';
            item += '<p id="nome-produto"> ' + produto.name + '</p>';
            item += '<p> ' + produto.description + '</p>';
            item += '<p id=> De: R$' + produto.oldPrice + '</p>';
            item += '<p id="preco-negrito"><b> Por: R$' + produto.price + '</b></p>';
            item += '<p> ou ' + produto.installments.count + 'x de R$' + produto.installments.value + '</p>';
            item += '<button class="btn-comprar">Comprar</li></button>';
            if (index == 3 || index == 7) {
                item += "</br></br></br>";
            }
            itens += '<li id="' + produto.id + '" class="product">' + item + '</li>';
        }
        $("#produtos-corpo")[0].innerHTML = itens;
    });
}