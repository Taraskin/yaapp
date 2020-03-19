create table resource(
	ID serial primary key,
	name TEXT unique not null,
	description TEXT
);


insert into resource(name, description) values('DeploymentConfiguration', 'Deployment configuration...');
insert into resource(name, description) values('ReplicationController', 'Replication Controller...');
insert into resource(name, description) values('Pod', 'Pod...');
insert into resource(name, description) values('Service', 'Service...');
insert into resource(name, description) values('Route', 'Route...');
insert into resource(name, description) values('ConfigMap', 'Configuration map...');
insert into resource(name, description) values('Secret', 'Secret...');
insert into resource(name, description) values('BuildConfiguration', 'Build configuration...');