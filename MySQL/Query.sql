
create database restfulAPI;
use restfulAPI;

show tables;

drop database restfulAPI;

select * from restfulAPI.memory_info;

##hard-code worker info to table "memory_info" in database "restfulAPI"
insert into restfulAPI.memory_info (id, worker_id, worker_name, usedcpu, totalram, usedram, usedrampercentage, totalvmem, usedvmem, usedvmempercentage, gpuname, usegpu) values(1, 0, 'host p2_pc', 0, 125.9, 1.726, 0.01, 261.9, 1.726, 0, 'GeForce RTX 2070', 0);
insert into restfulAPI.memory_info (id, worker_id, worker_name, usedcpu, totalram, usedram, usedrampercentage, totalvmem, usedvmem, usedvmempercentage, gpuname, usegpu) values(2, 1, 'host p1_01', 3, 996, 174.3, 0.17, 1473, 198.3, 0.13, '', 0);
insert into restfulAPI.memory_info (id, worker_id, worker_name, usedcpu, totalram, usedram, usedrampercentage, totalvmem, usedvmem, usedvmempercentage, gpuname, usegpu) values(3, 2, 'host p2_00', 32, 1008, 37.32, 0.03, 1485, 157.3, 0.1, 'GeForce RTX 2080 Ti', 0);
insert into restfulAPI.memory_info (id, worker_id, worker_name, usedcpu, totalram, usedram, usedrampercentage, totalvmem, usedvmem, usedvmempercentage, gpuname, usegpu) values(4, 5, 'host filecoin', 48, 244, 32.55, 0.13, 352, 152.6, 0.43, 'GeForce GTX 1080 Ti', 0);
insert into restfulAPI.memory_info (id, worker_id, worker_name, usedcpu, totalram, usedram, usedrampercentage, totalvmem, usedvmem, usedvmempercentage, gpuname, usegpu) values(5, 4, 'host p1_pc', 4, 136, 20.8, 0.15, 298, 15, 0.05, 'GeForce RTX 2060', 1);
insert into restfulAPI.memory_info (id, worker_id, worker_name, usedcpu, totalram, usedram, usedrampercentage, totalvmem, usedvmem, usedvmempercentage, gpuname, usegpu) values(6, 3, 'host p3_p0', 10, 225.9, 37.7, 0.17, 461.9, 48.7, 0.1, 'GeForce GTX 1070', 1);

update restfulAPI.memory_info 
set worker_id = 0
where id = 1;

#####################################
##Record actions and result to table "call_info" in database "restfulAPI"

select * from restfulAPI.call_info;

alter table restfulAPI.call_info
drop column local_date_time;

delete from restfulAPI.call_info
where id = 2;
