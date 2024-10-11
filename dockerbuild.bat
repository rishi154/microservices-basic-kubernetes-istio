ECHO "Started creating docker images"

cd customer
ECHO "creating image for customer"
docker build -t "rishi154/customer:0.0.1" .

cd ../merchant
ECHO "creating image for merchant"
docker build -t "rishi154/merchant:0.0.1" .

cd ../product
ECHO "creating image for product"
docker build -t "rishi154/product:0.0.1" .

cd ../transaction
ECHO "creating image for transaction"
docker build -t "rishi154/transaction:0.0.1" .