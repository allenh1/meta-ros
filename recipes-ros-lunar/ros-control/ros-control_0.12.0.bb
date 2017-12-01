# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A set of packages that include controller interfaces, controller managers, trans"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native combined-robot-hw combined-robot-hw-tests controller-interface controller-manager controller-manager-msgs controller-manager-tests hardware-interface joint-limits-interface realtime-tools transmission-interface"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/ros_control/0.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a8eddf88ce1852b975fc4c89352c2ee2"
SRC_URI[sha256sum] = "26c973ddfa3cc9bd80140b5cc5bbe881a354e3c5f10d20f85d06a89671ba14f2"
S = "${WORKDIR}/ros_control-release-release-lunar-ros_control-0.12.0-0"

inherit catkin
