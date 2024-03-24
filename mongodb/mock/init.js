// customer data
let customerWithOptIn = {"name": "John Doe","email": "john@mail.com","optIn": true}
let customerWithoutOptIn = {"name": "Jane Doe","email": "jane@mail.com","optIn": false}

// notification data - order
let msgOrderStatusData = {}

// notification data - promotion
let msgPromotionData = {}


// create database db
use dbteste;

// create collection customers
db.createCollection('customers');

// insert customer data
db.customers.insert([customerWithOptIn, customerWithoutOptIn]);

// create collection notifications
db.createCollection('notifications');

// create collection notifications
db.createCollection('tata');

// insert notification data
db.notifications.insert([msgOrderStatusData, msgPromotionData]);

// create collection notificationHistory
db.createCollection('notificationHistory');

// create collection customer orders    
db.createCollection('customerOrders');

