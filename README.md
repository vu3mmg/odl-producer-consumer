# odl-producer-consumer
A opendaylight producer consumer example

Consumer is created by copying the producer.

Known issues .
===============

integration testing will fail . Mostly due to the fact that it is extended to run Provider tests


Features 
============

** example-producer

** example-consumer 

How to Run
============

From Karaf shell execute 
-------------------------
log:tail | grep -i example

feature:list | grep -i example

feature:install odl-example-consumer 


To run  -  execute  from example directory 
./karaf/target/assembly/bin/karaf 

opendaylight-user@root>ExampleProvider Session Initiated

opendaylight-user@root>feature:install odl-example-consumer 

opendaylight-user@root>ExampleConsumer Inited



