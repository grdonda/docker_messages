#!/bin/bash

# Conecta ao RabbitMQ
rabbitmqadmin connect

# Cria o tópico
rabbitmqadmin declare topic name=offers_orders_cart_abandoned

# Cria as filas
rabbitmqadmin declare queue name=offers durable=true
rabbitmqadmin declare queue name=orders durable=true
rabbitmqadmin declare queue name=cart_abandoned durable=true

# Vincula as filas ao tópico
rabbitmqadmin bind queue name=offers exchange=offers_orders_cart_abandoned routing_key=offers
rabbitmqadmin bind queue name=orders exchange=offers_orders_cart_abandoned routing_key=orders
rabbitmqadmin bind queue name=cart_abandoned exchange=offers_orders_cart_abandoned routing_key=cart_abandoned

# Desconecta do RabbitMQ
rabbitmqadmin disconnect
