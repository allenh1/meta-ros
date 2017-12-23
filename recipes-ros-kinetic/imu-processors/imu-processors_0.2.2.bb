# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Processors for sensor_msgs::Imu data"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs nav-msgs roscpp sensor-msgs tf"
SRC_URI = "https://github.com/ros-gbp/imu_pipeline-release/archive/release/kinetic/imu_processors/0.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "046ba3cdb5e0d83d49eb0f8a9cd49171"
SRC_URI[sha256sum] = "ea9c8ac2d61a26e505094491a939f5db0a5e8e1a0c6c2fd8f838304818e7e387"
S = "${WORKDIR}/imu_pipeline-release-release-kinetic-imu_processors-0.2.2-0"

inherit catkin
