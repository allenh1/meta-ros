# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Hardware Interface base class."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/kinetic/hardware_interface/0.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "24f87ee2a6adcd7dfff1452473572f2e"
SRC_URI[sha256sum] = "176f112a0d371d4090688da2f14a601a87f121bf0a431355c6fe78ca1791efd1"
S = "${WORKDIR}/ros_control-release-release-kinetic-hardware_interface-0.13.0-0"

inherit catkin
