FROM mysql/mysql-server:latest

# Working directory
WORKDIR /tmp

# Copy world.sql to entrypoint
COPY world.sql /docker-entrypoint-initdb.d/

# MySQL root credentials
ENV MYSQL_ROOT_PASSWORD=example
ENV MYSQL_ROOT_HOST=%
