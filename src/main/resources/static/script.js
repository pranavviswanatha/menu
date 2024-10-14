let orderMap = new Map();

function addToOrder(itemId) {
    const count = orderMap.get(itemId);
    orderMap.set(itemId, (count?count:0)+1);
    updateOrderDisplay();
}

function updateOrderDisplay() {
    const orderListElement = document.getElementById('order-list');
    orderListElement.innerHTML = '';

    orderMap.forEach(item => {
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
    const jsonString = JSON.stringify([...orderMap]);
    const data = {
        customerId: '13',
        price: '11.99',
        orderInfo: jsonString,
    };
    console.log(jsonString);

    // Making the POST request using fetch
    fetch(window.location.origin + '/api/placeOrder', {
        method: 'POST',  // Specify the HTTP method
        headers: {
            'Content-Type': 'application/json',  // Send JSON data
        },
        body: JSON.stringify(data),  // Convert the data object to a JSON string
    })
    .then(response => {
        if (!response.ok) {
            throw new Error(response.message);
        }
        return response.json();  // Parse JSON response
    })
    .then(data => {
        console.log('Success:', data);
    })
    .catch(error => {
        console.error('Error:', error);
    });


}

function getPrice(priceCurr, priceOrig) {
    if(priceCurr === priceOrig)
        return priceOrig;
    else
        return `<del>${priceOrig}</del> ${priceCurr}`;
}