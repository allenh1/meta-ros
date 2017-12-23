# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Controller to publish state of IMU sensors"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-interface hardware-interface pluginlib realtime-tools roscpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/kinetic/imu_sensor_controller/0.13.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bc09b2da05c074793446980a1dacfee1"
SRC_URI[sha256sum] = "1ee08bb51fccf630ddb4aa54931b867821cf12c04240875361ac4c0bd47e2803"
S = "${WORKDIR}/ros_controllers-release-release-kinetic-imu_sensor_controller-0.13.2-0"

inherit catkin
