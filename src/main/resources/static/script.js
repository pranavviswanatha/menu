let orderList = [];

function addToOrder(item) {
    orderList.push(item);
    updateOrderDisplay();
}

function updateOrderDisplay() {
    const orderListElement = document.getElementById('order-list');
    orderListElement.innerHTML = '';

    orderList.forEach(item => {
        const li = document.createElement('li');
        li.textContent = item;
        orderListElement.appendChild(li);
    });
}

function placeOrder() {
    if (orderList.length === 0) {
        alert("Your order is empty!");
        return;
    }

    alert("Order placed successfully!\n" + orderList.join(', '));
}