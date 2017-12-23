# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Controller to publish state of force-torque sensors"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-interface geometry-msgs hardware-interface pluginlib realtime-tools roscpp"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/kinetic/force_torque_sensor_controller/0.13.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c6275e569199f696a368c7667ee8346a"
SRC_URI[sha256sum] = "225131c715330052101bf4ac7aa656a3d2af01183af5eeac51240c79cbcb06d5"
S = "${WORKDIR}/ros_controllers-release-release-kinetic-force_torque_sensor_controller-0.13.2-0"

inherit catkin
