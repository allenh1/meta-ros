# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Controller to publish state of force-torque sensors"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-interface geometry-msgs hardware-interface pluginlib realtime-tools roscpp"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/lunar/force_torque_sensor_controller/0.13.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4601f8357aaab5ba377dff0a777df5b0"
SRC_URI[sha256sum] = "0714a69a24e75b2a9f6b54b899225714d0fd2ab80d0403254b58b0c52d1db38e"
S = "${WORKDIR}/ros_controllers-release-release-lunar-force_torque_sensor_controller-0.13.1-0"

inherit catkin
