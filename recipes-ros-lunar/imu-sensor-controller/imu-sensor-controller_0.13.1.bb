# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Controller to publish state of IMU sensors"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin controller-interface hardware-interface pluginlib realtime-tools roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/lunar/imu_sensor_controller/0.13.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5f262dba0e8c1d83fcb90ceb1eb94b53"
SRC_URI[sha256sum] = "416a1cbedd3cac9c06f6a90383e00593f1e843d15bf78706795a3fabf1ac3da5"
S = "${WORKDIR}/ros_controllers-release-release-lunar-imu_sensor_controller-0.13.1-0"

inherit catkin
