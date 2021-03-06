# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Controller to publish state of IMU sensors"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-interface hardware-interface pluginlib realtime-tools roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/lunar/imu_sensor_controller/0.12.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b39f1ba502972595359321d27834e1f2"
SRC_URI[sha256sum] = "f25caac5bf1392e5c0868b2a8065a178b7b560797c733fa1a0db8554427709d0"
S = "${WORKDIR}/ros_controllers-release-release-lunar-imu_sensor_controller-0.12.3-0"

inherit catkin
