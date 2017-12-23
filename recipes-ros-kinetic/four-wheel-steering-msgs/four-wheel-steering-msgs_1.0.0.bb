# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS messages for robots using FourWheelSteering."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/four_wheel_steering_msgs-release/archive/release/kinetic/four_wheel_steering_msgs/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3397d4d945ca403a48bfc872af278c10"
SRC_URI[sha256sum] = "263c1ae8938996b3c43a53b1c6f1d33e3576d32f2bd2258c703341bce6b3eb4e"
S = "${WORKDIR}/four_wheel_steering_msgs-release-release-kinetic-four_wheel_steering_msgs-1.0.0-0"

inherit catkin
