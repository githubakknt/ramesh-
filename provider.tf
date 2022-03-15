resource "aws_security_group" "my_secuirity_grp" {
  name        = "allow_web_access"
  description = "allow inbound traffic"
  vpc_id      = aws_vpc.mine_vpc.id
}

  resource "aws_subnet" "main" {
    vpc_id     = aws_vpc.mine_vpc.id
    cidr_block = "170.0.0.0/16"




    tags = {
      "Name" = "Application-1-sg"
    }
  }