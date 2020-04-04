 # Usage
1. Run mvn clean install

2. Run kubectl create clusterrolebinding admin --clusterrole=cluster-admin --serviceaccount=default:default

3. Build Docker images for each module, like: `docker build -t medici/employee:1.1 `3

4. In `/kubernetes` directory for each file : `kubectl apply -f <filename>.yaml` 

5. Run using skaffold docker run gcr.io/k8s-skaffold/skaffold:latest skaffold <<command>> 
 
6. DELETE ALL services  deployments configmaps ingress and secret
kubectl create clusterrolebinding admin --clusterrole=cluster-admin --serviceaccount=default:default

kubectl delete -n default deployment admin
kubectl delete -n default deployment admin-client
kubectl delete -n default deployment ambassador
kubectl delete -n default deployment gateway
kubectl delete -n default deployment department
kubectl delete -n default deployment employee
kubectl delete -n default deployment environment
kubectl delete -n default deployment organization
kubectl delete -n default deployment mongodb
kubectl delete -n default deployment manager
kubectl delete -n default service admin
kubectl delete -n default service admin-client
kubectl delete -n default service ambassador
kubectl delete -n default service gateway
kubectl delete -n default service department
kubectl delete -n default service employee
kubectl delete -n default service environment
kubectl delete -n default service organization
kubectl delete -n default service mongodb
kubectl delete -n default service manager
kubectl delete -n default ingress gateway-ingress
kubectl delete -n default configmap mongodb
kubectl delete -n default configmap admin
kubectl delete -n default secret mongodb