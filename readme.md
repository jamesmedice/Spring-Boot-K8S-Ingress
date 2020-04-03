 # Usage
1. Run mvn clean install

2. Run kubectl create clusterrolebinding admin --clusterrole=cluster-admin --serviceaccount=default:default

3. Build Docker images for each module, like: `docker build -t medici/employee:1.1 `3

4. In `/kubernetes` directory for each file : `kubectl apply -f <filename>.yaml` 

5. Run using skaffold docker run gcr.io/k8s-skaffold/skaffold:latest skaffold <<command>> 
 