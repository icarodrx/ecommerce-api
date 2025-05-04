data "external" "local_ip" {
  program = ["bash", "-c", "echo '{\"ip\":\"'$(curl -4 -s https://ifconfig.me/ip)'\"}'"]
}