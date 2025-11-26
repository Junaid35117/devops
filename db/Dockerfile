# Use the latest MySQL image
FROM mysql/mysql-server:latest

# Set the working directory inside the container
WORKDIR /tmp

# Copy all .sql and .dump files from world_sql to /tmp
COPY world_sql/*.sql /tmp/
COPY world_sql/*.dump /tmp/

# Copy the main world.sql to docker-entrypoint-initdb.d
# MySQL executes any scripts in this folder on container startup
COPY world_sql/world.sql /docker-entrypoint-initdb.d/

# Set MySQL root password and allow remote connections
ENV MYSQL_ROOT_PASSWORD=example
ENV MYSQL_ROOT_HOST=%
