# Use latest MySQL image
FROM mysql/mysql-server:latest

# Set root credentials
ENV MYSQL_ROOT_PASSWORD=example
ENV MYSQL_ROOT_HOST=%

# Copy world.sql into the init folder
COPY world.sql /docker-entrypoint-initdb.d/
