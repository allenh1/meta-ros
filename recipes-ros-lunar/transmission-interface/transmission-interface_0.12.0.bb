# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Transmission Interface."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Modified-BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=9fe507396161b9e47d2b1e01c422787a"

DEPENDS = "catkin cmake-modules hardware-interface pluginlib roscpp libtinyxml"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/transmission_interface/0.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c57d36469f26ca83935b43fafc4d8fde"
SRC_URI[sha256sum] = "c3799c0452099ed0fec3f8ee4977666a001e004e72a597b04f49976040623e43"
S = "${WORKDIR}/ros_control-release-release-lunar-transmission_interface-0.12.0-0"

inherit catkin
