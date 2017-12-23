# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A set of packages that include controller interfaces, controller managers, trans"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native combined-robot-hw combined-robot-hw-tests controller-interface controller-manager controller-manager-msgs controller-manager-tests hardware-interface joint-limits-interface realtime-tools transmission-interface"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/ros_control/0.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "68d76f90ac020f4d6076e7103e4e0cb7"
SRC_URI[sha256sum] = "5b5c11c7b9a6fa66f26be4669cb8ca095bc7cd4a9acbb622fd1a462145b3ede9"
S = "${WORKDIR}/ros_control-release-release-lunar-ros_control-0.13.0-0"

inherit catkin
