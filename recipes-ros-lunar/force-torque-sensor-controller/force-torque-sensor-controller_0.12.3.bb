# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Controller to publish state of force-torque sensors"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin controller-interface geometry-msgs hardware-interface pluginlib realtime-tools roscpp"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/lunar/force_torque_sensor_controller/0.12.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3fefbe4d3fca054171012c0526dcfe8b"
SRC_URI[sha256sum] = "00a0777c1f3d481db3d3383cc218901cf096fd6e31944863ce0c2ebac8010128"
S = "${WORKDIR}/ros_controllers-release-release-lunar-force_torque_sensor_controller-0.12.3-0"

inherit catkin
