# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package attempts to show the features of ROS step-by-step,     including us"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin message-generation message-runtime rosconsole roscpp roscpp-serialization rostime std-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_tutorials-release/archive/release/lunar/roscpp_tutorials/0.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fcaf2f4dca79d954726c26dc67545b73"
SRC_URI[sha256sum] = "5bdadf81ecfc4be9dbbcfad7462569326471dd0e7a24ed94a9adbb112f5b1604"
S = "${WORKDIR}/ros_tutorials-release-release-lunar-roscpp_tutorials-0.8.1-0"

inherit catkin
