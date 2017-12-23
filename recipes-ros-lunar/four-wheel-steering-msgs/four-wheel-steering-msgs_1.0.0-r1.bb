# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS messages for robots using FourWheelSteering."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/four_wheel_steering_msgs-release/archive/release/lunar/four_wheel_steering_msgs/1.0.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2ce10153e60934d08f92863a26ac35a7"
SRC_URI[sha256sum] = "500e698a3f3fd865b42bb980b5a1ceed3226a28532b1c480a2ab06041b6cd886"
S = "${WORKDIR}/four_wheel_steering_msgs-release-release-lunar-four_wheel_steering_msgs-1.0.0-1"

inherit catkin
