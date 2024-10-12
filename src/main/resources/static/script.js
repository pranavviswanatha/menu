let orderMap = new Map();

function addToOrder(itemId) {
    const count = orderMap.get(itemId);
    orderMap.set(itemId, (count?count:0)+1);
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
    if (orderMap.length === 0) {
        alert("Your order is empty!");
        return;
    }

        // Data to be sent in the POST request
    const data = {
        customerId: '13',
        price: '11.99',
        orderInfo: orderMap,
    };

    // Making the POST request using fetch
    fetch(window.location.origin + '/api/placeOrder', {
        method: 'POST',  // Specify the HTTP method
        headers: {
            'Content-Type': 'application/json',  // Send JSON data
        },
        body: JSON.stringify(data),  // Convert the data object to a JSON string
    })
    .then(response => {
        if (!response.data.success) {
            throw new Error(response.data.message);
        }
        return response.json();  // Parse JSON response
    })
    .then(data => {
        console.log('Success:', data);
    })
    .catch(error => {
        console.error('Error:', error);
    });


    alert("Order placed successfully!\n" + orderList.join(', '));
}

function getPrice(priceCurr, priceOrig) {
    if(priceCurr === priceOrig)
        return priceOrig;
    else
        return `<del>${priceOrig}</del> ${priceCurr}`;
}