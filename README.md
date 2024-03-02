Simple springboot-project used to build with jenkins and deploy on docker container.

I have mentioned the script in the jenkins-pipeline itself, but we can run save the script in git-hub repo as well.

Steps :
1) Build a maven project.
2) Test the test-classes.
3) Build docker image.
4) Push to docker hub.
5) Stop any running container with the same name.
6) Run ansible playbook to create the container with our defined configuration.


Note:
As, we have added web-hook for pipeline triggering, whenever we make a new commit, the pipeline will start running.

To avoid the updation of ngrok public url: (run with defined domain name)
ngrok http 8080 --domain=present-neat-mako.ngrok-free.app