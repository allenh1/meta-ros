# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A set of packages that include controller interfaces, controller managers, trans"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native combined-robot-hw combined-robot-hw-tests controller-interface controller-manager controller-manager-msgs controller-manager-tests hardware-interface joint-limits-interface realtime-tools transmission-interface"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/kinetic/ros_control/0.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "605dbdf975e67df9c4ac65ad07b013d3"
SRC_URI[sha256sum] = "bbb8df8fffa6c2caf156d0454d3c74e4f09a4f6ec87a86f5999fc690028eaaa1"
S = "${WORKDIR}/ros_control-release-release-kinetic-ros_control-0.13.0-0"

inherit catkin
